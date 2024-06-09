package com.example.utility;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class ExcelUtility {
    public static String getData(int rowNumber, int cellNumber) throws IOException, InvalidFormatException {
        File file = new File("testdata.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheetAt(0);

        return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
    }
}
