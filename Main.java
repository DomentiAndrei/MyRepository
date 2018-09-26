import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        // Мапа для хранения значений логин/пароля (логин выступает в роли ключа)
        Map<String, String> userMap = new HashMap<String, String>();

        // Загружаем wookbook
        Workbook workBook = WorkbookFactory.create(new File("src\\main\\resources\\input_data.xls"));

        // Открываем первый лист
        Sheet sheet = workBook.getSheetAt(0);

        // Проходимся по рядам и берем только 0-ю и 1-ю ячейку
        for(Row row : sheet){
            Cell loginCell = row.getCell(0);
            Cell passwordCell = row.getCell(1);
            userMap.put(loginCell.getStringCellValue(), passwordCell.getStringCellValue());
        }

        // Вывожу hashmap
        for(Map.Entry<String, String> entry : userMap.entrySet()){
            System.out.println("Login : " + entry.getKey() + " Password : " + entry.getValue());
        }

        workBook.close();

    }

}
