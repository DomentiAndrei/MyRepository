package Apache_POI;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C_File_for_Parse {

	public static void main(String[] args) throws Exception {
		createFile();
	}

	public static void createFile() throws Exception {

		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();

		ArrayList<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] { "", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		data.add(new Object[] { "", "LastName", "FirstName", "Age", "Sex", "Position", "Salary", "Address", "City",
				"Country", "PostalCode" });
		data.add(new Object[] { "1", "Leonardo", "DiCaprio", "43", "M", "Actor", "********", "RECTOR PL", "Los Angeles",
				"USA", "10280" });
		data.add(new Object[] { "2", "Johnny", "Depp", "54", "M", "Actor", "********", "Fifth Avenue", "California",
				"USA", "023212" });
		data.add(new Object[] { "3", "Keanu", "Reeves", "53", "M", "Actor", "******", "Broadway", "	Hollywood Hills",
				"USA", "00213", });
		data.add(new Object[] { "4", "Bruce", "Willis", "63", "M", "Actor", "*******", "Eighth avenues", "Los Angeles",
				"USA", "90912" });
		data.add(new Object[] { "5", "Danila", "Kozlovsky", "32", "M", "Actor", "******", "Arbat", "Moscow", "Russia",
				"R32434" });
		data.add(new Object[] { "6", "Nikita", "Mikhalkov", "72", "M", "Filmmaker, Actor", "100650", "Smolenskaya", "Moscow",
				"Russia", "43542345" });
		data.add(new Object[] { "7", "Armen", "Dzhigarkhanyan", "82", "M", "Actor", "120500", "Arbatskaya Square", "Moscow",
				"Russia", "L3452" });

		int rowN = 0;
		for (Object[] count : data) {
			Row row = sheet.createRow(rowN++);
			
			int cellN = 0;
			for (Object obj : count) {
				Cell cell = row.createCell(cellN++);

				if (obj instanceof String)
					cell.setCellValue((String) obj);
				
				else if (obj instanceof Integer)
					cell.setCellValue((Integer) obj);
			}
		}

		try {
			FileOutputStream output = new FileOutputStream(new File("C:\\Users\\Andrei\\Desktop\\Java_Files\\Actors.xlsx"));
			book.write(output);
			output.close();
			System.out.println("Data introduced");
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
