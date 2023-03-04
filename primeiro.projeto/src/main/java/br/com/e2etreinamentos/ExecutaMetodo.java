package br.com.e2etreinamentos;

public class ExecutaMetodo {

	public static void main(String[] args) {
		
		//MetodoVazio metodo = new MetodoVazio();
	//	MetodoRetorno retorno = new MetodoRetorno();
		MetodoAtributo atributo = new MetodoAtributo();

		// metodo.mensagen();

		//retorno.nome();
		//retorno.soma();
		
		//atributo.digiteSeuNome("Washington");
		//atributo.digiteSuaIdade(32);
		
		atributo.informeDados(33, "Washington");
		atributo.consultaDados();
	}

}
