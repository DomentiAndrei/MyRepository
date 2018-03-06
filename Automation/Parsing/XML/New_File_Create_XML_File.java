package Create_XML_File;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class New_File_Create_XML_File {

	public static void main(String argv[]) {

		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("People");
			doc.appendChild(rootElement);

			Element female = doc.createElement("female");
			rootElement.appendChild(female);

			Attr attr = doc.createAttribute("ID");
			attr.setValue("20");
			female.setAttributeNode(attr);
			
			Element firstname = doc.createElement("firstname");
			firstname.appendChild(doc.createTextNode("Maria"));
			female.appendChild(firstname);
			
			Element lastname = doc.createElement("lastname");
			lastname.appendChild(doc.createTextNode("Rival"));
			female.appendChild(lastname);
			
			Element age = doc.createElement("age");
			age.appendChild(doc.createTextNode("20"));
			female.appendChild(age);
			
			Element number = doc.createElement("nr");
			number.appendChild(doc.createTextNode("#1132"));
			female.appendChild(number);
			/////////
			Element men = doc.createElement("men");
			rootElement.appendChild(men);
			
			Attr atr = doc.createAttribute("ID");
			atr.setValue("222");
			men.setAttributeNode(atr);
			
			Element firstnam = doc.createElement("firstname");
			firstnam.appendChild(doc.createTextNode("MAx"));
			men.appendChild(firstnam);
			
			Element lastnam = doc.createElement("lastname");
			lastnam.appendChild(doc.createTextNode("Caralov"));
			men.appendChild(lastnam);
			
			Element ag = doc.createElement("age");
			ag.appendChild(doc.createTextNode("30"));
			men.appendChild(ag);
			
			Element num = doc.createElement("nr");
			num.appendChild(doc.createTextNode("#1234"));
			men.appendChild(num);
			/////////////
			Element boy = doc.createElement("boy");
			rootElement.appendChild(boy);
			
			Attr at = doc.createAttribute("ID");
			at.setValue("202");
			boy.setAttributeNode(at);
			
			Attr d = doc.createAttribute("first");
			d.setValue("3.400 Kg");
			boy.setAttributeNode(d);
			
			Element firstnameC = doc.createElement("firstname");
			firstnameC.appendChild(doc.createTextNode("Ana"));
			boy.appendChild(firstnameC);
			
			Element lastnameC = doc.createElement("lastneme");
			lastnameC.appendChild(doc.createTextNode("Bilan"));
			boy.appendChild(lastnameC);
			
			Element numC = doc.createElement("nr");
			numC.appendChild(doc.createTextNode("#90123"));
			boy.appendChild(numC);
			/////////////
			Element girl = doc.createElement("girl");
			rootElement.appendChild(girl);
			
			Attr a = doc.createAttribute("ID");
			a.setValue("2317");
			girl.setAttributeNode(a);
			
			Attr b = doc.createAttribute("second");
			b.setValue("4 Kg");
			girl.setAttributeNode(b);
			
			Element firstNG = doc.createElement("firstname");
			firstNG.appendChild(doc.createTextNode("Linda"));
			girl.appendChild(firstNG);
			
			Element lastNG = doc.createElement("lastname");
			lastNG.appendChild(doc.createTextNode("Burilova"));
			girl.appendChild(lastNG);
			
			Element nuNG = doc.createElement("nr");
			nuNG.appendChild(doc.createTextNode("#5532"));
			girl.appendChild(nuNG);
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("D:\\file111.xml"));
			
			
			
			transformer.transform(source, result);
			
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} 
		catch (TransformerException e) {
			e.printStackTrace();
		}

	}

}
