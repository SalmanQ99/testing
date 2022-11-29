package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

   @Test
    public Object[][] exceldataproider(){

        excelutility excel= new excelutility();
        int row =excel.getRowCount();
        int column = excel.getcolCount();
         System.out.println("test");
        Object data[][] =new Object[row -1][column];

        for (int i = 1; i<row; i++){
            for (int j = 0 ; j<column; j++){

              String celldata=  excel.getCellData(i,j);
              //System.out.print(celldata+" / ");
              data[i-1][j]=celldata;

            }

        }
       return data;

}
    @DataProvider (name = "testdata")
     public Object[][]  testdata() {
       Object data[][]=exceldataproider();
       return data;

   }

   @Test(dataProvider = "testdata")
    public void testing(String unsername, String password){
       System.out.println(unsername + password);

   }
}
