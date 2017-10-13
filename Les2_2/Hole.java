package by.epam.jb.les02_10;

import java.util.Scanner;

public class Hole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, x = 0, y = 0, z = 0;

		System.out.print("Vvedite a: ");
		if (sc.hasNextDouble())
			a = sc.nextDouble();
		System.out.print("Vvedite b: ");
		if (sc.hasNextDouble())
			b = sc.nextDouble();
		System.out.print("Vvedite x: ");
		if (sc.hasNextDouble())
			x = sc.nextDouble();
		System.out.print("Vvedite y: ");
		if (sc.hasNextDouble())
			y = sc.nextDouble();
		System.out.print("Vvedite z: ");
		if (sc.hasNextDouble())
			z = sc.nextDouble();

		if ((a > x) && (b > y))
			System.out.println("Proydet.");
		else if ((a > y) && (b > x))
			System.out.println("Proydet.");
		else if ((a > x) && (b > z))
			System.out.println("Proydet.");
		else if ((a > z) && (b > x))
			System.out.println("Proydet.");
		else if ((a > y) && (b > z))
			System.out.println("Proydet.");
		else if ((a > z) && (b > y))
			System.out.println("Proydet.");
		else
			System.out.println("Ne Proydet.");
	}

}