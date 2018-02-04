package Cartea;
import java.util.Scanner;
public class Circle_Area {

	public static void main (String [] args) {
		
		
		double radius;
		System.out.print("Enter radius");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		circleArea(radius);
		
		
	
	}
	public static double circleArea (double r) {
		
		double aria = Math.PI * Math.pow (r, 2);
		
		
		System.out.printf("Aria is:%.2f" , aria);
		return aria;
	}
}
