package br.com.marcosvinicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaDAO {
	
	public List<Disciplina> todos() {
		List<Disciplina> lista = new ArrayList<Disciplina>();
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "select * from disciplina;";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			ResultSet retorno = stmt.executeQuery();
			while(retorno.next()) {
				int id = retorno.getInt("id");
				String nome = retorno.getString("nome");
				String professor = retorno.getString("professor");
				int periodo = retorno.getInt("periodo");
				String codigo_sala_classroom = retorno.getString("codigo_sala_classroom");
				Disciplina disciplina = new Disciplina(id, nome, professor, periodo, codigo_sala_classroom);
				lista.add(disciplina);
			}
			retorno.close();
			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return lista;
	}

}
