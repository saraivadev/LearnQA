package percorrerstring;

public class PercorrerString {

	public static void main(String[] args) {
		String mensagem = "Eu vou conseguir!";
		char letra ='u';
		int contador = 0;
		
		for (int i = 0; i < mensagem.length(); i++) {
			if (mensagem.charAt(i)==letra)
				contador ++;
		}
		System.out.println("Letra na posição: "+ 0 +" é :"+mensagem.charAt(0));
		System.out.println("Quantidade de letras "+letra+ " é : "+contador);

	}

}
