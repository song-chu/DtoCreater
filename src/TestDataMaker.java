import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 * 最初シートをコピーしてシートを増やす
 * @author works780
 *
 */
public final class TestDataMaker {

	/**
	 * メイン
	 * @param args	起動パラメータ
	 */
	public static void main(String[] args) {
		TestDataMaker poi = new TestDataMaker();
		poi.copySheet(args[0], args[1], args[2]);
	}

	/**
	 *
	 * @param inXlsPath    	入力電文ファイル
	 * @param outXlsPath	出力電文ファイル
	 * @param xmlFilePath	口座XML
	 */
	public void copySheet(String inXlsPath, String outXlsPath, String xmlFilePath) {

		POIFSFileSystem filein;
		FileOutputStream out = null;
		BufferedReader inBuffer = null;

		try {
			filein = new POIFSFileSystem(new FileInputStream(inXlsPath));
			HSSFWorkbook wb = new HSSFWorkbook(filein);

			File testDataFile = new File(xmlFilePath);
			AccData testData = new AccData(testDataFile);
			List<Map<String, String>> testDataMapList = testData.getTestDataMapList();

			int loopCount = testDataMapList.size();

			String sheetName = null;

			for (int i = 0; i < loopCount; i++) {

				if (sheetName == null) {
					sheetName = wb.getSheetName(0);
				} else {
					String newSheetName = getNewSheetName(sheetName, i);
					wb.cloneSheet(0);
					wb.setSheetName(i, newSheetName);
				}

				Map<String, String> testDataMap = testDataMapList.get(i);

				//BANK_CODE,ACCOUNT_NUM,ACCOUNT_NAME,EBA_ACCNT
				String bankCode = testDataMap.get("EBA_BANK_CODE");
				String ebaAccnt = testDataMap.get("EBA_ACCNT");

				HSSFSheet sheet = wb.getSheetAt(i);

				this.setBankCode(sheet, bankCode);
				this.setEbaAccnt(sheet, ebaAccnt);
			}

			out = new FileOutputStream(outXlsPath);
			wb.write(out);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (inBuffer != null) {
					inBuffer.close(); //(8)読み込みストリームのクローズ
				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}

	/**
	 * コピー先シート名取得
	 * @param sheetName	ワークシート名
	 * @param index		インデックス
	 * @return	コピー先シート名
	 */
	private String getNewSheetName(String sheetName, int index) {

		char[] charArray = sheetName.toCharArray();

		StringBuilder sb = new StringBuilder();

		for (char ch : charArray) {

			if (isNumber(ch)) {
				sb.append((index + 1));

			} else if (ch == '_') {
				sb.append(ch);
				sb.append('1');
				break;

			} else {
				sb.append(ch);
			}
		}

		return sb.toString();
	}

	/**
	 * 数字か判断
	 * @param ch	文字
	 * @return	true 数字
	 */
	private boolean isNumber(char ch) {
		if ('0' <= ch && ch <= '9') {
			return true;
		}
		return false;
	}

	/**
	 * 銀行コードを上書きする
	 * @param sheet	シート
	 * @param value	銀行コード
	 */
	private void setBankCode(HSSFSheet sheet, String value) {
		HSSFRow row = sheet.getRow(5);
		HSSFCell cell = row.getCell(5);
		cell.setCellValue(value);
	}

	/**
	 * eBAgent口座番号を上書きする
	 * @param sheet	シート
	 * @param value	eBAgent口座番号
	 */
	private void setEbaAccnt(HSSFSheet sheet, String value) {
		HSSFRow row = sheet.getRow(6);
		HSSFCell cell = row.getCell(5);
		cell.setCellValue(value);
	}
}
