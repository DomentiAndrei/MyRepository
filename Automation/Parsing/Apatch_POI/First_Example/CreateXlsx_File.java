package Apache_POI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateXlsx_File {

	public static void main(String[] args) throws IOException {

		writeXlsxUsingA_P();
	}

	public static void writeXlsxUsingA_P() throws IOException {

		XSSFWorkbook workB = new XSSFWorkbook();

		XSSFSheet sheet = workB.createSheet("number");

		ArrayList<Object[]> data = new ArrayList<Object[]>();
		data.add(new Integer[] { 1, 2, 3, 4, 5 });
		data.add(new String[] { "positive", "negativ", "fractional numbers", "roman numerals", "decimal numbers" });
		
		data.add(new Object[] { "1", "-1", "1/1", "I" });
		data.add(new Integer[] { 2, -2, 2/2 }); // "2/2" in integer -> in table will display "1"
		data.add(new Object[] { "3", "-3", "3/3", "III" });
		data.add(new String[] { "4", "-4", "4/4", "IV" });
		data.add(new Object[] { "", "", "5/5", "V" });
		data.add(new Object[] { 6, -6, "", "V" });
		data.add(new Double[] { 2.3});
		data.add(new Short [] {2,1});

		int row_n = 0;
		for (Object[] count : data) {
			Row row = sheet.createRow(row_n++);

			int cell_n = 0;
			for (Object object : count) {
				Cell cell = row.createCell(cell_n++);
				
				if (object instanceof String)
					cell.setCellValue((String) object);
				
				else if (object instanceof Double)
					cell.setCellValue((Double) object);
				
				else if (object instanceof Integer)
					cell.setCellValue((Integer) object);

				else if (object instanceof Short)
					cell.setCellValue((Short) object);
			}
		}

		try {
			FileOutputStream output = new FileOutputStream(new File("C:\\Users"
					+ "\\Andrei\\Desktop\\Java_Files\\numbers.xlsx"));
			workB.write(output);
			output.close();
			System.out.println("File has been written");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
