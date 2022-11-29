package dataprovider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;


import java.io.IOException;

public class excelutility {

    static XSSFWorkbook workbook;

    static {
        try {
            workbook = new XSSFWorkbook("C:\\Users\\Hp\\IdeaProjects\\_1LMTestingFrameWorkcom\\excel\\Testingfile.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static XSSFSheet sheet=workbook.getSheet("sheet1");


      public excelutility(){

      }

    // function for get the row count of sheet
    public int getRowCount(){
        int numrow=0;
        numrow =sheet.getPhysicalNumberOfRows();
        return numrow;
    }

    // function for get the column count of sheet

    public int getcolCount(){
        int numcol =0;
            numcol=sheet.getRow(0).getPhysicalNumberOfCells();
        return numcol;
    }
    public String getCellData(int row ,int column) {

          String cellData = null;
            cellData = sheet.getRow(row).getCell(column).getStringCellValue();
        return cellData;
    }


}
