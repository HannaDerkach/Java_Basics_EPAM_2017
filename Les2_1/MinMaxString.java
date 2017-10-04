package by.epam.jb.les02_3;

import java.util.Scanner;

public class MinMaxString {

	public static void main(String[] args) {
		int n = 10;
		Scanner sc = new Scanner(System.in);
		String max = "", min = "", str = "";// текущая строка

		for (int i = 0; i < n; i++) {
			System.out.print("> ");
			if (sc.hasNextLine()) // проверка введена ли строка
			{
				str = sc.nextLine();
				if (i == 0) {
					min = str;
				}
				if (str.length() > max.length()) {
					max = str;
				} else if (str.length() < min.length()) {
					min = str;
				}
			}
		}
		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());

	}

}
