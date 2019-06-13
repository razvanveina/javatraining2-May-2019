package sessions.session01.files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilesThing3 {
	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			System.out.println("Fisierul nu exista");
		}
	}

	private static void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("output/test.txt")));
		int sum = 0;
		while (true) {
			String s = br.readLine();

			if (s == null) {
				break;
			}

			String[] splits = s.split(",");

			for (String ss : splits) {
				try {
					int nr = Integer.parseInt(ss);
					sum += nr;
				} catch (NumberFormatException e) {
					System.out.println("Invalid number: " + ss);
				}
			}
		}
		System.out.println(sum);
		br.close();
	}
}
