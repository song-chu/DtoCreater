package test.code.creator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import test.code.creator.enums.BookType;
import test.code.creator.record.TestCodeBean;
import test.codemodel.Env;
import test.codemodel.TestMethod;

public class DetailCodeTestClassCreator {

	public DetailCodeTestClassCreator() {
	}

	public static void main(String[] args) {

		BufferedReader br = null;

		try {
			DetailCodeTestClassCreator logic = new DetailCodeTestClassCreator();

			//ファイルを読み込む
			br = new BufferedReader(new InputStreamReader(new FileInputStream(logic.getCsvPath()), "MS932"));

			List<TestCodeBean> beans = new ArrayList<TestCodeBean>();

			//読み込んだファイルを１行ずつ処理する
			String line;

			while ((line = br.readLine()) != null) {
				TestCodeBean bean = getBean(line);
				beans.add(bean);
			}

			TestMethod method = new TestMethod("DetailCodeTest");
			method.execute(beans);

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

	private static TestCodeBean getBean(String line) {

		TestCodeBean bean = new TestCodeBean();

		String arr[] = line.split(",");

		bean.setBookType(BookType.getBookType(arr[0]));
		bean.setTestMethodName(arr[1]);

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
