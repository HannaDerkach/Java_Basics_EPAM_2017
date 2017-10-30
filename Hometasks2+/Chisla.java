package by.epam.jb.les02_tasks;

import java.util.Scanner;

public class Chisla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cNum;
		int whNum;
		int c = 0;

		int evenCount = 0;
		int threeSum = 0;
		int absCount = 0;
		System.out.println("Enter count of numbers: ");
		cNum = sc.nextInt();
		System.out.println("cNum = " + cNum);
		while (c < cNum) {
			System.out.println("Enter whole numbers: ");
			whNum = sc.nextInt();
			if (whNum % 2 == 0) {
				evenCount++;

			}

			if (whNum % 3 == 0) {
				threeSum += whNum;

			}
			if (Math.abs(whNum) < 3) {
				absCount++;
			}
			c++;
		}
		System.out.println("Count of even numbers = " + evenCount);
		System.out.println("Summa of %3 numbers = " + threeSum);
		System.out.println("Count of numbers abs<3 = " + absCount);
	}

}
