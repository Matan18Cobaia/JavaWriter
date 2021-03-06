package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("contas.csv"));
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();

			Scanner linhaScanner = new Scanner(linha);

			linhaScanner.useDelimiter(",");

			linhaScanner.useLocale(Locale.US);
			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			Double valor5 = linhaScanner.nextDouble();

			System.out.format(String.format(new Locale("pt", "BR"), "%s: %d-%04d, %15s: R$ %7.2f\n", valor1, valor2, valor3,
					valor4, valor5));

			linhaScanner.close();

		}
		scanner.close();

	}

}
