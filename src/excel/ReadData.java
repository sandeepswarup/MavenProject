package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData 
{
  @Test
   private void readdata() throws IOException
  {
	  FileInputStream fis=new FileInputStream("./testdata/SeleniumICSM8.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  
	  System.out.println(wb.getSheet("Sandeep").getRow(9).getCell(4).getStringCellValue());
	  
	

}
}
