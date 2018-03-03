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
			
			JSONArray Winter = (JSONArray) jsonObject.get("Winter");
			Iterator<String> iterator = Winter.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println("");
			
			JSONArray  Spring = (JSONArray) jsonObject.get("Spring");
			Iterator<String> iterato = Spring.iterator();
			while (iterato.hasNext()) {
				System.out.println(iterato.next());
			}
			System.out.println("");
			JSONArray  Fall = (JSONArray) jsonObject.get("Fall");
			Iterator <String> inter = Fall.iterator();
			while (inter.hasNext()) {
				System.out.println(inter.next());
			}
			System.out.println("");
			JSONArray Sammer = (JSONArray) jsonObject.get("Sammer");
			Iterator <String> in = Sammer.iterator();
			while(in.hasNext()) {
				System.out.println(in.next());
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
