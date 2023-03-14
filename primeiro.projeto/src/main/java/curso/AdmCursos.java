package curso;

import java.util.ArrayList;

public class AdmCursos {

	ArrayList<Cursos> gradeCursos = new ArrayList<Cursos>();
	Cursos curso;

	public String cadastrar(String nome) {
		String msg = "null";
		if (nome == null) {
			msg = "Cadastro não realizado";

		} else if (nome.isEmpty() || nome.isBlank()) {
			msg = "Cadastro não realizado";
		} else {
			curso = new Cursos(nome);
			gradeCursos.add(curso);
			msg = "Cadastro realizado com sucesso";
		}
		return msg;
	}

	public String Listar(String nome) {

		String msg = "Curso: " + curso.getNome();

		if (!nome.equals(curso.getNome())) {
			msg = "Curso não encontrado";
		}

		return msg;
	}

	/*
	 * public static void Excluir(){
	 * 
	 * System.out.println("Digite o nome do curso a ser removido: \n"); int index =
	 * cursos.indexOf(scanner.nextLine()); cursos.remove(index); System.out.println(
	 * "\nDigite 1 para cadastrar um curso. \nDigite 2 para remover um curso. \nDigite outra tecla para listar os cursos cadastrados. \n"
	 * );
	 * 
	 * opcao = scanner.nextLine();
	 * 
	 * System.out.println("Cursos excluído com sucesso!: \n");
	 * 
	 * }
	 */

}