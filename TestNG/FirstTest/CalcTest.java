package Test_NG;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CalcTest {

	private Calc calc = new Calc();
	
	@Test
	public void testSum() throws Exception{
		Assert.assertEquals(5, calc.sum(2,3));
	}
	@Test
	public void testDesc() throws Exception {
		Assert.assertEquals(10, calc.desc(15, 5));	
	}
	@Test
	public void testDiv() throws Exception {
		Assert.assertEquals(10.0, calc.div(100, 10) );
	}
	@Test
	public void testMultip() throws Exception {
		Assert.assertEquals(25.0, calc.multip(5, 5));
	}
}
