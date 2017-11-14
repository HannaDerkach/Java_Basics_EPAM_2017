package by.epam.jb.les02_tasks;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		double a, b, c,d;
		double V,D;
		Scanner sc = new Scanner(System.in);

		System.out.println("Vvedite a: ");
		a = sc.nextDouble();
		System.out.println("Vvedite b: ");
		b = sc.nextDouble();
		System.out.println("Vvedite c: ");
		c = sc.nextDouble();
		System.out.println("Vvedite d: ");
		d = sc.nextDouble();
		V = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + b;
		D = (a/c)*(b/d)-(a*b-c)/(c*d);
		System.out.println("Virajenie A) = " + V);
		System.out.println("Virajenie B) = " + D);
	}

}
