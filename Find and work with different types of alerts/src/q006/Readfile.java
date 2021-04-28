package q006;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Readfile
{
	public static String text;
	private static XSSFWorkbook wb;
	public static String input() throws IOException 
	{
		FileInputStream read = new FileInputStream("practice.xlsx");
		wb = new XSSFWorkbook(read);
		XSSFSheet sheet = wb.getSheet("practice");
		Row row;
		Cell cell;
		
		Iterator<Row> rowiterator = sheet.rowIterator();
		while(rowiterator.hasNext()) 
		{
			row = rowiterator.next();
			Iterator<Cell> celliterator = row.cellIterator();
			while(celliterator.hasNext()) 
			{
				cell = celliterator.next();
				
				DataFormatter data = new DataFormatter();
				text = (String) data.formatCellValue(cell);
			}
		}
		return text;
	}


}
