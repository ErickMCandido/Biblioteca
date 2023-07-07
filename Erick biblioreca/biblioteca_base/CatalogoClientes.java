package br.com.zaffari.biblioteca_base;

import java.util.ArrayList;



public class CatalogoClientes {
	
	//lsita para listar clientes

	Cliente cliente;
	ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

	public void AdicionaCliente(Cliente cliente) {
		listaDeClientes.add(cliente);
	}
	public ArrayList<Cliente> buscaClientePorNome(String Cliente) {
		ArrayList<Cliente> ListaCliente = new ArrayList<Cliente>();

		for (Cliente cliente : listaDeClientes) {
			String strCliente = cliente.getNome();
			if (strCliente.contains(Cliente)){
				ListaCliente.add(cliente);
			}
}
		System.out.println(ListaCliente);
		return ListaCliente;
	}
	
}