package br.com.zaffari.biblioteca_base;

import java.time.LocalDate;


public class Vendas {
	private Livro Livro;
	private LocalDate dataCompra;
	private Cliente cliente;
	

	//criação da lsita de locação e o constructor
	
	
	public Vendas(Cliente cliente, Livro LivroComprado, LocalDate Data) {
		this.Livro = LivroComprado;
		this.dataCompra = Data;
		this.cliente = cliente;
	}

	public Livro getLivro() {
		return Livro;
	}

	public void setlivro(Livro livro) {
		this.Livro = livro;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setData(LocalDate data) {
		this.dataCompra = data;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	//metodo que adiciona as informações na lista locacao
	
	@Override
	public String toString() {
		return "titulo do Livro: " + this.Livro + ", data de compra: " + this.dataCompra + " Cliente: " + cliente ;
	}

}








