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

public class NewFileCreate_JSON {

	public static void main (String [] args) {
		
		JSONObject obj = new JSONObject();
		
		obj.put("firstName", "Andrei");
		obj.put("lastName", "Domenti" );
		obj.put("age", new Integer(24));
		
		JSONArray list = new JSONArray();
		
		list.add("1 curs");
		list.add("2 curs");
		list.add("3 curs");
		list.add("4 curs");
		
		obj.put("years" , list);
		
		System.out.println("firstName: " + obj.get("firstName"));
		System.out.println("lastName: " + obj.get("lastName"));
		System.out.println("age: " + obj.get("age"));
		System.out.println(list);
		
		
		JSONArray PL = new JSONArray();
		
		PL.add("C");
		PL.add("C++");
		PL.add("Java");
		PL.add("Ruby");
		obj.put("Language", PL);
		
		
		for(int i = 0;i <PL.size();i++) {
			System.out.println(PL.get(i));
		}
		
		
		
		
		
		
		try (FileWriter file = new FileWriter ("D:\\test1.json")) {
			file.write(obj.toJSONString());
			file.flush();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
