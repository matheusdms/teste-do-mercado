package persistence;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.Mercadoria;

public class MercadoriaDao extends Dao{
	public void inserir(Mercadoria p) throws Exception{  
        
	      open();  
	        
	      stmt = con.prepareStatement("INSERT INTO mercadoria (CODIGO, TP_MERCADORIA, NOME, QUANTIDADE, PRECO, TP_NEGOCIO) VALUES(?,?,?,?,?,?)");  
	        
	      stmt.setInt(1, p.getCodigo());  
	      stmt.setString(2, p.getTipoMercadoria());
	      stmt.setString(3, p.getNome());
	      stmt.setInt(4, p.getQuantidade());  
	      stmt.setDouble(5, p.getPreco());
	      stmt.setString(6, p.getTipoNegocio());
	      stmt.execute();
	      
	      close();        
	}
	
	public ArrayList<Mercadoria> listar() throws Exception {
		
		ArrayList<Mercadoria> mercadorias = new ArrayList<Mercadoria>();
		Mercadoria m;
		
		open();
		
		stmt = con.prepareStatement("SELECT CODIGO, TP_MERCADORIA, NOME, QUANTIDADE, PRECO, TP_NEGOCIO FROM mercadoria");
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			m = new Mercadoria();
			m.codigo = rs.getInt(1);
			m.tipoMercadoria = rs.getString(2);
			m.nome = rs.getString(3);
			m.quantidade = rs.getInt(4);
			m.preco = rs.getDouble(5);
			m.tipoNegocio = rs.getString(6);
			
			mercadorias.add(m);
		}
		
		return mercadorias;
	}
}
