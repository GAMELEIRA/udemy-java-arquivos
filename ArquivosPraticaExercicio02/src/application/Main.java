package application;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA:23/02/2020
 * HORA:15:30
 * FINALIDADE DO PROGRAMA: LER ARQUIVO
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String caminho = "c:\\temp\\teste1.txt";

		FileReader fr = null;

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){

			String line = br.readLine();

			while (line != null) {

				System.out.println(line);

				line = br.readLine();

			}

		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());

		}

	}

}
