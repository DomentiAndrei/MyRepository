package Create_XML_File.Repeat_XML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Pars_Create_from_Repeat {

	@Test
	public void pars()throws Exception{
		
		File xml = new File("C:\\Users\\Andrei\\Desktop\\Java_Files\\Parsing\\XMLPars\\fileS.xml");
		DocumentBuilderFactory doc = DocumentBuilderFactory.newInstance();
		DocumentBuilder build = doc.newDocumentBuilder();
		Document docX = build.parse(xml);

		docX.getDocumentElement().normalize();
		System.out.println(docX.getDocumentElement().getNodeName());
		
		NodeList fList = docX.getElementsByTagName("Moldova");
		System.out.println("--------------");
		for(int a = 0; a < fList.getLength(); a++) {
			Node node = fList.item(a);
			System.out.println(node.getNodeName());
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				System.out.println("Moldoveni: " + element.getAttribute("Moldoveni"));
				System.out.println("Population: " + element.getAttribute("Population"));
				System.out.println("Area: " + element.getElementsByTagName("area").item(0).getTextContent());
				System.out.println("Road: " + element.getElementsByTagName("road").item(0).getTextContent());
				System.out.println("Chisinau from Road: " + element.getElementsByTagName("road").item(0).getAttributes().getNamedItem("Chisinau"));
				System.out.println("market: " + element.getElementsByTagName("market").item(0).getTextContent());
				
			}
		}
		NodeList list = docX.getElementsByTagName("asia");
		System.out.println("------------------");
		
		for(int a = 0;a < list.getLength();a ++) {
			Node node = list.item(a);
			System.out.println(node.getNodeName());
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				System.out.println("Population: " + element.getAttribute("Population"));
				System.out.println("Area: " + element.getElementsByTagName("area").item(0).getTextContent());
				String b = element.getElementsByTagName("area").item(0).getTextContent();
				System.out.println("Area" + b);
				System.out.println("Road: " + element.getElementsByTagName("road").item(0).getTextContent());
				System.out.println("Russia from Road: " + element.getElementsByTagName("road").item(0).getAttributes().getNamedItem("Russia"));
				System.out.println("Market: " + element.getElementsByTagName("market").item(0).getTextContent());
				
			}
		}
		
		
		
		
	}
}
