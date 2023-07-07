package br.com.zaffari.biblioteca_base;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ListaCompras {

	
	ArrayList<Vendas> listaVendas = new ArrayList<Vendas>();
	
	ArrayList<Integer> livroMaisVendido = new ArrayList<Integer>();
	
	public void adicionaListaCompra(Vendas Vendas) {
		listaVendas.add(Vendas);
	}
	public void imprimeListaVendas() {
		System.out.println(listaVendas);
	}
	public void imprimeListaCompraPorNomeCliente(String busca) {
		 		
		for(Vendas element: listaVendas) {
			if(element.getCliente().getNome().contains(busca)) {
				System.out.println("Este cliente comprou o Livro: " +  element.getLivro().getTitulo() + " em: " +element.getDataCompra());
			}
		}
	}
	public void Vendidos7Dias(){
			ArrayList<String> resultadoBusca = new ArrayList<String>();
			long tempoEmDias = 0;
			
				for(Vendas element: listaVendas) {
					
					LocalDate comparada = element.getDataCompra();
					LocalDate hoje = LocalDate.now();
					
					tempoEmDias = comparada.until(hoje, ChronoUnit.DAYS);
					
					if(tempoEmDias <= 7) {
						resultadoBusca.add(element.getLivro().getTitulo());
					}
		} System.out.println(resultadoBusca);	
	}
	public void vendasDoMesDeJunho() {
			ArrayList<String> livrosVendidosMes = new ArrayList<String>();
			
			for (Vendas venda: listaVendas) {
				
				if(venda.getDataCompra().getMonth().equals(Month.JUNE) ){
					
					livrosVendidosMes.add(venda.getLivro().getTitulo());
					
				}
				
			} System.out.println(livrosVendidosMes);
		}
	public void livroMaisVendido() {
		
			for (Vendas venda : listaVendas) {
				String ISBN = venda.getLivro().getISBN13();
				if(livroMaisVendido.contains(listaVendas));
				String maisVendido = element.getLivro().getTitulo();
			
			
			
			
			}
			
		}
}
