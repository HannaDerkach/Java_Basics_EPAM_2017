package by.epam.jb.les02_tasks;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		double K;
		double H;
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vvedite a: ");
		a = sc.nextDouble();
		if (a<0) {
			System.out.print("a^4= "+Math.pow(a, 4));
			
		}
		if (a>=0) {
			System.out.println("a^2= "+Math.pow(a, 2));
		}
		System.out.println("Vvedite b: ");
		b = sc.nextDouble();
		if (b<0) {
			System.out.println("b^4= "+Math.pow(b, 4));
			
		}
		if (b>=0) {
			System.out.println("b^2= "+Math.pow(b, 2));
		}
		System.out.println("Vvedite c: ");
		c = sc.nextDouble();
		if (c<0) {
			System.out.println("c^4= "+Math.pow(c, 4));
			
		}
		if (c>=0) {
			System.out.println("c^2= "+Math.pow(c, 2));
		}
		
		
		
		
	}

}
