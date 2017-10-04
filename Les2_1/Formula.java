package by.epam.jb.les02_2;
import java.util.Scanner;
public class Formula {

	public static void main(String[] args) {

		double x = 0, y = 0, z;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("¬ведите x: ");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}

		System.out.print("¬ведите y: ");
		if (sc.hasNextDouble()) {
			y = sc.nextDouble();
		}

		double temp;
		temp = Math.cos(x) - x / 3;
		if (temp != 0) {
			z = x * Math.log(x) + y / temp;
		} else {
			System.out.println("«наменатель равен нулю.");
			z = Double.NaN;
		}

		System.out.println("z=" + z);

	}

}
