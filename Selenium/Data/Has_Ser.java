package javSite;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Has_Ser {

	@Test
	public void hSet() {
		
		HashSet<String> country = new HashSet<String>();
		country.add("Rusia");
		country.add("Romania");
		country.add("Anglia");
		System.out.println("In this list is: " + country.size() + " Countries");
		
		Iterator<String> itera = country.iterator();
		
		while(itera.hasNext()) {
			
			System.out.println("Elements: " + itera.next());
		}
		System.out.println("--------------------------------");
		System.out.println("Element in lits:" + country.toString());
		System.out.println("--------------------------------");
		TreeSet <String> alfab = new TreeSet<String>();
		alfab.add("c");
		alfab.add("z");
		alfab.add("r");
		alfab.add("a");
		alfab.add("v");
		Iterator<String> iter = alfab.iterator();
		while(iter.hasNext()) {
			System.out.println("Element in alfabet: " + iter.next());
		}
		System.out.println("--------------------------------");
		
		System.out.println("All alfabet" + alfab.toString());
		
		TreeSet<Integer> inttr = new TreeSet<Integer>();
		inttr.add(12);
		inttr.add(10);
		inttr.add(82);
		System.out.println("Digets: " + inttr.toString());
		Iterator<Integer> d = inttr.iterator();
		while(d.hasNext()) {
			System.out.println("Digets2: " + d.next());
		}
	
		System.out.println("Size for this masic is: " + inttr.size());
		inttr.first();
		
	}
	@Test
	public void ArrView() {
		
		//ArrayAdapter<String> adapter;
		HashSet<String> setH = new HashSet<String>();
		setH.add("Rusia");
		setH.add("Romania");
		setH.add("Anglia");
		
		String [] array = {};
		array = setH.toArray(new String [setH.size()]);
		System.out.println(array);
		//final ListView listV = (ListView) findViewById();
		
		
		
	}
	@Test
	public void rand() {
		
		
		
		Random random = new Random(30);
		
		Set<Integer> inter = new HashSet<Integer>();
		
		for(int i = 0; i < 100; i++) {
			
			inter.add(random.nextInt(10));
			System.out.println(inter.toString());
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
