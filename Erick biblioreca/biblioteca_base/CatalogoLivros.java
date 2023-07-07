package br.com.zaffari.biblioteca_base;

import java.util.ArrayList;


public class CatalogoLivros {

	Livro livro;
	ArrayList<Livro> Lista = new ArrayList<Livro>();

	public void adicionaLivro(Livro livro) {
		Lista.add(livro);
	}

	
	// metodos que procuram o tipo de lista desejado seja por nome, genero e etc.
	public ArrayList<Livro> titulo(String Titulo) {
		ArrayList<Livro> ListaTitulo = new ArrayList<Livro>();

		for (Livro livro : Lista) {
			String strTitulo = livro.getTitulo();
			if (strTitulo.contains(Titulo)) {
				ListaTitulo.add(livro);
			}
		}
		System.out.println(ListaTitulo);
		return ListaTitulo;
	}

	public ArrayList<Livro> autor(String Autor) {
		ArrayList<Livro> ListaAutor = new ArrayList<Livro>();

		for (Livro livro : Lista) {
			String StrAutor = livro.getAutor();
			if (StrAutor.contains(Autor)) {
				ListaAutor.add(livro);
			}
		}
		System.out.println(ListaAutor);
		return ListaAutor;
	}

	public ArrayList<Livro> PesquisaAno(int AnoLançamento) {
		ArrayList<Livro> ListaAno = new ArrayList<Livro>();

		for (Livro livro : Lista) {
			if (livro.getAno() == AnoLançamento) {
				ListaAno.add(livro);
			}
		}
		System.out.println(ListaAno);
		return ListaAno;
	}

	public ArrayList<String> PesquisaGenero(String Genero) {
		ArrayList<String> ListaGenero = new ArrayList<String>();

		for (Livro livro : Lista) {

			/*
			 * String strGenero = filme.getGenero(); if(strGenero.contains(Genero)) {
			 * 
			 * }
			 */

			if (livro.getGenero().contains(Genero)) {
				ListaGenero.add(livro.getTitulo());
			}
		}
		System.out.println(ListaGenero);
		return ListaGenero;
	
	}
	public ArrayList<Livro> PesquisaValor(int minimo, int maximo) {
		ArrayList<Livro> ListaResultado = new ArrayList<Livro>();

		for (Livro livro : Lista) {
			//if (livro.getPreco() == MediaVAlor) {
			if (livro.getPreco() >= minimo && livro.getPreco()<= maximo)
			{
				ListaResultado.add(livro);
			}
		} 
		System.out.println(ListaResultado);
		return ListaResultado;
	}
	
}

