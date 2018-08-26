package Generics;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(234, 1234);
		
		int accID = (Integer) acc1.getId();
		System.out.println(accID);
		System.out.println(acc1.getSum());
		System.out.println("*********************************");
		Account acc2  = new Account("1200" , 21000);
		System.out.println(acc2.getId());
		System.out.println(acc2.getSum());
	}

}
