package Apache_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C_File_Parse {

	public static void main(String[] args) {

		try {
			FileInputStream excel = new FileInputStream(
					new File("C:\\Users\\Andrei\\Desktop\\Java_Files\\Actors.xlsx"));
			Workbook wbook = new XSSFWorkbook(excel);
			Sheet data = wbook.getSheetAt(0);
			Iterator<Row> iterat = data.iterator();

			while (iterat.hasNext()) {
				Row fRow = iterat.next();
				Iterator<Cell> fCell = fRow.iterator();
				System.out.println("");
				while (fCell.hasNext()) {
					Cell cell = fCell.next();

					if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
						String a = cell.getStringCellValue();
						System.out.print(a + ", ");

					} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
						double a = cell.getNumericCellValue();
						System.out.print(a + ", ");
					}
				}
				System.out.println("");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
