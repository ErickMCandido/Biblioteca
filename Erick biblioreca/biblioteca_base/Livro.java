package br.com.zaffari.biblioteca_base;

public class Livro {

	private String titulo;
	private String genero;
	private String autor;
	private String ISBN13;
	private int ano;
	private int preco;
	private int paginas;
	

	
	//constructor passando e guardando as informações
	Livro(String titulo, String genero , String autor,String ISBN13, int ano, int preco, int paginas) {
 
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
		this.ISBN13 = ISBN13;
		this.ano = ano;
		this.preco = preco;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getISBN13() {
		return ISBN13;
	}

	public void setISBN13(String iSBN13) {
		ISBN13 = iSBN13;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "titulo: " + this.titulo + ", genero: " + this.genero + ", autor: " + this.autor + ", ISBN13: " + this.ISBN13 + ", ano: " + this.ano + ", preco: " + this.preco + ", paginas: " + this.paginas;
	}
}