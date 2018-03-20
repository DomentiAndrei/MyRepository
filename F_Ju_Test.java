package JUnit;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class F_Ju_Test {

	
	f_ju_testt calcul = new f_ju_testt();
	
	@Test
	public void sum () throws Exception{
		Assert.assertEquals(10, calcul.sum(2 , 8));
	}
	@Test
	public void sipp() throws Exception{
		Assert.assertNotEquals(10, calcul.sipp (2 ,7));
	}
	@Test 
	public void isa()throws Exception{
		Assert.assertFalse(false);
	
		
	}
	@Test
	public void main()throws Exception{
		Assert.assertEquals(60.0, calcul.main(0, 0, 0));
	}
	@Test(dataProvider = "data")
	public void dp(int a , int b)throws Exception{
		Assert.assertEquals(a + 10, b);
		
	}
	@DataProvider (name = "data")
	public Object [][]provide(){
		
		return new Object[][] {
			{10 , 20}
		};
	}
		
	
}
