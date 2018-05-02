package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import unionFind.QuickFindUF;

public class Main {
	static File input = new File(System.getProperty("user.dir") + "/input/inputData.txt");

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(input);
		int size = 0;
		if (scanner.hasNextInt())
			size = scanner.nextInt();

		QuickFindUF quickFindUF = new QuickFindUF(size);

		while (scanner.hasNext()) {
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			quickFindUF.union(p, q);
		}
		for (int i = 0; i < quickFindUF.getId().length; i++) {
			System.out.println(i + " node " + quickFindUF.getId()[i]);
		}

	}

}
