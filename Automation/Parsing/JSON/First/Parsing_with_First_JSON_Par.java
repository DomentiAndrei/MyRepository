package Parsing_with_JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.json.Json;

public class Parsing_with_First_JSON_Par {

	public static void main(String[] args) {
		//////// parsing with "First_JSON_Par.json
		JSONParser parser = new JSONParser();
		
		try {
			
		
		Object obj = parser.parse(new FileReader
				("C:\\Users\\Andrei\\eclipse-workspace\\Test_Mav\\src\\main\\java\\Parsing_with_JSON\\First_JSON_Par.json"));
		
		JSONObject jsonObj = (JSONObject) obj;
		System.out.println(jsonObj);
		
		String FirstName = (String) jsonObj.get("FirstName");//extract name
		System.out.println(FirstName);
		
		String LastName = (String) jsonObj.get("LastName");//extract first name
		System.out.println(LastName);
		
		long age = (Long) jsonObj.get("age");//
		System.out.println(age);
		
		
		
		JSONArray num = (JSONArray) jsonObj.get("PhoneNumbers");
		Iterator<String> iterator = num.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		JSONObject structur = (JSONObject) jsonObj.get("address");
		System.out.println("Street is: " + structur.get("Str"));

		JSONObject structure = (JSONObject) jsonObj.get("address");
		System.out.println("Number of House: " + structure.get("Nr"));
		
		//
		String FirstNam = (String) jsonObj.get("FirstNam");
		System.out.println(FirstNam);
		
		JSONObject stru = (JSONObject) jsonObj.get("addres");
		System.out.println("Country is: " + stru.get("Country"));
		
		long ag = (Long) jsonObj.get("ag");
		System.out.println("Maria has: " + ag);
		
		
		JSONArray pN = (JSONArray) jsonObj.get("PhoneNumber");
		Iterator<String> iterato = pN.iterator();
		while (iterato.hasNext()) {
			System.out.println(iterato.next());
		}
		
		JSONObject str = (JSONObject) jsonObj.get("addres");
		System.out.println("Postal Code is: " + str.get("PostalCode"));
		

		
		//nested data
		
		JSONObject addres = (JSONObject) jsonObj.get("addres"); 
		JSONObject weight = (JSONObject) addres.get("Weight");
		String winter = (String) weight.get("Winter");
		System.out.println("winter: " + winter);
		
		JSONObject addre1 = (JSONObject) jsonObj.get("addres");
		JSONObject weight1 = (JSONObject) addre1.get("Weight");
		String Spring = (String) weight1.get("Spring");
		System.out.println("Spring: " + Spring);
		
		JSONObject addres2 = (JSONObject) jsonObj.get("addres");
		JSONObject weight2 = (JSONObject) addres2.get("Weight");
		String Summer = (String) weight2.get("Summer");
		System.out.println("Summer: " + Summer);
		
		//
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		}

}
