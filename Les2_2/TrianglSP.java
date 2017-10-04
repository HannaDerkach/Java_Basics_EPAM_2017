package by.epam.jb.les02_4;
import static java.lang.Math.*;
import java.util.Scanner;

public class TrianglSP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1=0, y1=0, x2=0, y2=0, x3=0, y3=0;
		
		double a, b, c;
		double S, P;
		double p;
		
		System.out.print("¬ведите x1: ");
		if (sc.hasNextDouble()) {
			x1=sc.nextDouble();
		}
		System.out.print("¬ведите y1: ");
		if (sc.hasNextDouble()) {
			y1=sc.nextDouble();
		}
		System.out.print("¬ведите x2: ");
		if(sc.hasNextDouble()) {
			x2=sc.nextDouble();
		}
		System.out.print("¬ведите y2: ");
		if(sc.hasNextDouble()) {
			y2=sc.nextDouble();
		}
		System.out.print("¬ведите x3: ");
		if(sc.hasNextDouble()) {
			x3=sc.nextDouble();
		}
		System.out.print("¬ведите y3: ");
		if(sc.hasNextDouble()) {
			y3=sc.nextDouble();
		}
		a=sqrt(pow(abs(abs(x1)-abs(x3)),2)+pow(abs(abs(y1)-abs(y3)),2));
		b=sqrt(pow(abs(abs(x3)-abs(x2)),2)+pow(abs(abs(y3)-abs(y2)),2));
		c=sqrt(pow(abs(abs(x1)-abs(x2)),2)+pow(abs(abs(y1)-abs(y2)),2));
		P=a+b+c;
		p=P/2;
		S=sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println(a+ " " + b + " " + c);
		System.out.println("ѕериметр треугольника равен P=" + P + ", площадь S=" + S);
		
	}

}
