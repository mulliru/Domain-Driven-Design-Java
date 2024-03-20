package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoFactory {

	// metodo conexao
	public Connection conexao() throws ClassNotFoundException, SQLException {
		
		//Driver
		Class.forName("oracle.jdbc.driver.OracleDriver:");
		
		//Conexão
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "RM553315" , "140705");
		
	}
}
