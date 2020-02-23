package application;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA:23/02/2020
 * HORA:17:20
 * FINALIDADE DO PROGRAMA: LER DADOS DO ARQUIVO
 *
 */


import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Entre com o caminho da pasta:");
		
		String strPath = dados.nextLine();
		
		File path = new File(strPath);
		
		System.out.println(path.getName());
		
		System.out.println(path.getParent());
		
		System.out.println(path.getPath());

		dados.close();

	}

}
