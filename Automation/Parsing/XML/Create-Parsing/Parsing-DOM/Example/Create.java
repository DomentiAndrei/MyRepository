package Create_XML_File.Repeat_XML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.testng.annotations.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Create {
	@Test
	public void test() throws Exception {

		DocumentBuilderFactory docFactor = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuild = docFactor.newDocumentBuilder();

		Document docX = docBuild.newDocument();
		Element baseE = docX.createElement("Word");
		docX.appendChild(baseE);

		Element Moldova = docX.createElement("Moldova");
		baseE.appendChild(Moldova);

		Attr atribut = docX.createAttribute("Population");
		atribut.setValue("20000");
		Moldova.setAttributeNode(atribut);

		Attr atributS = docX.createAttribute("Moldoveni");
		atributS.setValue("10000");
		Moldova.setAttributeNode(atributS);

		Element ariaQ = docX.createElement("area");
		ariaQ.appendChild(docX.createTextNode("12345"));
		Moldova.appendChild(ariaQ);
		/////
		Element roadQ = docX.createElement("road");
		roadQ.appendChild(docX.createTextNode("good"));
		Moldova.appendChild(roadQ);
		
		Attr atrRoad = docX.createAttribute("Chisinau");
		atrRoad.setValue("10");
		roadQ.setAttributeNode(atrRoad);
		/////
		Element market = docX.createElement("market");
		market.appendChild(docX.createTextNode("10 Makr"));
		Moldova.appendChild(market);
		//
		Element asia = docX.createElement("asia");
		baseE.appendChild(asia);
		
		Attr pop = docX.createAttribute("Population");
		pop.setValue("999999");
		asia.setAttributeNode(pop);
		
		Element area = docX.createElement("area");
		area.appendChild(docX.createTextNode("234213"));
		asia.appendChild(area);
		
		Element road = docX.createElement("road");
		road.appendChild(docX.createTextNode("worst"));
		asia.appendChild(road);
		
		Attr atrRoa = docX.createAttribute("Russia");
		atrRoa.setValue("No bad");
		road.setAttributeNode(atrRoa);
		
		Element mark = docX.createElement("market");
		mark.appendChild(docX.createTextNode("15 Mark"));
		asia.appendChild(mark);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		TransformerFactory trans = TransformerFactory.newInstance();
		Transformer tran = trans.newTransformer();
		DOMSource sour = new DOMSource(docX);
		StreamResult result = new StreamResult(
				new File("C:\\Users\\Andrei\\Desktop\\Java_Files\\Parsing\\XMLPars\\fileS.xml"));

		tran.transform(sour, result);

	}
}
