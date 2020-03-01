package Exceldatadriven;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
	
	File src= new File("F:\\video selenium\\GmailTestData.xls");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);//load the workbook(excel) 
	
	XSSFSheet RegData=wb.getSheetAt(0); //which sheet we want to useit
    
	int rowcount=RegData.getLastRowNum();
	
	System.out.println("Total row is"+ rowcount);
	
	for(int i=0;i<rowcount;i++);
	{
		String data0=RegData.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data form Excel is"+data0);
		
		String data1=RegData.getRow(4).getCell(1).getStringCellValue();
		System.out.println("Data from Excel is"+data1);
		
		wb.close();

	}
	
	}
}


	
	
   

