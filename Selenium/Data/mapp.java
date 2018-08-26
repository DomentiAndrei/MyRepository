package javSite;

import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class mapp {
	@Test
	public  void mai() {

		Map staf = new TreeMap<String, String>();
		
		staf.put("1", "Andrei");//key is 1 and value is Jora;
		String one = "1";
		System.out.println(staf.get(one));
		System.out.println("-----------------------------------");
		staf.put("2", "10");
		String two = "2";
		System.out.println(staf.get(two));
		System.out.println("-----------------------------------");
		
		staf.put("o", "operaMini");
		Object val = staf.get("o");
		System.out.println(val);
		System.out.println(staf.get("o"));
		
		
		
		System.out.println("-----------------------------------");
		int z ;
		staf.put("n",  z = 25);
		String thr = "n";
		System.out.println(staf.get(thr));
		System.out.println("-----------------------------------");
		int size = staf.size();
		System.out.println("Size for this Mas is: " + size);
		System.out.println("-----------------------------------");
		
		
		String key = "123";
		staf.put(key, 1234567890);
		boolean f = staf.containsKey(key);
		System.out.println(f);//verify if key with value "123" has something 
		System.out.println(staf.get(key));
		System.out.println("-----------------------------------");
		
		String keys = "12";
		staf.put(keys, 999);
		boolean c = staf.containsKey(keys);
		System.out.println("this key is: " + c);
		System.out.println(staf.get(keys));
		
		
		
		System.out.println("-----------------------------------");
		int date = 1993;
		staf.put("m", date);
		boolean tF = staf.containsValue(date);
		System.out.println(tF);
		System.out.println(staf.get("m"));
		
		
		
		System.out.println("-----------------------------------");
		boolean egu = staf.equals(key);
		System.out.println("Element: " + egu);
		
		
		System.out.println("Equals: " + key.equals(keys));
		
		String da = "12";
		staf.put(da, "Hellow Andrei" + 1);
		System.out.println(staf.get(da));
		
		
		
		
		
		
	}
}
