package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        // önce exeli açarım, sheete ulaşırım
        // işlemlerimi eklerim (hafızada)
        // yazma modunda açıp , hafızadaki işlemleri kaydederim.

        String path ="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";

        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0);

        Row newRow=sheet.createRow(sheet.getPhysicalNumberOfRows());
       // Row newRow=sheet.createRow(0);
        Cell newCell=newRow.createCell(0);
        newCell.setCellValue("Şampiyon GALATASARAY");

        inputStream.close();

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("yazma işlemi bitti");

    }
}
