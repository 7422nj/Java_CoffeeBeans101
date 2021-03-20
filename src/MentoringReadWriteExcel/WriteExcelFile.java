package MentoringReadWriteExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    //Here are basic steps for writing en excel file:
    // 1. create a workbook XSSFWorkbook
    // 2. create sheet XSSFSheet

    //Repeat the following steps using an iterator <-loop through the operations defined
    // 1. create a row in our sheet <- sheet.createRow()
    // 2. create cells in our row <- row.createCell()
    // 3. write an outputStream <- workbook.write(path to excel file);
    // 4. close the outputStream <- fileOutputStream.close()

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Pizza");

        Object[][] bookData = { //Object Array
                {"Linda", "Make", "Me A", "Sandwich", 505},
                {"Jesus", "Java", "Is", "Dangerous", 101},
                {"Momma", "Look", "No", "Hands", 911},
        };
        int rowCount = 0;
        for (Object[] aBook : bookData) {
            Row row = sheet.createRow(++rowCount);
            int columnCount = 0;
            for (Object field : aBook) {
                Cell cell = row.createCell(++columnCount);

                //ask to return string
                if (field instanceof String) { // asked to see if you see a string than

                    cell.setCellValue((String) field);// set the value in the cell as a string value

                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try (FileOutputStream outputStream = new FileOutputStream("DataTest/PizzaPizza.xlsx")) {
            workbook.write(outputStream);
            System.out.println("\n *** Congratulations It's Working ***");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("\n *** Man Make Your Own Sandwich ***");
        }
    }
}
