package Exceldatadriven;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel12 {

	public static void main(String[] args) throws Exception {
	
	File src= new File("C:\\Users\\Raviraj\\workspace\\Myproject\\Excelf\\TestData.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	XSSFSheet sheet1=wb.getSheetAt(0);
	
	int rowcount=sheet1.getLastRowNum();
	
	System.out.println("Total row is"+rowcount);
	
	for(int i=0; i<rowcount; i++);
	{
	String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	
	System.out.println("Data form row is data0");
	
	}
	}
}


	
	
   

