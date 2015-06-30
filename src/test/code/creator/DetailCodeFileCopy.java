package test.code.creator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.io.FileUtils;

import test.code.creator.enums.EmulFileType;
import test.code.creator.record.DetailCodeBean;
import test.codemodel.Env;

public class DetailCodeFileCopy {

	public DetailCodeFileCopy() {
	}

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			DetailCodeFileCopy logic = new DetailCodeFileCopy();

			//ファイルを読み込む
			br = new BufferedReader(new InputStreamReader(new FileInputStream(logic.getCsvPath()), "MS932"));

			//読み込んだファイルを１行ずつ処理する
			String line;

			while ((line = br.readLine()) != null) {

				DetailCodeBean bean = getDetailCodeBean(line);

				String testClassName = bean.getTestClassName();
				String testMethodName = bean.getTestMethodName();

				File destDir = getDestDir(testClassName, testMethodName);

				FileUtils.forceMkdir(destDir);

				if (bean.isDr()) {
					copyFile(testClassName, testMethodName, EmulFileType.DR.getName());
				}
				if (bean.isReDr()) {
					copyFile(testClassName, testMethodName, EmulFileType.RE_DR.getName());
				}
				if (bean.isPreBr()) {
					copyFile(testClassName, testMethodName, EmulFileType.PRE_BR.getName());
				}
				if (bean.isBr()) {
					copyFile(testClassName, testMethodName, EmulFileType.BR.getName());
				}

				copyFile(testClassName, testMethodName, "投入データ.xls");
				copyFile(testClassName, testMethodName, "結果データ.xls");
			}

		} catch (Exception ex) {
			//例外発生時処理
			ex.printStackTrace();
		} finally {

			if (br != null) {
				try {
					//終了処理
					br.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}
	}

	private static DetailCodeBean getDetailCodeBean(String line) {

		DetailCodeBean bean = new DetailCodeBean();

		String arr[] = line.split(",");

		bean.setTestClassName(arr[0]);
		bean.setTestMethodName(arr[1]);
		bean.setDr("○".equals(arr[2]));
		bean.setReDr("○".equals(arr[3]));
		bean.setPreBr("○".equals(arr[4]));
		bean.setBr("○".equals(arr[5]));

		return bean;
	}

	private static File getDestDir(String testClassName, String testMethodName) {
		return new File(getDestDirName(testClassName, testMethodName));
	}

	private static String getDestDirName(String testClassName, String testMethodName) {
		return Env.DIR_RESOURCE.value() + "/" + testClassName + "/" + testMethodName;
	}

	private static void copyFile(String testClassName, String testMethodName, String fileName) throws Exception {
		File srcFile = new File(Env.DIR_TEST_DATA_SOURCE.value() + "/" + fileName);
		File destFile = new File(getDestDirName(testClassName, testMethodName) + "/" + fileName);

		FileUtils.copyFile(srcFile, destFile);
	}

	private String getCsvPath() {
		return Env.DIR_TEST_DATA_SOURCE.value() + "/" + this.getClass().getSimpleName() + ".csv";
	}
}
