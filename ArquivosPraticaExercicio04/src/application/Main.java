package application;


/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA:23/02/2020
 * HORA:17:00
 * FINALIDADE DO PROGRAMA: CRIAR PASTA E LER ARQUIVO CONTIDO NA PASTA
 */

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner dados;

		dados = new Scanner(System.in);

		System.out.println("Entrar com o caminho para a pasta:");

		String strpath = dados.nextLine();

		File path = new File(strpath);

		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("Folders:");

		for (File folder : folders) {

			System.out.println(folder);

		}

		File[] files = path.listFiles(File::isFile);

		System.out.println("Files:");

		for (File file : files) {
			
			System.out.println(file);

		}

		
		boolean sucess = new File(strpath + "\\subdir").mkdir();		
	
		System.out.println("Diretório criado!" + sucess);
	
	}

}
