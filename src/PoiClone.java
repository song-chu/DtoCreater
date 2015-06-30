import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public final class PoiClone {
	private static final int READ_LINE_START = 5;

	public PoiClone() {
	};

	public static void main(String[] args) {
		PoiClone poi = new PoiClone();
		poi.copySheet(args[0], args[1]);
	}

	public void copySheet(String inXlsPath, String outXlsPath) {
		POIFSFileSystem filein;
		FileOutputStream out = null;

		try {
			filein = new POIFSFileSystem(new FileInputStream(inXlsPath));
			HSSFWorkbook wb = new HSSFWorkbook(filein);

			int numberOfSheets = wb.getNumberOfSheets();

			for (int i = (numberOfSheets - 1); i >= 0; i--) {
				HSSFSheet existSheet = wb.getSheetAt(i);

				String sheetName = existSheet.getSheetName();

				int sheetSeq = getSheetSeq(sheetName);
				int newSheetSeq = (sheetSeq * 2) - 1;

				String newSheetName = "detailsReReference" + newSheetSeq + "_1";

				wb.setSheetName(i, newSheetName);
			}

			for (int i = 0; i < numberOfSheets; i++) {
				HSSFSheet cloneSheet = wb.cloneSheet(i);

				String sheetName = cloneSheet.getSheetName();

				int sheetSeq = getSheetSeq(sheetName);
				int newSheetSeq = sheetSeq + 1;

				String newSheetName = "detailsReReference" + newSheetSeq + "_1";

				wb.setSheetName(numberOfSheets + i, newSheetName);
			}

			numberOfSheets = wb.getNumberOfSheets();

			for (int i = 0; i < numberOfSheets; i++) {
				HSSFSheet sheet = wb.getSheetAt(i);

				setBankCode(sheet, "0009");

				String sheetName = sheet.getSheetName();
				int sheetSeq = getSheetSeq(sheetName);

				int mod = sheetSeq % 2;

				if (mod == 0) {
					wb.setSheetOrder(sheetName, (sheetSeq - 1));
				}
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

	private int getSheetSeq(String sheetName) {
		String seqName = sheetName.substring(18);
		String[] arr = seqName.split("_");
		int sheetSeq = Integer.parseInt(arr[0]);
		return sheetSeq;
	}

	private void setBankCode(HSSFSheet sheet, String value) {
		HSSFRow row = sheet.getRow(5);
		HSSFCell cell = row.getCell(5);
		cell.setCellValue(value);
	}
}
