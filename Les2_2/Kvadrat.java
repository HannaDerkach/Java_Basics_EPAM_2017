package by.epam.jb.les02_9;

public class Kvadrat {
	public static void main(String[] args) {
		double Skv; // ������� �������� ��������
		double stononaKv;
		double radiusOkr;
		double skv2; // ������� ����������� ��������
		double x; // �� ������� ��� ������� ���������� �������� ������ ���������

		Skv = 25;
		stononaKv = Math.sqrt(Skv); // ��������� ������� ��������
		radiusOkr = stononaKv / 2;
		skv2 = 0.5 * radiusOkr * radiusOkr * 4;
		System.out.println("������� ���������� �������� - "+ skv2);
		x = Skv / skv2;

		System.out.println("x=" + x);
	}

}
