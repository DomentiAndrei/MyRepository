package Create_XML_File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
public class Pars_XML_with_file111 {

	public static void main(String[] args) {
	
		try {
			
			File fileXML = new File("D:\\file111.xml");
			DocumentBuilderFactory doc = DocumentBuilderFactory.newInstance();
			DocumentBuilder build = doc.newDocumentBuilder();
			Document docX = build.parse(fileXML);
			
			docX.getDocumentElement().normalize();
			System.out.println(docX.getDocumentElement().getNodeName());
			
			NodeList nList = docX.getElementsByTagName("female");
			System.out.println("");
			
			for (int f = 0; f < nList.getLength(); f++) {
				
				Node nNode = nList.item(f);
				System.out.println(nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) nNode;
					
					System.out.println("ID: " + element.getAttribute("ID"));
					System.out.println("firstname: " + element.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("lastname: " + element.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("age: " + element.getElementsByTagName("age").item(0).getTextContent());
					System.out.println("nr: " + element.getElementsByTagName("nr").item(0).getTextContent());
				}
			}
			NodeList list = docX.getElementsByTagName("men");
			System.out.println("");
			for (int m = 0; m < list.getLength(); m++) {
				
				Node node = list.item(m);
				System.out.println(node.getNodeName());
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element elemen = (Element) node;
					
					System.out.println("ID: " + elemen.getAttribute("ID"));
					System.out.println("firstname: " + elemen.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("lastname: " + elemen.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("age: " + elemen.getElementsByTagName("age").item(0).getTextContent());
					System.out.println("nr: " + elemen.getElementsByTagName("nr").item(0).getTextContent());
					
				}
			}
			NodeList listB = docX.getElementsByTagName("boy");
			System.out.println("");
			for (int c = 0; c < listB.getLength(); c++) {
				Node nodB = listB.item(c);
				System.out.println(nodB.getNodeName());
				if(nodB.getNodeType() == Node.ELEMENT_NODE) {
					Element elemB = (Element) nodB;
					
					System.out.println("ID: " + elemB.getAttribute("ID"));
					System.out.println("firstname: " + elemB.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("lastname: " + elemB.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("nr: " + elemB.getElementsByTagName("nr").item(0).getTextContent());
				}
			}
			
			NodeList listG = docX.getElementsByTagName("girl");
			System.out.println("");
			for (int g = 0; g < listG.getLength(); g++) {
				Node nodG = listG.item(g);
				System.out.println(nodG.getNodeName());
				if (nodG.getNodeType() == Node.ELEMENT_NODE) {
					Element elemG = (Element) nodG;
					
					System.out.println("ID: " + elemG.getAttribute("ID"));
					System.out.println("firstname: " + elemG.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("lastname: " + elemG.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("nr: " + elemG.getElementsByTagName("nr").item(0).getTextContent());
					
				}
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		
	}

}
