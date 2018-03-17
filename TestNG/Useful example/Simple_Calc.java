package Test_NG;
import java.util.Scanner;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Simple_Calc {

	static Scanner inp = new Scanner(System.in);
	private static S_C calc = new S_C();

	@Test
	public static void sumD() {

		int a = inp.nextInt();
		int b = inp.nextInt();
		
		Assert.assertEquals(10, calc.sumD(a, b)); // fail if user introduces values which in sum isn't 10 
	}

	@Test(dependsOnMethods = { "sumD" })
	public static void descD() {
		Assert.assertEquals(10, calc.descD(19, 9)); // fail if change values to (20, 9). etc
	}
	
	@Test (timeOut = 2000)
	public static void divD ()throws Exception {
		Assert.assertEquals(100.0, calc.divD(1000, 10)); 
		//Thread.sleep(2001); // fail if timeOut will be more than 2 seconds
	}
	@Test (enabled = true)  // test will be ignored if (enabled =  false) and run if (enabled =  true)
	public static void mulD() {
		Assert.assertEquals(50.0, calc.mulD(5, 10));
	}
	@Test(groups = {"unit1"}) //group "unit1" include methods "gr" and "gr1"
	public static void gr() {
		Assert.assertEquals(123, calc.gr(100, 22, 1));	
	}
	@Test (groups = {"unit1"})
	public static void gr1() {
		Assert.assertFalse(false);  // if assertFalse(true) > test will fail or assertTrue(false)
	}
	@Test(groups = {"unit2"})
	public static void gr2() {
		Assert.assertNotEquals(10, calc.gr2(5, 1, 2)); //change any value -> test will fail
	}
	@Test(groups = {"unit1", "unit2"})
	public static void groups() {
		Assert.assertNotSame(100, 10); // test will fail if values (100, 100)
	}
	@Test(dependsOnGroups = {"unit1"}) // if at least one test which included in group unit1 will fail this test won't execute
	public static void depends() {
		Assert.assertSame(100, 100);
	}
	@Test (expectedExceptions = ArithmeticException.class)// test will fail if 0 change to any value
	public static void excep() {
		double a = 100 * 5 / 0;
		
	}
	@Test(dependsOnMethods = {"sumD", "descD", "divD", "mulD", "excep"}, dependsOnGroups = {"unit1", "unit2"})// if at least one test which include in groups or if at least one method won't pass the test won't run             
	public static void allDepend() {
		 Scanner inn = new Scanner(System.in);
		 int d = inn.nextInt();
		Assert.assertEquals(20, calc.allDepend(d));
//		Assert.assertEquals(20, calc.allDepend(10 , 10));
	}
	
}
