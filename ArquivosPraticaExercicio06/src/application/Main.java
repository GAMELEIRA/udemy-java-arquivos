
package application;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA:23/02/2020
 * HORA:17:49
 * FINALIDADE DO PROGRAMA: REALIZAR CADASTROS DE PEDIDOS GRAVAR EM ARQUIVO CSV E LER O ARQUIVO
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Pedido;
import model.entities.Produto;
import model.services.Arquivo;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner dadosString, dadosNumericos;

		Arquivo arquivo;

		Produto produto;

		List<Pedido> pedidos;

		Pedido pedido;

		String nome;

		double preco;

		long quantidadeProdutos;

		long quantidadePedidos;

		pedidos = new ArrayList<Pedido>();

		dadosString = new Scanner(System.in);

		dadosNumericos = new Scanner(System.in);

		arquivo = new Arquivo();

		System.out.println("Quantos pedidos irá fazer?");

		quantidadePedidos = dadosNumericos.nextLong();

		for (int i = 1; i <= quantidadePedidos; i++) {

			pedido = new Pedido();

			System.out.println("Para o pedido " + i + ", quantos produtos irá relacionar?");

			quantidadeProdutos = dadosNumericos.nextLong();

			for (int a = 1; a <= quantidadeProdutos; a++) {

				System.out.println("Informe o nome do produto:");

				nome = dadosString.nextLine();

				System.out.println("Informe o preço do produto:");

				preco = dadosNumericos.nextDouble();

				produto = new Produto(nome, preco);

				pedido.adionarProdutos(produto);

			}

			pedido.setQuantidade(pedido.getProduto().size());

			pedidos.add(pedido);

		}

		arquivo.criarListaItensArquivos(pedidos);

		arquivo.lerItensVendidos();

	}

}
