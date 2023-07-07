package br.com.zaffari.biblioteca_base;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;

public class AplicacaoBiblioteca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CatalogoLivros Cat = new CatalogoLivros();
		CatalogoClientes CatCliente = new CatalogoClientes();
	//	compra list = new compra(null, null, null);
		ListaCompras listC = new ListaCompras();
		
		
		//===========================================================================================================================================

		Cliente Joao = new Cliente("João Pedro De Sá Rodrigues Batista Alencar", 20, 00100200320);
		Cliente Yuri = new Cliente("Yuri Saldanha Segobia ", 21, 00100200310);
		Cliente Artur = new Cliente("Artur Peres De Carvalho", 18, 00100200330);
		Cliente Henrique = new Cliente("Henrique Mariano de Almeida", 18, 00100200360);
		Cliente Maria = new Cliente("Maria Vaz Muller", 18, 0010020000);
		Cliente Adriane = new Cliente("Adriane Pereira Benites", 20, 0010020036);
		Cliente Gabriel = new Cliente("Gabriel Dos Santos Fraga Vicente", 17, 0110420036);
		Cliente Max = new Cliente("Maxwel Nunes Gomes", 23, 0112420037);
		
		CatCliente.AdicionaCliente(Joao);
		CatCliente.AdicionaCliente(Yuri);
		CatCliente.AdicionaCliente(Artur);
		CatCliente.AdicionaCliente(Henrique);
		CatCliente.AdicionaCliente(Maria);
		CatCliente.AdicionaCliente(Adriane);
		CatCliente.AdicionaCliente(Gabriel);
		CatCliente.AdicionaCliente(Max);
		
	//	===============================================================================================================================================================================================
		
		
		//cria o filme, nomeando e passndo outras informações por parametro
		Livro Wish = new Livro("The Wish", "romance", "Nicholas Sparks", "9781538728628", 2021, 14, 400);
		Livro SocandoOAr = new Livro("Socando o ar","mistério, suspense", "Ibi Zoboi, Yusef Salaam", " 9786555111514", 2019, 39, 400);
		Livro EmBuscaDeMim = new Livro("Em busca de mim", "biografia, drama", "Viola Davis", "9786557121382", 2019, 30, 317);
		Livro IronFlame = new Livro("Iron Flame (The Empyrean, 2)","Fantasia Epica, Fantasia Romantica", " Rebecca Yarros ","1649374172", 2023, 18, 640);
		Livro TheReturn = new Livro("The Return","Ficcao rural, cidades pequenas", "Nicholas Sparks","9781538728574", 2020, 14, 368);
		Livro OPequenoPríncipe = new Livro("O Pequeno Príncipe","classico de ficção", "Antoine de Saint-Exupéry","9781507159033", 2016, 19, 76);
		Livro CaféComDeusPai  = new Livro("Café Com Deus Pai ","Devocional, motivação", "Junior Rostirola ","9786555843149", 2019, 34, 424);
		Livro ComoVencerSuasGuerrasPelaFé = new Livro("Como Vencer Suas Guerras Pela Fé","auto-ajuda, espiritualidade e religiao, saude familia", "Edir Macedo","978-8571409378", 2019, 28, 264);
		Livro OEspíritoSantoEABíblia = new Livro("O Espírito Santo e a Bíblia","Espiritualidade, Vida com Deus", "Paul E. Brown","978-8576221241", 2019, 41, 208 );
