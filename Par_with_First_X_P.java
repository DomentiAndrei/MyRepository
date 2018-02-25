package Test_Mav.Test_Mav;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Par_with_First_X_P {

	public void query() throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {

		DocumentBuilderFactory factor = DocumentBuilderFactory.newInstance();
		factor.setNamespaceAware(true);
		DocumentBuilder build;
		Document doc = null;
		XPathExpression exp = null;
		build = factor.newDocumentBuilder();
		doc = build.parse("C:\\Users\\Andrei\\eclipse-workspace\\Test_Mav\\target\\First_X_Path.xml");

		XPathFactory xFactor = XPathFactory.newInstance();

		XPath xpath = xFactor.newXPath();
		// display marks of mobile which have 2GB RAM
		exp = xpath.compile("//model[ram = '2GB']/mark/text()");
		Object resul = exp.evaluate(doc, XPathConstants.NODESET);

		NodeList nodes = (NodeList) resul;
		for (int a = 0; a < nodes.getLength(); a++)
			System.out.println(nodes.item(a).getNodeValue());
		// display number of phone which price is 500$
		exp = xpath.compile("count (//model[price ='500$'])");
		Double number = (Double) exp.evaluate(doc, XPathConstants.NUMBER);
		System.out.println("NUmber of phone with price 500$: " + number);

		// show numbers of phone released in 2011
		exp = xpath.compile("count(//model[year = '2011'])");
		Double check = (Double) exp.evaluate(doc, XPathConstants.NUMBER);
		if (check <= 1)
			System.out.println("number of phone released in 2011: " + check);
		else
			System.out.println("only " + check + " phones have been released");
		// dispaly which type of iphone has 2 years warranty

		exp = xpath.compile("//apple[warranty = '2 years']/type/text()");
		Object res = exp.evaluate(doc, XPathConstants.NODESET);

		NodeList node = (NodeList) res;
		int b = 0;
		while (b < node.getLength()) {

			try (FileOutputStream fos = new FileOutputStream("C:\\Intel\\text.txt");
					PrintStream printStream = new PrintStream(fos))

			{
				printStream.println(node.item(b).getNodeValue());

				System.out.println("The file was written to");

			} catch (IOException ex) {

				System.out.println(ex.getMessage());
			}
			b++;
		}

		// for (int b = 0; b < nodes.getLength(); b++)
		// System.out.println(": " + node.item(b).getNodeValue());
		// g.println();
	}

	public static void main(String[] args)
			throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		Par_with_First_X_P proces = new Par_with_First_X_P();
		proces.query();
	}
}