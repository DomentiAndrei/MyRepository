package Test_NG;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class Data_Provider {

		 @Test(dataProvider = "provideNumbers" /*, description = "sum"*/)
		 public void test(int number, int expected) {
		 Assert.assertEquals(number + 10, expected);
		 }
		
		 @DataProvider (name = "provideNumbers")
		 public Object[][] provideData() {
		
		 return new Object[][] {
		 { 100, 110 },
		 { 100, 110 },
		 { 200, 210 },
		 {300, 310},
		 {0, 10}
		};
	 }

		@Test(dataProvider = "provideNumbers1")
		public void testS(int number,int number1,int number2, int expected) {
			Assert.assertEquals(number + number1 + number2 + 100, expected);
		}

		@DataProvider(name = "provideNumbers1")
		public Object[][] provideData1() {

			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = in.nextInt();
			int c = 1;
			while (a != 1 /*&& b != 1*/) {
				a = in.nextInt();
				b = in.nextInt();
			}
			return new Object[][] {

					{a, 1, c, 103 },
					{c, 1, b, 103 }
			};
		}
	}


