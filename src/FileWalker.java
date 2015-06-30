import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author works780
 *
 */
public class FileWalker {

	/** ファイル情報Map
	 * キー：ファイル名
	 *
	 */
	private List<FileInfo> fileInfoList = new ArrayList<FileInfo>();

	private String[] excludeDirNames = { ".svn" };

	/**
	 * ディレクトリを探索し、ファイル情報をリストに格納する。
	 * @param path
	 */
	public void walk(String path) {

		File root = new File(path);
		File[] list = root.listFiles();

		if (list == null)
			return;

		for (File f : list) {

			FileInfo fileInfo = new FileInfo();

			if (f.isDirectory()) {
				if (isExcludeDir(f)) {
					continue;
				}

				walk(f.getAbsolutePath());
				System.out.println("Dir:" + f.getAbsoluteFile());
			} else {
				fileInfo.setName(f.getName());
				fileInfo.setPath(f.getAbsolutePath());

				fileInfoList.add(fileInfo);
				System.out.println("File:" + f.getAbsoluteFile());
			}
		}
	}

	/**
	 * メイン処理
	 * @param args	起動パラメータ
	 */
	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("Please input root directory and output file path.");
			return;
		}

		String rootDir = args[0];
		String outputFilePath = args[1];

		FileWalker fw = new FileWalker();
		fw.walk(rootDir);
		fw.makeXls(outputFilePath);
	}

	/**
	 * ファイル情報をExcelへ出力する
	 * @param outputFilePath	出力ファイルパス
	 */
	public void makeXls(String outputFilePath) {
		FileOutputStream out = null;

		try {

			//新規ワークブックを作成する
			HSSFWorkbook wb = new HSSFWorkbook();
			out = new FileOutputStream(outputFilePath);
			//新規ワークシートを作成する
			HSSFSheet sheet = wb.createSheet();

			//作成したシート名を変更
			//日本語シート名を指定する場合には
			//エンコーディング設定は必須
			wb.setSheetName(0, "sheet1");

			//行オブジェクトの作成（行番号は0スタート）
			HSSFRow header = sheet.createRow(1);

			//セルオブジェクトの作成（セル番号は0スタート）
			//引数はshort型でキャストしなければならない点に注意
			HSSFCell cellB1 = header.createCell(0);
			HSSFCell cellC2 = header.createCell(1);

			//セルに値を設定する
			cellB1.setCellValue("ファイル名");
			cellC2.setCellValue("ファイルパス");

			for (int i = 0; i < fileInfoList.size(); i++) {

				FileInfo fileInfo = fileInfoList.get(i);

				HSSFRow dataRow = sheet.createRow(i + 2);
				HSSFCell cellB = dataRow.createCell(0);
				HSSFCell cellC = dataRow.createCell(1);

				cellB.setCellValue(fileInfo.getName());
				cellC.setCellValue(fileInfo.getPath());
			}

			//作成したワークブックを保存する
			wb.write(out);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}

	/**
	 * 除外ディレクトリなのか
	 * @param f	ディレクトリ
	 * @return	true 除外ディレクトリ
	 */
	private boolean isExcludeDir(File f) {

		if (!f.isDirectory()) {
			return false;
		}

		for (String excludeDirName : excludeDirNames) {
			if (excludeDirName.equals(f.getName())) {
				return true;
			}
		}
		return false;
	}
}