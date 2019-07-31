//tahseen anwar tahir

package Testing1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\New1.xlsx");
		try 
		{
			FileInputStream  fis = new FileInputStream(f);
			XSSFWorkbook wb =  new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Sheet1");
			XSSFRow row = sh.getRow(0);
			XSSFCell cell = row.getCell(0);
			
			XSSFRow row1 = sh.createRow(1);
			//XSSFCell cell1 = row1.createCell(1);
//			System.out.println(s);
			
			for (int i =0 ; i< 5; i++)
			{
				XSSFCell celld = row1.createCell(i);
				celld.setCellValue("hello");	
			}
			
				
			FileOutputStream fos =  new FileOutputStream(f);
			String str = "hello how are mn";

			wb.write(fos);


			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
