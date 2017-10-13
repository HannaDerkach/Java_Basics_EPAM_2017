package by.epam.jb.les02_10;

import java.util.Scanner;

public class Point2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
		double a, b;

		System.out.print("Vvedite x1: ");
		if (sc.hasNextDouble())
			x1 = sc.nextDouble();
		System.out.print("Vvedite y1: ");
		if (sc.hasNextDouble())
			y1 = sc.nextDouble();
		System.out.print("Vvedite x2: ");
		if (sc.hasNextDouble())
			x2 = sc.nextDouble();
		System.out.print("Vvedite y2: ");
		if (sc.hasNextDouble())
			y2 = sc.nextDouble();

		a = Math.sqrt(x1 * x1 + y1 * y1);
		b = Math.sqrt(x2 * x2 + y2 * y2);

		if (a < b)
			System.out.println("Tochka A blige k nachaly koordinat.");
		else if (a > b)
			System.out.println("Tochka B blige k nachaly koordinat.");
		else
			System.out.println("Tochki ravnomerno raspredeleny ot nachala koordinat.");
	}

}