package pl.sda.fileconvneter;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ExcelReader implements Reader{
    @Override
    public List<Map<String, Object>> read(String inputFilePath) {

        try {
            FileInputStream fileInputStream = new FileInputStream(
                    new File(inputFilePath)
            );

            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.rowIterator();
            System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
            while (rowIterator.hasNext()){
                Row row = rowIterator.next();
                System.out.println(row.getCell(3));
            }



        }catch (IOException ex){
            ex.printStackTrace();
        }

        return null;
    }
}
