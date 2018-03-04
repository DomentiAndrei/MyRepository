package Parsing_with_JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Pars_Second_JSON {

	public static void main(String[] args) {
		
		JSONParser parsering = new JSONParser();
		
		try {
			Object object = parsering.parse(new FileReader ("C:\\Users\\Andrei\\eclipse-workspace\\Test_Mav\\src\\main\\java\\Parsing_with_JSON\\Second_Pars_JSON.json"));
			
			JSONObject jsonObject = (JSONObject) object;
			System.out.println(jsonObject);
			
			long PhoneNumber = (Long) jsonObject.get("PhoneNumber");
			System.out.println("Connect by: " + PhoneNumber);
//			
			String Info =  (String) jsonObject.get("Info");
			System.out.println("Inforamtion about weather was provided by: " + Info);
//			
			
			JSONObject country = (JSONObject) jsonObject.get("Country");
			String City =  (String) country.get("City");
			System.out.println("City: " + City);
			
			JSONObject  Wint1 = (JSONObject) jsonObject.get("Country");
			JSONObject Winter = (JSONObject) Wint1.get("Winter");
			//String December = (String) Winter.get("December");
			System.out.println("Weather in first month of Winter : " + Winter.get("December"));
			
			JSONObject Spri1 = (JSONObject) jsonObject.get ("Country");
			JSONObject Spring = (JSONObject) Spri1.get("Spring");
			//String march = (String) Spring.get("March");
			System.out.println("Weather in first month of Spring : " + Spring.get("March"));
			
			JSONObject Summer1 = (JSONObject) jsonObject.get("Country");
			JSONObject Summer = (JSONObject) Summer1.get("Summer");
			String june = (String) Summer.get("June");
			System.out.println("Weather in first month of Sammer : " + june);
			
			JSONObject Fall1 = (JSONObject) jsonObject.get("Country");
			JSONObject Fall = (JSONObject) Fall1.get("Fall");
			//String september = (String) Fall.get("September");
			System.out.println("Weather in first month of Fall : " + Fall.get("September"));
			//////////////Weather for second months of year/////////////////
			
			
			
			String city = (String) jsonObject.get("City");
			System.out.println("City: " + city);
			
			
			JSONObject WinterCh = (JSONObject) jsonObject.get("Winter");
			String december = (String) WinterCh.get("December");
			System.out.println(december);
			
			JSONObject SptrigCh = (JSONObject) jsonObject.get("Spring");
			String spring = (String) SptrigCh.get("March");
			System.out.println(spring);
			
			JSONObject FallCH = (JSONObject) jsonObject.get("Fall");
			System.out.println(FallCH.get("September"));

			JSONObject SummerCH = (JSONObject) jsonObject.get("Summer");
			System.out.println(SummerCH.get("June"));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
