import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public final class Poi100000 {
	private static final int READ_LINE_START = 5;

	public Poi100000() {
	};

	public static void main(String[] args) {
		Poi100000 poi = new Poi100000();
		poi.copySheet(args[0], args[1], args[2], args[3], args[4], args[5]);
	}

	public void copySheet(String sheetName, String inXlsPath, String outXlsPath, String csvFilePath, String loop,
			String subLoop) {
		POIFSFileSystem filein;
		FileOutputStream out = null;
		BufferedReader inBuffer = null;

		try {
			filein = new POIFSFileSystem(new FileInputStream(inXlsPath));
			HSSFWorkbook wb = new HSSFWorkbook(filein);

			int READ_TRANSFER_INPT_PLUS_ROW_START = 64;//
			int READ_TRANSFER_INPT_PLUS_ROW_END = 72;//

			int loopCount = Integer.parseInt(loop);
			int subLoopCount = Integer.parseInt(subLoop);

			for (int i = 0; i < loopCount; i++) {
				for (int j = 0; j < subLoopCount; j++) {

					if (i == 0 && j == 0) {
						continue;
					}

					wb.cloneSheet(0);

					String newSheetName = "";

					if ("detailsReference".equals(sheetName)) {
						newSheetName = sheetName + (i + 1) + "_" + (j + 1);
					} else {
						newSheetName = sheetName + (i + 1);
					}

					wb.setSheetName((i * subLoopCount) + j, newSheetName);
				}
			}

			inBuffer = new BufferedReader(
					new InputStreamReader(new FileInputStream(new File(csvFilePath)), "Shift_JIS"));// 省略するとシステム標準

			String line = inBuffer.readLine();

			for (int i = 0; i < loopCount; i++) {
				line = inBuffer.readLine();

				if (line == null || line.length() == 0) {
					break;
				}
				List<String> list = split(line, ',');

				//BANK_CODE,ACCOUNT_NUM,ACCOUNT_NAME,EBA_ACCNT
				String bankCode = list.get(0);
				String accountNum = list.get(1);
				String accountName = list.get(2);
				String ebaAccnt = list.get(3);

				HSSFSheet sheet = wb.getSheetAt(i * subLoopCount);

				this.setBankCode(sheet, bankCode);
				this.setEbaAccnt(sheet, ebaAccnt);
				this.setAccountNum(sheet, accountNum);
				this.setAccountName(sheet, accountName);
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

	private void setBankCode(HSSFSheet sheet, String value) {
		HSSFRow row = sheet.getRow(5);
		HSSFCell cell = row.getCell(5);
		cell.setCellValue(value);
	}

	private void setEbaAccnt(HSSFSheet sheet, String value) {
		HSSFRow row = sheet.getRow(6);
		HSSFCell cell = row.getCell(5);
		cell.setCellValue(value);
	}

	private void setAccountName(HSSFSheet sheet, String value) {
		HSSFRow row = sheet.getRow(17);
		HSSFCell cell = row.getCell(5);
		cell.setCellValue(value);
	}

	private void setAccountNum(HSSFSheet sheet, String value) {
		HSSFRow row = sheet.getRow(21);
		HSSFCell cell = row.getCell(5);
		cell.setCellValue(value);
	}

	/**
	 * 文字列を指定した区切り文字で区切って、リストに変換する。
	 * @param str	文字列
	 * @param delimeter 区切り文字
	 * @return	リスト
	 */
	public static List<String> split(String str, char delimeter) {
		boolean toggle = false;
		List<String> tokens = new ArrayList<String>();

		if (str == null || str.length() == 0) {
			return tokens;
		}

		int beginIndex = 0;
		int endIndex = 0;

		for (int i = 0; i < str.length(); i++) {

			char chr = str.charAt(i);

			if (chr == '"' || chr == '\'') {
				if (toggle) {
					endIndex = i;

				} else {
					beginIndex = i + 1;
					endIndex = i + 1;
				}

				toggle = !(toggle);

			} else if (chr == delimeter) {
				if (toggle) {
					continue;
				} else {
					String token = str.substring(beginIndex, endIndex);
					tokens.add(token);
					beginIndex = i + 1;
					endIndex = i + 1;
				}

			} else {
				endIndex = i + 1;
			}
		}

		String token = str.substring(beginIndex, endIndex);
		tokens.add(token);

		return tokens;
	}
}
