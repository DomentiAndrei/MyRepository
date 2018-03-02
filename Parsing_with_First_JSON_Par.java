package my.practice;

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

			Object obj = parser.parse(new FileReader(
					"C:\\Users\\QA-3\\Desktop\\practice (1)\\practice\\target\\First_JSON_Par.json"));

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

			JSONObject struc = (JSONObject) jsonObj.get("address");
			System.out.println("POstal Code is: " + struc.get("PostalCode"));
			////////////////////////////////////////////////////////////////
			String FirstNam = (String) jsonObj.get("FirstNam");
			System.out.println(FirstNam);
			
			JSONObject stru = (JSONObject) jsonObj.get("addres");
			System.out.println("Country is: " + stru.get("Country"));
			
			//ObjectMapper mapper = new ObjectMapper()
			
			JSONObject st = (JSONObject) jsonObj.get("addres"+"Weight");
			System.out.println("Weight is: " + st.get("Winter"));
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
