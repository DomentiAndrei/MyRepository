package Create_XML_File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Pars_sax_Create_XMLfile_Pars_SAX {

	public static void main(String[] args) {

		try {
			SAXParserFactory fact = SAXParserFactory.newInstance();
			SAXParser pars = fact.newSAXParser();

			DefaultHandler hand = new DefaultHandler() {

				boolean name = false;
				boolean release = false;
				boolean duration = false;
				boolean producer = false;
				boolean country = false;

				public void startElement(String uri, String fname, String lname, Attributes attributes)
						throws SAXException {

					if (lname.equalsIgnoreCase("name")) {
						name = true;
					}

					if (lname.equalsIgnoreCase("release")) {
						release = true;
					}

					if (lname.equalsIgnoreCase("duration")) {
						duration = true;
					}

					if (lname.equalsIgnoreCase("producer")) {
						producer = true;
					}
					if (lname.equalsIgnoreCase("country")) {
						country = true;
					}

				}

//				public void endElement(String uri, String localName, String qName) throws SAXException {
//
//				}

				public void characters(char chr[], int start, int lenght) throws SAXException {

					if (name) {
						System.out.println("Name: " + new String(chr, start, lenght));
						name = false;
					}
					if (release) {
						System.out.println("Release: " + new String(chr, start, lenght));
						release = false;
					}
					if (duration) {
						System.out.println("Duration: " + new String(chr, start, lenght));
						duration = false;

					}
					if (producer) {
						System.out.println("Producer: " + new String(chr, start, lenght));
						producer = false;
					}
					if (country) {
						System.out.println("Country: " + new String(chr, start, lenght));
						country = false;
					}
				}
			};

			pars.parse("D:\\saxPars.xml", hand);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
