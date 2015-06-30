import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public final class PoiSetBankCode {
	private static final int READ_LINE_START = 5;

	public PoiSetBankCode() {
	};

	public static void main(String[] args) {
		PoiSetBankCode poi = new PoiSetBankCode();
		poi.copySheet(args[0], args[1]);
	}

	public void copySheet(String inXlsPath, String outXlsPath) {
		POIFSFileSystem filein;
		FileOutputStream out = null;

		try {
			filein = new POIFSFileSystem(new FileInputStream(inXlsPath));
			HSSFWorkbook wb = new HSSFWorkbook(filein);

			int numberOfSheets = wb.getNumberOfSheets();

			for (int i = 0; i < numberOfSheets; i++) {
				HSSFSheet sheet = wb.getSheetAt(i);
				setBankCode(sheet, "0009");
			}

			out = new FileOutputStream(outXlsPath);
			wb.write(out);

		} catch (Exception e) {
			e.printStackTrace();
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

	private void setBankCode(HSSFSheet sheet, String value) {
		HSSFRow row = sheet.getRow(5);
		HSSFCell cell = row.getCell(5);
		cell.setCellValue(value);
	}
}
