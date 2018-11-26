import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("D:/Input_BasicAssesssmentDetails.xls");
//		Workbook wb = WorkbookFactory.create(fis);
////		HSSFWorkbook wb =new HSSFWorkbook(fis);
//		Sheet s = wb.getSheet("Result");
//		Row rc =s.getRow(0);
//		int cc = rc.getLastCellNum();
//		String v="";
//		System.out.println(cc);
//		for (int i=0;i<cc;i++)
//		{
//			v =rc.getCell(i).getStringCellValue();
//			
//			System.out.println(v);
//		}	
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("Result");
		Row rc=sh.getRow(0);
//		Cell c=rc.getCell(0);
		for(int i=0;i<rc.getLastCellNum();i++)
		{
			String v=rc.getCell(i).getStringCellValue();
			System.out.println(v);
			if(v.equalsIgnoreCase("validTo"))
			{
				System.out.println("fetched");
				break;
			}
			else
			{
				System.out.println("Not matched");
			}
		}
		

	}

}
