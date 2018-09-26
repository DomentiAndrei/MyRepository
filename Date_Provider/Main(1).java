import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(java.lang.String[] args) throws IOException {

        // Мапа для хранения значений логин/пароля (логин выступает в роли ключа)
        Map<String, String> userMap = new HashMap<java.lang.String, java.lang.String>();

        // Загружаем wookbook
        Workbook workBook = WorkbookFactory.create(new File("src\\main\\resources\\input_data.xls"));

        // Открываем первый лист
        Sheet sheet = workBook.getSheetAt(0);

        int numberOfCols = sheet.getRow(0).getPhysicalNumberOfCells();
        int numberOfRows = sheet.getPhysicalNumberOfRows();

        Object[][] objects = new Object[numberOfRows][numberOfCols];

        // Проходимся по рядам и берем только 0-ю и 1-ю ячейку
        for(int i = 0; i < numberOfRows; i++){
            for(int j = 0; j < numberOfCols; j++){
                objects[i][j] = sheet.getRow(i).getCell(j);
            }
        }

        workBook.close();

    }

}
