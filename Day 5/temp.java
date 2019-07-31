//tahseen anwar tahir

package Testing1;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;



public class temp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workbook book = new HSSFWorkbook();
		org.apache.poi.ss.usermodel.Sheet sheet = book.createSheet("Birthdays");
		Row row = sheet.createRow(0); // we will write name and birthdates in two columns // name will be String and birthday would be Date // formatted as dd.mm.yyyy 
		Cell name = row.createCell(0);
		name.setCellValue("John");

	}

}
