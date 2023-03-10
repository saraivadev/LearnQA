package curso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdmCursosTest {
	AdmCursos cursos = new AdmCursos();

	@Test
	public void testCadastrar() {
		assertEquals("Cadastro realizado com sucesso", cursos.cadastrar("Teste"));

	}

	@Test
	public void testCadastrarNomeBranco() {
		assertEquals("Cadastro não realizado", cursos.cadastrar(""));

	}
	@Test
	public void testCadastrarComEspaco() {
		assertEquals("Cadastro não realizado", cursos.cadastrar(" "));

	}
	@Test
	public void testCadastrarNull() {
		assertEquals("Cadastro não realizado", cursos.cadastrar(null));

	}
	
	@Test
	public void testConsultar() {
		cursos.cadastrar("Java");
		assertEquals("Curso: Java", cursos.Listar("Java"));

	}
	
	@Test
	public void testConsultaInvalido() {
		cursos.cadastrar("Java");
		assertEquals("Curso não encontrado", cursos.Listar("JS"));

	}
}
