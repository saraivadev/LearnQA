package br.com.e2etreinamentos;

public class MetodoAtributo {
	int idade = 32;
	String nome = "Washington";
			
	public void digiteSuaIdade(int idade) {
	
		System.out.println("A sua idade é: " + idade);
		
		
	}
	
	public String digiteSeuNome(String nome){
		System.out.println(nome);
		return nome;
	}
	
	public void informeDados (int idade, String nome) {
		System.out.println("O nome cadastrado é "+ nome + " e a idade " + idade);
	}
	
	
	public void consultaDados() {
			System.out.println("Nome cadastrado foi " + this.nome + "idade cadastrada foi " + this.idade);
	}
	

}
