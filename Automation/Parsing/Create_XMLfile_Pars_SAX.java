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

public class Create_XMLfile_Pars_SAX {

	public static void main(String[] args) {
		
		try {
			
			DocumentBuilderFactory docFactor = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuild = docFactor.newDocumentBuilder();
			
			Document doc = docBuild.newDocument();
			Element rootElement = doc.createElement("Movie");
			doc.appendChild(rootElement);
			
			Element Comedy = doc.createElement("Comedy");
			rootElement.appendChild(Comedy);
			
			Attr atCom = doc.createAttribute("language");
			atCom.setValue("rus");
			Comedy.setAttributeNode(atCom);
			
			Element name = doc.createElement("name");
			name.appendChild(doc.createTextNode("иван васильевич меняет профессию"));
			Comedy.appendChild(name);
			
			Element release = doc.createElement("release");
			release.appendChild(doc.createTextNode("1973"));
			Comedy.appendChild(release);
			
			
			Element one = doc.createElement("duration");
			one.appendChild(doc.createTextNode("93 min"));
			Comedy.appendChild(one);
			
			Element autor = doc.createElement ("producer");
			autor.appendChild(doc.createTextNode("Леонид Гайдай"));
			Comedy.appendChild(autor);
			
			Element where = doc.createElement("country");
			where.appendChild(doc.createTextNode("СССР"));
			Comedy.appendChild(where);
			///////////////////////////
			Element Comed2 = doc.createElement("Comedy");
			rootElement.appendChild(Comed2);
			
			Attr Com2 = doc.createAttribute("language");
			Com2.setValue("rus");
			Comed2.setAttributeNode(Com2);
			
			Element name2 = doc.createElement("name");
			name2.appendChild(doc.createTextNode("Кавказская пленница, или Новые приключения Шурика"));
			Comed2.appendChild(name2);
			
			Element release2 = doc.createElement("release");
			release2.appendChild(doc.createTextNode("1967 "));
			Comed2.appendChild(release2);
			
			Element durat = doc.createElement("duration");
			durat.appendChild(doc.createTextNode("88 min"));
			Comed2.appendChild(durat);
			
			Element produc = doc.createElement("producer");
			produc.appendChild(doc.createTextNode("Леонид Гайдай"));
			Comed2.appendChild(produc);
			
			Element countr = doc.createElement("country");
			countr.appendChild(doc.createTextNode("СССР"));
			Comed2.appendChild(countr);
			
			
			
		//////////
			Element horror = doc.createElement("horror");
			rootElement.appendChild(horror);
			
			Attr atHor = doc.createAttribute("nation");
			atHor.setValue("eng");
			horror.setAttributeNode(atHor);
			
			Attr at = doc.createAttribute("parts");
			at.setValue("8");
			horror.setAttributeNode(at);
			
			
			Element nam = doc.createElement("name");
			nam.appendChild(doc.createTextNode("jigsaw"));
			horror.appendChild(nam);
			
			Element rele = doc.createElement("release");
			rele.appendChild(doc.createTextNode("2004"));
			horror.appendChild(rele);
			
			Element dur = doc.createElement("duration");
			dur.appendChild(doc.createTextNode("102 min"));
			horror.appendChild(dur);
			//
			Element pro = doc.createElement("producer");
			Attr atHor1 = doc.createAttribute("nation");
			atHor1.setValue("Малайзия");
			pro.setAttributeNode(atHor1);
			pro.appendChild(doc.createTextNode("Джеймс Ван"));
			horror.appendChild(pro);
			//
			Element cou = doc.createElement("country");
			cou.appendChild(doc.createTextNode("США"));
			horror.appendChild(cou);
						
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("D:\\saxPars.xml"));
			
			transformer.transform(source , result);
			
			
			
			
			
		}catch(ParserConfigurationException e) {
			e.printStackTrace();
		}catch (TransformerException e) {
			e.printStackTrace();
		}

	}

}
