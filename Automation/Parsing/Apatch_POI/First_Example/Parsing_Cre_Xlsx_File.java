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

public class Parsing_Cre_Xlsx_File {

	

	public static void main(String[] args) {

		try {

			FileInputStream excelF = new FileInputStream(new File("C:\\Users\\Andrei\\Desktop\\Java_Files\\numbers.xlsx"));
			Workbook workB = new XSSFWorkbook(excelF);
			Sheet datatypesSheet = workB.getSheetAt(0);
			Iterator<Row> iterator = datatypesSheet.iterator();

			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				Iterator<Cell> cellIt = currentRow.iterator();
				System.out.println("");
				while (cellIt.hasNext()) {
					Cell currentCell = cellIt.next();

					if (currentCell.getCellType() == Cell.CELL_TYPE_STRING) {
						System.out.print(currentCell.getStringCellValue() + "  " );
						
					} else if (currentCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
						System.out.print(currentCell.getNumericCellValue() + "  " );
					}
					
				}
				System.out.println("");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
