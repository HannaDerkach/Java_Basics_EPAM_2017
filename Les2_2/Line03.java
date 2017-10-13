package by.epam.jb.les02_10;

import java.util.Scanner;

public class Line03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int sumDigitNumber = 0;
		int kv_number;
		int kub_number;

		System.out.print("Vvedite chislo: ");
		if (sc.hasNextInt())
			number = sc.nextInt();

		kv_number = number * number;

		while (number % 10 != 0) {
			sumDigitNumber += number % 10;
			number = number / 10;
		}
		sumDigitNumber += number;
		kub_number = (int) Math.pow(sumDigitNumber, 3);

		if (kub_number == kv_number)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}

}