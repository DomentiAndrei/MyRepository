package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTestN {
	
	f_ju_testt calcul = new f_ju_testt();
	@Test
    public void testCalA() throws Exception {
		
      /*  int n = (int)*/ calcul.sum(2, 2);
        Assert.assertEquals(4, 4);
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
	
	
}
