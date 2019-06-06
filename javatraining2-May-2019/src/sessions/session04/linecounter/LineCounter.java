package sessions.session04.linecounter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LineCounter {

	private Params params;
	private int folderCounter;
	private int fileCounter;
	private List<FileHandler> fileHandlers = new ArrayList<>();
	private int lineCounter;

	public LineCounter(Params params) {
		this.params = params;
	}

	public void search() {
		search(params.getFolder());
	}

	private void search(File folder) {
		File[] files = folder.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				search(file);
				folderCounter++;
			} else {
				if (isJavaFile(file)) {
					handle(file);
				}
			}

		}
	}

	private void handle(File file) {
		fileCounter++;
		FileHandler fh = new FileHandler(file);
		fh.analyse();

		lineCounter += fh.getLineCounter();

		if (params.isIgnoreSpaces()) {
			lineCounter -= fh.getEmptyLineCounter();
		}
	}

	private boolean isJavaFile(File file) {
		return file.getAbsolutePath().endsWith(".java");
	}

	@Override
	public String toString() {
		String result = "";
		result += folderCounter + " folders" + System.lineSeparator();
		result += fileCounter + " files" + System.lineSeparator();
		result += lineCounter + " lines" + System.lineSeparator();
		return result;
	}
}
