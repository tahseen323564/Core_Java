//tahseen anwar tahir

package Testing1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class function {
	
	public boolean prime(int n)
	{
		int flag=0;
		
		if (n > 1)
		{
			
			for(int i =2; i<= Math.sqrt(n); i++)
			{
				if (n%i==0)
				{
					flag=1;
					break;
				}
			}
		}
		
		if (flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean even(int n)
	{
		if (n%2==0)
			return true;
		else
			return false;
	}
	
	public int read(int x, int y , String sheet )
	{
		int result=0;
		try
		{
			File f = new File("D:\\New1.xlsx");
			FileInputStream  fis = new FileInputStream(f);
			XSSFWorkbook wb =  new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheet);
			XSSFRow row = sh.getRow(x);
			XSSFCell cell = row.getCell(y);
			//System.out.println("hi ");
			result = (int)cell.getNumericCellValue();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return result;
	
	}
	
	public void write(int x, int y, String str, int data )
	//public boolean write(int x, int y, String str, String data )
	{
		//boolean flag=false;
		try
		{
			//File f = new File("D:\\FirstSheet.xlsx");
			File f = new File("D:\\New1.xlsx");
			FileInputStream  fis = new FileInputStream(f);
			XSSFWorkbook wb =  new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(str);
			XSSFRow row1 = sh.createRow(x);
			XSSFCell celld = row1.createCell(y);
			//System.out.println("hi ");
			
			celld.setCellValue(data);
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			//flag = true;
		}
		catch(Exception e)
		{
			System.out.println(e);
			//flag = false;
		}
		
		//return flag;
	}
	

	
}
