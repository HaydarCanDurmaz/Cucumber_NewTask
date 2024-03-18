package Mentoring;


import Utilities.DBUtility;
import _JDBC._JDBC_Parent;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;


public class Excel_Api_JDBC extends _JDBC_Parent {
    @Test
    public void test() throws SQLException, IOException {

        ResultSet rs = statement.executeQuery("select * from actor;");
        ResultSetMetaData rsmd = rs.getMetaData();

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Actor1");

        Row row = sheet.createRow(0);

        int count = 0;
        for (int i = 1; i < rsmd.getColumnCount(); i++) {
            System.out.printf("%-20s", rsmd.getColumnName(i));
            row.createCell(count).setCellValue(rsmd.getColumnName(i));
            count++;
            System.out.println();
        }
        count = 1;
        int countCell = 0;
        while (rs.next()) {
            row = sheet.createRow(count);
            for (int i = 1; i < rsmd.getColumnCount(); i++) {
                System.out.printf("%-20s", rs.getString(i));
                Cell cell = row.createCell(countCell);
                cell.setCellValue(rs.getString(i));
                countCell++;

            }
            countCell = 0;
            count++;
            System.out.println();


        }
        String newPath = "src/test/java/Mentoring/actor.xlsx";
        FileOutputStream outputStream = new FileOutputStream(newPath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }

    @Test
    public void teat2() throws SQLException, IOException {
        ResultSet rs = statement.executeQuery("select first_name from actor where first_name like 'A%';");
        ResultSetMetaData rsmd = rs.getMetaData();
        String newPath = "src/test/java/Mentoring/actor.xlsx";
        FileInputStream inputStream = new FileInputStream(newPath);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.createSheet("Actor2");
        Row row = sheet.createRow(0);

        int count = 0;
        for (int i = 1; i < rsmd.getColumnCount(); i++) {
            System.out.printf("%-20s", rsmd.getColumnName(i));
            row.createCell(count).setCellValue(rsmd.getColumnName(i));
            count++;
        }
        System.out.println();
        count = 1;
        int countCell = 0;
        while (rs.next()) {
            row = sheet.createRow(count);
            for (int i = 1; i < rsmd.getColumnCount(); i++) {
                System.out.printf("%-20s", rs.getString(i));
                Cell cell = row.createCell(countCell);
                cell.setCellValue(rs.getString(i));
                countCell++;

            }
            countCell = 0;
            count++;
            System.out.println();


        }
        String neewPath = "src/test/java/Mentoring/actor.xlsx";
        FileOutputStream outputStream = new FileOutputStream(neewPath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

}