//		Livro TheReturn = new Livro("The Return","Ficcao rural, cidades pequenas", "Nicholas Sparks","9781538728574", 2020, 14, 368);
//		Livro TheReturn = new Livro("The Return","Ficcao rural, cidades pequenas", "Nicholas Sparks","9781538728574", 2020, 14, 368);
		
		
		
		
		//adiciona o filme na classe catalogo
		Cat.adicionaLivro(Wish);
		Cat.adicionaLivro(SocandoOAr);
		Cat.adicionaLivro(TheReturn);
		Cat.adicionaLivro(EmBuscaDeMim);
		Cat.adicionaLivro(IronFlame);
		Cat.adicionaLivro(OPequenoPríncipe);
		Cat.adicionaLivro(CaféComDeusPai);
		Cat.adicionaLivro(ComoVencerSuasGuerrasPelaFé);
		Cat.adicionaLivro(OEspíritoSantoEABíblia);
	//	=====================================================================================================================================================================
		
		//cria informações extras do cliente
		Vendas cliente1 = new Vendas(Joao, SocandoOAr, LocalDate.of(2023, Month.JUNE, 22));
		Vendas cliente2 = new Vendas(Adriane, Wish, LocalDate.of(2023, Month.JUNE, 01));
		Vendas cliente3 = new Vendas(Artur, SocandoOAr , LocalDate.of(2023, Month.JUNE, 04));
		Vendas cliente4 = new Vendas(Henrique,TheReturn , LocalDate.of(2023, Month.JUNE, 25));
		Vendas cliente5 = new Vendas(Yuri,EmBuscaDeMim , LocalDate.of(2023, Month.JUNE, 10));
		Vendas cliente6 = new Vendas(Gabriel,EmBuscaDeMim , LocalDate.of(2023, Month.JUNE, 16));
		Vendas cliente7 = new Vendas(Joao, EmBuscaDeMim, LocalDate.of(2023, Month.JUNE, 26));
		Vendas cliente8 = new Vendas(Max, SocandoOAr, LocalDate.of(2023, Month.JUNE, 19));
		
		
		// adiciona essas informações na classe locação
		listC.adicionaListaCompra(cliente1);
		listC.adicionaListaCompra(cliente2);
		listC.adicionaListaCompra(cliente3);
		listC.adicionaListaCompra(cliente4);
		listC.adicionaListaCompra(cliente5);
		listC.adicionaListaCompra(cliente6);
		listC.adicionaListaCompra(cliente7);
		listC.adicionaListaCompra(cliente8);
		
	//============================================================================================================================================================================
		
		
		
		boolean começo = true;

		do {
			// CABEÇARIO
			System.out.println("Olá, selecione uma das opções abaixo:");
			System.out.println();
			System.out.println("1: Pesquisa por titulo / 2: Pesquisa por ano / 3:pesquisa genero / 4: pesquisa por autor(es) /5: consultar livros por valor /" + 
			"6:Consultar lista clientes / 7:livros comprados nos ultimos 7 dias / 8: total de vendas do mes / 9:Livro mais Vendido / 10: sair");
			int opção = sc.nextInt();// MOSTRA O NUMERO DIGITADO DAS OPÇÕES

			switch (opção) {

			case 1:// CASO TECLE 1 INICIASSE A OPÇÃO 1
				System.out.println("digite o titulo do livro");
				String titulo = sc.next();
				Cat.titulo(titulo);
				System.out.println();
				break;

			case 2:// PESQUISA POR ANO
				System.out.println("Digite o ano do Livro");
				int Ano = sc.nextInt(); // Digita o ano
				Cat.PesquisaAno(Ano); // procura na classe catalago o metodo pesquisa ano
				System.out.println();
				break;

			case 3:// PESQUISA POR GENERO
				System.out.println("Digite o Genero do Livro");
				String Genero = sc.next(); // digita o genero
				Cat.PesquisaGenero(Genero);// procura na classe catalogo o metodo pesquisa por genero
				System.out.println();
				break;

			case 4:// PESQUISA POR AUTOR
				System.out.println("digite o nome do Autor(es)");
				String Autor = sc.next(); // Digita o autor
				Cat.autor(Autor); // procura na classe catalago o metodo pesquisa autor
				System.out.println();
				break;

			case 5: // CONSULTA POR VALORES
				
				System.out.println("Digite o valor minimo");
				int valormin = sc.nextInt(); //digita o nome do cliente
				System.out.println("Digite o valor max");
				int valormax = sc.nextInt();
				Cat.PesquisaValor(valormin, valormax); // procura na classe catalogo o metedo Busca de cliente por nome
				System.out.println();
				break;
				
			case 6: // CONSULTA DE CLIENTES
				System.out.println("Digite o nome cliente");
				String Cliente = sc.next(); //digita o nome do cliente
				CatCliente.buscaClientePorNome(Cliente); // procura na classe catalogo o metedo Busca de cliente por nome
				listC.imprimeListaCompraPorNomeCliente(Cliente);
				System.out.println();
				break;
				
			case 7: // CONSULTA DE VENDAS NO PERIODO DE 7 DIAS
				System.out.println("Segue abaixo os livros vendidos em 7 dias:");
				System.out.println();
				listC.Vendidos7Dias();
				System.out.println();
				break;
				
			case 8: // CONSULTA DE VENDAS DO MÊS
				System.out.println("Segue abaixo os livros vendidos no mes corrente:");
				listC.vendasDoMesDeJunho();
				System.out.println();
				break;
				
			case 9: // CONSULTA DE LIVRO MAIS VENDIDO
				System.out.println("Segue abaixo o livro mais vendido:");
				System.out.println();
				listC.vendasDoMesDeJunho();
				break;
				
			case 10: // opção de sair/encerrar processo
				System.out.println("até mais");
				começo = false;
				break;

			default:
				System.out.println("opção invalida");
				System.out.println();
				break;

			}
		} while (começo);	
	}
}