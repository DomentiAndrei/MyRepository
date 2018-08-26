package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

import org.springframework.boot.origin.SystemEnvironmentOrigin;

public class child  extends parent{
	
 static int a  = 1;

	public static void main(String[] args) throws Exception  {
	
		child  pf = new child();
		Class b = pf.getClass();
		String superClass = b.getSuperclass().getName();
		System.out.println("First wait: Super Class Name: " + superClass);
		
		Class aclass = pf.getClass();
		System.out.println("Name of current class" + aclass);
		
		parent par = new parent();
		System.out.println(par.getClass());
		System.out.println(par.ol);
		
		

		
		
		Field chi = pf.getClass().getDeclaredField("a");
		System.out.println("a = " + pf);
		System.out.println(a);
//		//////
		parent bclas = new parent();
		Field field = bclas.getClass().getDeclaredField("z");
		System.out.println(bclas);
//	
		String a = bclas.getClass().getName();
		System.out.println("Second way how to get parent class name: " + a + "");
//////		
		field = bclas.getClass().getDeclaredField("ol");
		System.out.println(bclas);
//		
		field = bclas.getClass().getDeclaredField("tt");
		System.out.println(bclas);
//		
		field.setAccessible(true);
		field.set(bclas, "20");
		System.out.println(bclas);
////		
		Class c =  bclas.getClass();
		int z = c.getModifiers();
		if(Modifier.isPublic(z)) {
			System.out.println("Public");
		}
		if(Modifier.isPrivate(z)) {
			System.out.println("Private");
		}
		if(Modifier.isFinal(z)) {
			System.out.println("Final");
		}
		if(Modifier.isAbstract(z)) {
			System.out.println("Abstract");
		
		}
		Field[] z1 = bclas.getClass().getFields();
		System.out.println(bclas);
		
		System.out.println("*******************************");
		Field[] xxx = bclas.getClass().getDeclaredFields();
		
		for(Field fiel : xxx) {
			System.out.println("Variabile Name: " + fiel.getName());
			System.out.println("DataType of Variable: " + fiel.getType());
			int accesModi = fiel.getModifiers();
			System.out.println("Access Modifier of variable: " + Modifier.toString(accesModi));
			System.out.println("Value of the Variable: " + fiel.get(fiel));
			System.out.println("*******************************");
		}
//		
	}

}
