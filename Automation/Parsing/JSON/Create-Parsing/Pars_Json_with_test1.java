package Create_JSON_File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Pars_Json_with_test1 {

	public static void main(String[] args) {
		
		JSONParser par = new JSONParser();
		
		try {
			
			Object test1 = par.parse(new FileReader("C:\\Users\\Andrei\\eclipse-workspace\\Test_Mav\\src\\main\\java\\Create_JSON_File\\test1.json"));
			
			JSONObject jsonObjec = (JSONObject) test1;
			System.out.println(jsonObjec);
			
			String firstName = (String) jsonObjec.get("firstName");
			System.out.println(firstName);
			
			String lastName = (String) jsonObjec.get("lastName");
			System.out.println(lastName);
			
			long age = (Long) jsonObjec.get("age");
			System.out.println(age);
			
			JSONArray years = (JSONArray) jsonObjec.get("years");
			Iterator<String> it = years.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			JSONArray Language = (JSONArray) jsonObjec.get("Language");
			Iterator<String> PL = Language.iterator();
			while(PL.hasNext()) {
				System.out.println(PL.next());
			}	
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
			
		}

	}


