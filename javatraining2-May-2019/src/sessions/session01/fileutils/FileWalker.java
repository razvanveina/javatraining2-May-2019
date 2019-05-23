package sessions.session01.fileutils;

import java.io.File;

public class FileWalker {
	public static void main(String[] args) {
		// File folder = new File("folderu meu");
		// folder.mkdir();

		File file;

		search(new File("."));
	}

	private static void search(File folder) {
		File[] files = folder.listFiles();
		for (File file : files) {
			System.out.println(file.getAbsolutePath() + " " + file.length());

			if (file.isDirectory()) {
				search(file);
			}

		}
	}
}
