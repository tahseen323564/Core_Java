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

public class function1 {

public boolean prime(int n)
{

boolean flag=true;
if(n>1)
{
for(int i=2;i<=Math.sqrt(n);i++)
{
if(n%i==0)
{
flag=false;
break;
}
}
}
return flag;
}
public boolean even(int n)
{
boolean flag=false;
if(n%2==0)
flag=true;
return flag;
}
public int read(int x,int y)
{
int s=0;
try {
File f=new File("D:\\test.xlsx");
FileInputStream fis=new FileInputStream(f);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sh=wb.getSheet("Number");
XSSFRow rw=sh.getRow(x);
XSSFCell cell=rw.getCell(y);
s=(int) cell.getNumericCellValue();
//System.out.println("Read"+s);
} catch (Exception e) {
// TODO Auto-generated catch block
//e.printStackTrace();
}
return s;
}
public void write(int x,int y,String sheet, int data)
{
try {
File f1=new File("D:\\test.xlsx");
FileInputStream fis1=new FileInputStream(f1);
XSSFWorkbook wb=new XSSFWorkbook(fis1);
XSSFSheet sh=wb.getSheet(sheet);
XSSFRow row1=sh.createRow(x);
XSSFCell cell=row1.createCell(y);
cell.setCellValue(data);
//Done for overwriting
FileOutputStream fos=new FileOutputStream(f1);
//cell.setCellValue("NOIDA");
wb.write(fos);

} catch (IOException e) {
// TODO Auto-generated catch block
//e.printStackTrace();
}
}

}
