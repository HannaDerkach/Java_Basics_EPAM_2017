package by.epam.jb.les02_10;

import java.util.Scanner;

public class Line02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0, C = 0, D = 0;
		int count = 0;

		System.out.print("Vvedite chislo A: ");
		if (sc.hasNextInt()) {
			A = sc.nextInt();
		}
		System.out.print("Vvedite chislo  B: ");
		if (sc.hasNextInt()) {
			B = sc.nextInt();
		}
		System.out.print("Vvedite chislo  C: ");
		if (sc.hasNextInt()) {
			C = sc.nextInt();
		}
		System.out.print("Vvedite chislo  D: ");
		if (sc.hasNextInt()) {
			D = sc.nextInt();
		}

		if (A % 2 == 0) {
			count++;
		}
		if (B % 2 == 0) {
			count++;
		}
		if (C % 2 == 0) {
			count++;
		}
		if (D % 2 == 0) {
			count++;
		}

		if (count >= 2) {
			System.out.println("V posledovatelnosti est bolee 2 chetnyh chisel.");
		} else {
			System.out.println("V posledovatelnosti net bolee 2 chetnyh chisel.");
		}
	}

}
