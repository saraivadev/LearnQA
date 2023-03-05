package curso;

import java.util.ArrayList;
import java.util.Scanner;

public class Cursos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cursos = new ArrayList<String>();
		
		String opcao, curso;
	

		cursos.add("Teste de API");
		cursos.add("Teste de UI");
		cursos.add("Teste de Unit");
		cursos.add("JavaScript");

		System.out.println("******Bem vindo ao menu cursos!******\n");
		System.out.println(
				"Digite 1 para cadastrar um curso. \nDigite 2 para remover um curso. \nDigite outra tecla para listar os cursos cadastrados. \n");

		opcao = scanner.nextLine();
			
		while(opcao.equals("1") || opcao.equals("2")) {
			
			if(opcao.equals("1")) {
				System.out.println("Digite o nome do Curso: \n");
				curso = scanner.nextLine();
				cursos.add(curso);
				
				System.out.println("Curso cadastrado com sucesso: "+curso);
				System.out.println(
						"\nDigite 1 para cadastrar um curso. \nDigite 2 para remover um curso. \nDigite outra tecla para listar os cursos cadastrados. \n");

				opcao = scanner.nextLine();
				
			}
				
			else if (opcao.equals("2")) {
				
				System.out.println("Digite o número do curso a ser removido: \n");
				int index = scanner.nextInt();
				cursos.remove(index);
				System.out.println(
						"\nDigite 1 para cadastrar um curso. \nDigite 2 para remover um curso. \nDigite outra tecla para listar os cursos cadastrados. \n");

				opcao = scanner.nextLine();
				
			}
			
			}
			
			System.out.println("Cursos cadastrados: "+cursos);
		
			
		}
}
		
		
		
			
			

			

	
	
	


