package Pars_XML_to_Xlsx;

import java.awt.desktop.SystemSleepEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ParsingXML_to_Excel {

	public static void main(String [] args) {
		
		ArrayList<String> NumCode = new ArrayList<String>();
		ArrayList<String> CharCode = new ArrayList<String>();
		ArrayList<String> Nominal = new ArrayList<String>();
		ArrayList<String> Name = new ArrayList<String>();
		ArrayList<String> Value = new ArrayList<String>();
		
		try {
			DocumentBuilderFactory docBF = DocumentBuilderFactory.newInstance();
			DocumentBuilder docB = docBF.newDocumentBuilder();
			Document xmlD = docB.parse(new File("C:\\Users\\Andrei\\eclipse-workspace\\Test_Mav\\src\\main\\java\\Number_Three\\Values.xml"));
			
			xmlD.getDocumentElement().normalize();
			System.out.println(xmlD.getDocumentElement().getNodeName());
			
			NodeList list = xmlD.getElementsByTagName("Valute");//list how many type of currency
			int val = list.getLength();// in the XML
			System.out.println("Total no of Currancy:" + val);//Document
			
			for (int a = 0; a < list.getLength(); a++) {
			
				Node NumC = list.item(a);
				if(NumC.getNodeType() == Node.ELEMENT_NODE){
					
				Element NumElement = (Element) NumC;
				
				NodeList FirstVa = NumElement.getElementsByTagName("NumCode");
				Element CharC = (Element) FirstVa.item(0);
				NodeList SecondVa = CharC.getChildNodes(); 
				System.out.print("NumCode: " + ((Node) SecondVa.item(0)).getNodeValue().trim());
				NumCode.add(((Node) SecondVa.item(0)).getNodeValue().trim());
				
				NodeList NumCodeLists = NumElement.getElementsByTagName("CharCode");
				Element sElement = (Element) NumCodeLists.item(0);
				NodeList textNList = sElement.getChildNodes();
				System.out.println(((Node) textNList.item(0)).getNodeValue().trim());
				CharCode.add(((Node)textNList.item(0)).getNodeValue().trim());
				
				NodeList aList = NumElement.getElementsByTagName("Nominal");
				Element element = (Element) aList.item(0);
				NodeList charList = element.getChildNodes();
				System.out.println(((Node) charList.item(0)).getNodeValue().trim());
				Nominal.add(((Node)charList.item(0)).getNodeValue().trim());
				
				NodeList NList = NumElement.getElementsByTagName("Name");
				Element Nelement = (Element) NList.item(0);
				NodeList NcharList = Nelement.getChildNodes();
				System.out.println(((Node) NcharList.item(0)).getNodeValue().trim());
				Name.add(((Node)NcharList.item(0)).getNodeValue().trim());
				
				NodeList Nvalue = NumElement.getElementsByTagName("Value");
				Element Velement = (Element) Nvalue.item(0);
				NodeList NVvalue = Velement.getChildNodes();
				System.out.println(((Node) NVvalue.item(0)).getNodeValue().trim());
				Value.add(((Node)NVvalue.item(0)).getNodeValue().trim());
				
				}
			
			}
			for (String NumCod : NumCode) {
				System.out.println("NumCode: " + NumCod);
			}
			for (String CharCod : CharCode) {
				System.out.println("CharCode: " + CharCod);
			}
			for (String Namina : Nominal) {
				System.out.println("Nominal: " + Namina);
			}
			for (String Nam : Name ) {
				System.out.println("Name: " + Nam);
			}
			for (String Val : Value) {
				System.out.println("Value: " + Value);
			}
			
			
		}catch (SAXParseException err) 
        {
            System.out.println("** Parsing error" + ", line "+ err.getLineNumber() + ", uri " + err.getSystemId());
            System.out.println(" " + err.getMessage());
        } 
        catch (SAXException e) 
        {
            Exception x = e.getException();
            ((x == null) ? e : x).printStackTrace();
        } 
        catch (Throwable t) 
        {
            t.printStackTrace();
        }
		
		XSSFWorkbook workbook =  new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet");
		
		Map<String, Object[]> data = new HashMap<String, Object[]>();
		
		for (int b = 0; b < NumCode.size(); b++) {
			data.put(b +"", new Object[] {NumCode.get(b),CharCode.get(b),Nominal.get(b), Name.get(b), Value.get(b)});
		}
		Set<String> set = data.keySet();
		int rowN = 0;
		for (String setK : set) {
			Row row = sheet.createRow(rowN++);
			Object [] ar = data.get(setK);
			int cellN = 0;
			for (Object obj : ar) {
				Cell cell = row.createCell(cellN++);
				
				if (obj instanceof Date)
					cell.setCellValue((Date) obj);
				else if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if(obj instanceof Double)
					cell.setCellValue((Double) obj);
			}
		}
		
		try {
			FileOutputStream out = new FileOutputStream (new File("C:\\Users\\Andrei\\Desktop\\Java_Files\\currency.xlsx"));
			workbook.write(out);
			out.close();
			
			
		}catch (FileNotFoundException e) {
			e.getMessage();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

		
	}
}
