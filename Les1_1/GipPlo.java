package by.epam.jb.les01_tasks;

import java.util.Scanner;

public class GipPlo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double b;
		double a;
		String aStr;
		String bStr;

		System.out.print("Vvedite katet treugolnika a: ");
		aStr = sc.next();
		while (!isNumeric(aStr) || Double.parseDouble(aStr) <= 0) {
			System.out.print("a should be positive number, please enter valid value: ");
			aStr = sc.next();
		}
		a = Double.parseDouble(aStr);
		//repeat for b
		System.out.print("Vvedite katet treugolnika b: ");
		bStr = sc.next();
		while (!isNumeric(bStr) || Double.parseDouble(bStr) <= 0) {
			System.out.print("b should be positive number, please enter valid value: ");
			bStr = sc.next();
		}
		b = Double.parseDouble(bStr);
		
		double ñ = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		double S=a*b*0.5;
		System.out.print("gippotenuza treugolnika = "+ñ+" , Ploschad treugolnika = " +S);
		
	}
	
	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
				
	

	

}
