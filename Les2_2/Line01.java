package by.epam.jb.les02_10;

import java.util.Scanner;

public class Line01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int digit = 0;

		System.out.print("Vvedite chislo: ");
		if (sc.hasNextInt())
			number = sc.nextInt();

		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			if (digit % 2 == 0) {
				System.out.println("V chisle est' chetnaya tsifra.");
				return;
			}
		}
		System.out.println("V chisle net chetnyh tsifr.");
	}

}