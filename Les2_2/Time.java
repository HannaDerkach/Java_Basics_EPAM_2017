package by.epam.jb.les02_10;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		int n = 0;
		int hour, min, sec;
		Scanner sc = new Scanner(System.in);

		System.out.print("Vvedite kolichestvo seconds: ");
		if (sc.hasNextInt())
			n = sc.nextInt();

		if ((n > 86400) || (n < 0)) {
			System.out.println("Nevernoe znachenie.");
			return;
		}

		hour = n / 3600;
		n = n - hour * 3600;
		min = n / 60;
		n = n - min * 60;
		sec = n;

		System.out.println("V " + n + " seconds: " + hour + " h. " + min + " m. " + sec + " s.");

	}

}