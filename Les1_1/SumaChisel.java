package by.epam.jb.les01_tasks;
import java.util.Scanner;

public class SumaChisel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,S;
		System.out.println("Vvedite a:");
		a=sc.nextInt();
		System.out.println("Vvedite b:");
		b=sc.nextInt();
		System.out.println("Vvedite c:");
		c=sc.nextInt();
		System.out.println("Vvedite d:");
		d=sc.nextInt();
		S=a+b+c+d;
		System.out.print("Summa = "+ S);
		

	}

}
