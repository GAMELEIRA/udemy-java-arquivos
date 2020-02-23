package model.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import model.entities.Pedido;

public class Arquivo {

	public void criarListaItensArquivos(List<Pedido> pedidos) {

		String pacote;

		pacote = "c:\\temp\\pedidos.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pacote, true))) {

			for (Pedido p : pedidos) {

				bw.write(p.toString());

				bw.newLine();

			}

		} catch (IOException e) {

			e.getStackTrace();

		}
	}

	public void lerItensVendidos() {

		Scanner dados = null;

		File file;

		file = new File("C:\\temp\\pedidos.csv");

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
