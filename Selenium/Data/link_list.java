package javSite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class link_list {
	@Test
	public void link() {
		
		List<String> link = new LinkedList<String>();
		link.add("Barsic");
		link.add("Murzic");
		link.add("Rijic");
		Iterator<String> iterator = link.iterator();
		
		
		String first = iterator.next();
		System.out.println("First Element in List is: " + "'" + first + "'");
		
		System.out.println("Second Element in List is: " + iterator.next());
		
		System.out.println("First------------------------------------First");
		List<String> cat =   new LinkedList<String>();
		cat.add("Vasea");
		cat.add("Olea");
		cat.add("Masa");
		ListIterator<String> itera = cat.listIterator();// for adding new element in midle of list is using "ListIterator"
		itera.next();//skip first element in list 
		itera.next();//skip second element in list
		itera.add("Andrei");
		System.out.println(cat.toString());
		System.out.println("------------------------------------");
		System.out.println("Now first element is: " + cat.get(0));
		cat.set(0, "Ina");
		System.out.println("------------------------------------");
		System.out.println("Now all element is: " + cat.toString());
		cat.remove(2);
		
		String name = "";
		for(String catNam : cat) {
			name = name + catNam + " ";
		}
		System.out.println("------------------------------------");
		System.out.println(name);
		
		boolean elem = cat.contains("Ina");
		System.out.println("Verify if list contains element Ina: " + elem);
		System.out.println("------------------------------------");
		int index = cat.indexOf("Ina");
		System.out.println("Ina is present in list under Index: " + index );
		
		
		boolean b = cat.isEmpty();
		System.out.println("List is Emppty: " + b);
		System.out.println("but now list is next: " + cat.toString());
		int a = cat.indexOf("Olea");
		System.out.println("Olea's index: " + a);
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
