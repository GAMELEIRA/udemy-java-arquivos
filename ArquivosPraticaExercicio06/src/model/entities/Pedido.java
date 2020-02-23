package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	List<Produto> produto;

	long quantidade;

	public Pedido() {

		this.produto = new ArrayList<Produto>();
	}

	public Pedido(List<Produto> produto, long quantidade) {

		this.produto = new ArrayList<Produto>();

	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	public List<Produto> getProduto() {

		return produto;

	}

	@Override
	public String toString() {
		return "Pedido [produto=" + produto + ", quantidade=" + quantidade + ", getQuantidade()=" + getQuantidade()
				+ ", getProduto()=" + getProduto().toString() + "]";
	}

	public void adionarProdutos(Produto produto) {

		this.produto.add(produto);

	}

}
