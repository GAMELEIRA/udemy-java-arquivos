package application;


/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA:23/02/2020
 * HORA:16:30
 * FINALIDADE DO PROGRAMA: INSERIR VALORES NO ARQUIVO E CRIAR ARQUIVO
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String[] linhas = new String[] {"Gabrielly", "Gameleira", "Pache"};
		
		String pacote;
		
		pacote = "c:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pacote, true))){
			
			for(String linha :linhas) {
				
				bw.write(linha);
				
				bw.newLine();
				
			}
			
			
		} catch(IOException e) {
		
			e.getStackTrace();
			
		}
	}

}
