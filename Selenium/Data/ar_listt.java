package javSite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


import org.testng.annotations.Test;

public class ar_listt  extends Object{
	 public ArrayList<String > catNames = new ArrayList<String>(100);
	//ArrayList<Integer > catNaes = new ArrayList<Integer>();

	@Test
	public void arr_List() {

		catNames.add("Vasea");
		catNames.add("Murzik");
		catNames.add("Oleg");
		catNames.add("Max");
		catNames.add("IOn");
		catNames.add("Andrei");
		//catNames.add("Andrei");
		System.out.println("Elements in this list: " + catNames.toString());
//		System.out.println(catNames.get(0));
//		System.out.println(catNames.get(1));
//		System.out.println(catNames.get(2));
//		System.out.println( catNames.size());
//		System.out.println(catNames.get(catNames.size() -1  ));
		
		int paws = 4;
		//catNaes.add(paws);
		System.out.println(catNames.get(catNames.size() -1)  + " Size of massiv:" + catNames.size());
		
		catNames.ensureCapacity(100);
		
		catNames.trimToSize();
		int index = catNames.indexOf("Murzik");
		System.out.println("Murzic has index: " + index);
		
		String catName = "";
		for(int a = 0; a < catNames.size(); a++) {
			catName = catName + catNames.get(a) + " ";
		}
		System.out.println("All cats: " + catName);
		
		
		String catNamee = "";
		for(String name : catNames) {
			catNamee = catNamee + name + " ";
		}
		System.out.println("All cats: " + catNamee);
		System.out.println(catNames.contains("JOra " + "HZ"));
		
		
		int inde2 = catNames.indexOf("Andrei");
		System.out.println(inde2);
		
		catNames.remove(5); // or catNames.remove("Andrei");
		
		int inde3 = catNames.indexOf("Andrei");
		System.out.println("Andrei's Index: "+inde3);
		
		catNames.set(1, "Gheorghe");
		
		System.out.println(catNames.get(1)+ " ");
		
		// очистки массива метод clear(): catNames.clear();
		System.out.println("------------------------------------");
		int size = 100;
		ArrayList<String> myArrayList = new ArrayList<String>(size);
		myArrayList.ensureCapacity(size + 1);
		myArrayList.add("Россия");
		myArrayList.add("Польша");
		myArrayList.add("Греция");
		myArrayList.add("Чехия");
		
		String [] arrayM = {};
		arrayM = myArrayList.toArray(new String [myArrayList.size()]); //convert to  simple masiv
		System.out.println("------------------------------------");
		ArrayList <String> cat = new ArrayList<String>();
		cat.add("Colea");
		cat.add("Mihai");
		cat.add("Colea");
		
		int count  = Collections.frequency(cat, "Colea");// display in console how many Colea we have
		System.out.println(String.valueOf(count));
		
		catNames.remove(3);
		String catNam = " ";
		for(String nam : catNames) {
			catNam = catNam + nam + " "; 
		}
		System.out.println(catNam);
		
		
		List<String> list = new ArrayList<String>();//way to create ArrayList
		
		
		boolean a = cat.contains("Mihai"); //verify if Array list "cat" contains name "Mihai";
		System.out.println(a);
		boolean b = cat.contains("Jora");
		
		Collection<String> collect = new ArrayList<String>();//way to create ArrayList but collect doesn't have method set and get
		
		List <Integer> intt =  Arrays.asList(1,2,777);
	
		/*
		 * but using this approach we can't use methods "add" and "delete"; 
		 */
		
		System.out.println(intt.get(2) + "");
		
		intt.set(1, 10); //instead of 2 we set 10 // because 1 is index of element 2;
		System.out.println(intt.get(1));
		//System.arraycopy(1, 2, 3, 3, 4);//(oldData, 0, elementData, 0, size);
		
		
		catNames.add(1, "bomm");
		catNames.trimToSize();
		System.out.println("------------------------------------");
		ArrayList<String> listic = new ArrayList<String>(10);
		listic.add("a");
		listic.add("b");
		listic.add("c");
		
		int sizee = 0;
		
		listic.ensureCapacity(sizee + 1);
		
		
		
		
		
		
		
		
	}
}

















