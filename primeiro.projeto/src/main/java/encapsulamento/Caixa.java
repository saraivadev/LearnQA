package encapsulamento;

public class Caixa {
	
	public static void main (String [] args) {
		ContaCorrrente cc = new ContaCorrrente();
		
		System.out.println(cc.getSaldo());
		cc.setSaldo(100);
		System.out.println(cc.getSaldo());
	}

}
