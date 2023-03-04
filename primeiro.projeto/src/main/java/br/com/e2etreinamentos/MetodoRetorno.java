package br.com.e2etreinamentos;

public class MetodoRetorno {
	
	String nome = "Washington";
	
	public String nome() {
		
		System.out.println("Teste " + nome);
		
		return nome;
		
		
	}
	
public int soma() {
		int soma = 5;
		System.out.println("Soma = " + soma);
		
		return soma;
		
		
	}

}
