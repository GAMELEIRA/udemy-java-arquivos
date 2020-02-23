package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * AUTOR:GABRIEL GAMELEIRA DOS SANTOS
 * DATA:23/02/2020
 * HORA:14:00
 * FINALIDE DO PROGRAMA:LER UM ARQUIVO PELO CONSOLE.
 */

public class Main {

	public static void main(String[] args) {

		Scanner dados = null;

		File file;

		file = new File("C:\\temp\\teste1.txt");

		try {

			dados = new Scanner(file);

			while (dados.hasNextLine()) {

				System.out.println(dados.nextLine());

			}

		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());

		} finally {

			if (dados != null) {

				dados.close();
			}
		}

	}

}
