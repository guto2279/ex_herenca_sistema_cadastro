package com.wesley.ex.heranca;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente ();
		Cliente cliente2 = new Cliente ("José", 52, "Masculino","Rua tibagi, 980", "11 980762532", 1500.00, 1971);
		
		Fornecedor fornecedor1 = new Fornecedor ();
		Fornecedor fornecedor2 = new Fornecedor ("Alessandro", 35, "Masculino","Rua alagoas, 9100", "41 35353125", 2000.00, 1500.00);
		
		Gerente gerente1 = new Gerente ();
		Gerente gerente2 = new Gerente ("Osvaldo", 35, "Masculino","Marcos Assumpção, 520", "71 99678787", 3500.00, "12056", "Regional" );
		
		Vendedor vendedor1 = new Vendedor ();
		Vendedor vendedor2 = new Vendedor ("Marcos", 19, "Masculino","Rua Jundiai, 300", "71 999007153", 1200.00, "19357", 175039.25, 28);
		
		cliente1.setNome("Jessica");
		cliente1.setIdade(22);
		cliente1.setSexo("Feminino");
		cliente1.setValorDivida(300.00);
		cliente1.setAnoNascim(2001);
		
		fornecedor1.setNome("JPA");
		fornecedor1.setEndereco("Rua são josé, 2");
		fornecedor1.setTelefone("41 921093920");
		fornecedor1.setValorCredito(400.00);
		fornecedor1.setValorDivida(900.00);
		
		gerente1.setNome("Fabiana");
		gerente1.setIdade(36);
		gerente1.setSexo("Feminino");
		gerente1.setSalario(3900.00);
		gerente1.setMatricula("301569");
		gerente1.setNomeGerencia("Vendas");
		
		 vendedor1.setNome("Mauricio");
		 vendedor1.setIdade(49);
		 vendedor1.setSexo("Masculino");
		 vendedor1.setSalario(1700.00);
		 vendedor1.setMatricula("00108");
		 vendedor1.setValorVendas(800000.00);
		 vendedor1.setQntVendas(200);
		 
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(fornecedor1);
		System.out.println(fornecedor2);
		System.out.println(gerente1);
		System.out.println(gerente2);
		System.out.println(vendedor1);
		System.out.println(vendedor2);
	}
}
