package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOI_Start {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        FileInputStream readexcelcontent = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(readexcelcontent);

        Sheet workpage = workbook.getSheet("Sheet1");

        Row row = workpage.getRow(0);

        Cell cell = row.getCell(0);
        System.out.println(cell);
    }

}
