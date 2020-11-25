package br.com.marcosvinicio;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		DisciplinaDAO dao = new DisciplinaDAO();
		List<Disciplina> lista = dao.todos();
		
		for (Disciplina disciplina : lista) {
			System.out.println("ID: " +  disciplina.getId());
			System.out.println("Nome: " +  disciplina.getNome());
			System.out.println("Professor: " +  disciplina.getProfessor());
			System.out.println("Período: " + disciplina.getPeriodo());
			System.out.println("Código do classroom: " +  disciplina.getCodigo_sala_classroom());
			System.out.println("-----------------------------------------------------------------------------");
			
		}
		
	}

}
