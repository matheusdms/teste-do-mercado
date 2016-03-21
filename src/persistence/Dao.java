package persistence;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  

public class Dao {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	private final String URL = "jdbc:mysql://localhost:3306/mercado";
	private final String USUARIO = "admin";
	private final String SENHA = "admin";
	
	protected void open()throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
	    con = DriverManager.getConnection(URL, USUARIO, SENHA); 
	}
	
	protected void close()throws Exception{  
		con.close(); 	
	}
}
