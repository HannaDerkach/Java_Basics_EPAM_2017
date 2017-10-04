package by.epam.jb.les01_5;

import java.io.FileReader;
import java.io.IOException;

public class VivodText {

	public static void main(String[] args) throws IOException {
		FileReader fin = new FileReader("C://Users/fk.by/eclipse-workspace/first-project/src/by/epam/jb/les01_5/abzac.txt");
		int c;
		while ((c = fin.read()) != -1)
			System.out.print((char) c);
	}
}