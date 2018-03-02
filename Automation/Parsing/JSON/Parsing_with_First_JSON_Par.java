package Parsing_with_JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Parsing_with_First_JSON_Par {

	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		
		try {
			
		
		Object obj = parser.parse(new FileReader ("C:\\Users\\Andrei\\eclipse-workspace\\Test_Mav\\src\\main\\java\\Parsing_with_JSON\\First_JSON_Par.json"));
		
		JSONObject jsonObj = (JSONObject) obj;
		System.out.println(jsonObj);
		
		String FirstName = (String) jsonObj.get("FirstName");
		System.out.println(FirstName);
		
		String LastName = (String) jsonObj.get("LastName");
		System.out.println(LastName);
		
		long age = (Long) jsonObj.get("age");
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
		
		
		
		
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		}

}
