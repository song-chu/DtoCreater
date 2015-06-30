import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 *
 * @author works780
 *
 */
public class EmulFileSheetNameWalker {

	/** ファイル情報Map
	 * キー：ファイル名
	 *
	 */
	private List<EmulFileSheetInfo> fileInfoList = new ArrayList<EmulFileSheetInfo>();

	private String[] excludeDirNames = { ".svn" };

	/**
	 * ディレクトリを探索し、ファイル情報をリストに格納する。
	 * @param path
	 */
	public void walk(String path) throws Exception {

		File root = new File(path);
		File[] list = root.listFiles();

		if (list == null)
			return;

		for (File f : list) {

			if (f.isDirectory()) {
				if (isExcludeDir(f)) {
					continue;
				}

				walk(f.getAbsolutePath());

			} else {

				String fileName = f.getName();

				if (!"結果データ.xls".equals(fileName)) {
					continue;
				}

				TreeSet<String> sheetNameList = getSheetNameList(f);

				EmulFileSheetInfo fileInfo = new EmulFileSheetInfo();

				fileInfo.setSheetNameList(sheetNameList);
				fileInfo.setPath(f.getAbsolutePath());
				fileInfo.setMethodName(f.getParentFile().getName());
				fileInfo.setClassName(f.getParentFile().getParentFile().getName());

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

		try {

			EmulFileSheetNameWalker fw = new EmulFileSheetNameWalker();
			fw.walk(rootDir);
			fw.makeXls(outputFilePath);

		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
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
			HSSFRow header = sheet.createRow(0);

			//セルオブジェクトの作成（セル番号は0スタート）
			//引数はshort型でキャストしなければならない点に注意
			HSSFCell cell1 = header.createCell(0);
			HSSFCell cell2 = header.createCell(1);
			HSSFCell cell3 = header.createCell(2);

			//セルに値を設定する
			cell1.setCellValue("テストクラス");
			cell2.setCellValue("テストメソッド");
			cell3.setCellValue("シート名");

			for (int i = 1; i < fileInfoList.size(); i++) {

				EmulFileSheetInfo fileInfo = fileInfoList.get(i);

				HSSFRow dataRow = sheet.createRow(i);
				HSSFCell c_class = dataRow.createCell(0);
				HSSFCell c_method = dataRow.createCell(1);
				HSSFCell c_sheet = dataRow.createCell(2);

				c_class.setCellValue(fileInfo.getClassName());
				c_method.setCellValue(fileInfo.getMethodName());
				c_sheet.setCellValue(toCsv(fileInfo.getSheetNameList()));
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

	private String toCsv(Set<String> list) {
		StringBuilder csv = new StringBuilder();
		for (String str : list) {
			if (csv.length() > 0) {
				csv.append(',');
			}

			csv.append(str);
		}

		return csv.toString();
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

	/**
	 *
	 * @param xls
	 */
	private static TreeSet<String> getSheetNameList(File xls) throws Exception {

		TreeSet<String> sheetNameList = new TreeSet<String>();

		if (!xls.exists()) {
			return sheetNameList;
		}

		POIFSFileSystem input = new POIFSFileSystem(new FileInputStream(xls));
		HSSFWorkbook wb = new HSSFWorkbook(input);

		int numberOfSheets = wb.getNumberOfSheets();

		for (int i = 0; i < numberOfSheets; i++) {
			String sheetName = wb.getSheetName(i);
			sheetNameList.add(sheetName);
		}

		return sheetNameList;
	}

}