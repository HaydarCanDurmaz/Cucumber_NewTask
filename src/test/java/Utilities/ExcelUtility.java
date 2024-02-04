package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ExcelUtility {
    public static void main(String[] args) {

        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        String sheetName ="testCitizen";

        System.out.print("İstediğiniz sütun sayısı=");
        Scanner oku=new Scanner(System.in);
        int columnCnt=oku.nextInt();

        ArrayList<ArrayList<String>> donenSonuc=getData(path, sheetName, columnCnt);
        System.out.println("donenSonuc = " + donenSonuc);
    }


    public static ArrayList< ArrayList<String> > getData(String path, String sheetName, int colCnt){
        ArrayList< ArrayList<String> > tablo=new ArrayList<>();

        Sheet sheet =null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet(sheetName); // getSheet(testCitizen)  getSheetAt(0,1,2,3)
        }
        catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { // zoo.length
            ArrayList<String> satir=new ArrayList<>();
            for (int j = 0; j < colCnt; j++) {   // zoo[i].length
                satir.add(sheet.getRow(i).getCell(j).toString());
            }

            tablo.add(satir);
        }

        return tablo;

    }
    public static void writeExcel(String path, Scenario scenario , String browserName){
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("CampusTest");

        Row row=sheet.createRow(0);

        Cell cell=row.createCell(0);
        cell.setCellValue(scenario.getName());

        cell=row.createCell(1);
        cell.setCellValue(scenario.getStatus().toString());

        cell=row.createCell(2);
        cell.setCellValue(browserName);

        try {
            FileOutputStream outputStream=new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        }catch (Exception e){

        }


    }
}
