package by.epam.jb.les02_tasks;
import java.util.Scanner;
public class task_3 {

	public static void main(String[] args) {
	    int N, evens = 0, absFif = 0, mod=0;
        double b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter count of numbers");
        while (!sc.hasNextInt()) {
            System.out.println("Enter whole number!");
            sc.next();
        }
        N = sc.nextInt();
        System.out.println("Enter " + N + " integer numbers");
        for (int i = 0; i < N; i++) {

            while (!sc.hasNextDouble()) {
                System.out.println("Enter double number!");
                sc.next();
            }
            b = sc.nextDouble();
            evens=(int)b;

            if (evens % 2 == 0) {
                absFif++;
            }
            if (evens>15){
                mod++;
            }

        }
        System.out.println("evens were = " + absFif);
        System.out.println("numbers >15 were  = " + mod);

    }

}
