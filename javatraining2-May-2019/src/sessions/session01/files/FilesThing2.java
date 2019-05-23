package sessions.session01.files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilesThing2 {
	public static void main(String[] args) throws IOException {
		readFile();
	}

	private static void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("output/test.txt")));

		while (true) {
			String s = br.readLine();

			if (s == null) {
				break;
			}

			System.out.println(s);
		}

		br.close();
	}
}
