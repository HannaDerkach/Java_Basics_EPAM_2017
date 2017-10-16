package by.epam.jb.les01_tasks;

import java.util.Scanner;

public class NewYearABC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, S;
		System.out.println("Vvedite a:");
		a = sc.nextInt();
		System.out.println("vvedite b:");
		b = sc.nextInt();
		if (a > b) {
			System.out.println("Vvedite c:");
			c = sc.nextInt();
			S = c + b;
			System.out.println("b+c = " + S);
		}
		if (a == b) {
			System.out.println("End.");
		}
		if (a < b) {
			System.out.println("Vvedite c:");
			c = sc.nextInt();
			S = a + b + c;
			System.out.print(+S + " " + "New Year!");
		}
	}

}
