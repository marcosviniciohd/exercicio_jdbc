package br.com.marcosvinicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/disciplinas?serverTimezone=UTC", "root", "jesus");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		FabricaDeConexao.getConnection();
		System.out.println("ok");
	}

}
