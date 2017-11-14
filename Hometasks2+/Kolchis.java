package by.epam.jb.les02_tasks;

import java.util.Scanner;

public class Kolchis {
		public static void main(String[] args) {
		 int A;
		 int N;
		 int S = 0;
		 int K = 0;
		 int L = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vvedite kolichestvo chisel:");
		while(!sc.hasNextInt()) {
			System.out.println("Vvedite tseloe chislo!!!!");
			sc.next();
		}
		N=sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("Vvedite tseloe chislo:");
			while(!sc.hasNextInt()) {
				System.out.println("Vvedite tseloe chislo!!!!");
				sc.next();
			}
			A = sc.nextInt();
			if (A > 15) {
				//System.out.println(">15");
				K++;
			}
			if (A < 2) {
				//System.out.println("<2");
				L++;
			}
			if (A % 5 == 4) {
				S=S+A;

			}
		}
		System.out.println("Summa chisel, kotorye delyatsa na 5 s ostatkom 4 = " + S);
		System.out.println("Kolichestvo chisel >15 = "+K);
		System.out.println("Kolichestvo chisel <2 = "+L);
		
	}
}
//ѕрограмма запрашивает количество чисел, вводит целые числа в соответсвии с за€вленным количеством, определ€ет, сколько чисел больше 15 и <2, чему равно сумма чисел, которые дел€тс€ на 5 с остатком 4. 