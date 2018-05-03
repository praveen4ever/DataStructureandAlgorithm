package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import unionFind.QucikUnionUF;
import unionFind.QuickFindUF;

public class Main {
	static File input = new File(System.getProperty("user.dir") + "/input/inputData.txt");

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {

		int size = 0;
		Scanner scanner = new Scanner(input);
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
		System.out.println("=========Quick Union===========");
		Scanner scanner1 = new Scanner(input);
		if (scanner1.hasNextInt())
			size = scanner1.nextInt();
		QucikUnionUF qucikUnionUF = new QucikUnionUF(size);

		while (scanner1.hasNext()) {
			int p = scanner1.nextInt();
			int q = scanner1.nextInt();
			qucikUnionUF.union(p, q);
		}
		for (int i = 0; i < quickFindUF.getId().length; i++) {
			System.out.println(i + " node " + qucikUnionUF.getId()[i]);
		}

	}

}
