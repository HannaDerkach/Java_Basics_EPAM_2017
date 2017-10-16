package by.epam.jb.les01_tasks;
import java.util.Scanner;
import java.math.*;
public class Virajenie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		double V;
		
		System.out.println("Vvedite a:");
		a=sc.nextInt();
		System.out.println("Vvedite b:");
		b=sc.nextInt();
		System.out.println("Vvedite c:");
		c=sc.nextInt();
		V = Math.pow(a, 2)-Math.pow((b-c), 2)+Math.log(b*b+1);
		System.out.print("Virajenie ="+V);

	}

}
