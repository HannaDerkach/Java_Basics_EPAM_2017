package by.epam.jb.les02_tasks;
import java.util.Scanner;
public class Virajeniya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,S,K;
		System.out.println("Vvedite a:");
		a=sc.nextInt();
		System.out.println("Vvedite b:");
		b=sc.nextInt();
		if(a==b) {System.out.print("Soon New Year!");}
		else {System.out.println("Vvedite c:");
		c=sc.nextInt();
		S=a+b+c;
		System.out.println("- znachenie virajiniya a+b+ñ = "+ S);
		K=a*a+b*b;
		System.out.println("- znachenie virajeniya a^2+b^2 = " +K);
		System.out.println("-"+"my favourite football team");}

	}

}
