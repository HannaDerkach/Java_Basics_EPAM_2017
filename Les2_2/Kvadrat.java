package by.epam.jb.les02_9;

public class Kvadrat {
	public static void main(String[] args) {
		double Skv; // Площадь внешнего квадрата
		double stononaKv;
		double radiusOkr;
		double skv2; // Площадь внутреннего квадрата
		double x; // во сколько раз площадь вписанного квадрата меньше заданного

		Skv = 25;
		stononaKv = Math.sqrt(Skv); // вычисляем сторону квадрата
		radiusOkr = stononaKv / 2;
		skv2 = 0.5 * radiusOkr * radiusOkr * 4;
		System.out.println("Площадь вписанного квадрата - "+ skv2);
		x = Skv / skv2;

		System.out.println("x=" + x);
	}

}
