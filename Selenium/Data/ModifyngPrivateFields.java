package Reflection;
import java.lang.reflect.Field; 
public class ModifyngPrivateFields {

	public static void main(String[] args) throws Exception { 
        WithPrivateFinalField pf = new WithPrivateFinalField(); 
         
        Field f = pf.getClass().getDeclaredField("a"); 
        f.setAccessible(true); 
        f.setInt(pf, 40); 
        //System.out.println(pf); 
 
        f = pf.getClass().getDeclaredField("b"); 
        f.setAccessible(true); 
        f.set(pf, "Bubonak"); 
        //System.out.println(pf); 
 
 
        f = pf.getClass().getDeclaredField("c"); 
        f.setAccessible(true); 
        f.set(pf, "Bubusea"); 
       // System.out.println(pf); 
        
        f = pf.getClass().getDeclaredField("d");
        f.setAccessible(true);
       // System.out.println(pf);
        
        f = pf.getClass().getDeclaredField("e");
//        f.setAccessible(true);
        System.out.println(pf);
        
        
        
    } 
}
