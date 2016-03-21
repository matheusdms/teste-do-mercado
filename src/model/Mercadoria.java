package model;

public class Mercadoria {
	public int codigo;  
	public String tipoMercadoria;  
	public String nome;  
	public int quantidade;
	public double preco;
	public String tipoNegocio;
	
	public Mercadoria(int codigo, String tipoMercadoria, String nome, int quantidade, double preco, String tipoNegocio) {  
	   super();  
	   this.codigo = codigo;  
	   this.tipoMercadoria = tipoMercadoria;  
	   this.nome = nome;
	   this.quantidade = quantidade; 
	   this.preco = preco;
	   this.tipoNegocio = tipoNegocio;
	}
	
	public Mercadoria() {  
	   super();  
	} 
	
	public int getCodigo() {  
	   return codigo;  
	}  
	
	public void setCodigo(int codigo) {  
	   this.codigo = codigo;  
	}  
	
	public String getTipoMercadoria() {  
	   return tipoMercadoria;  
	}  
	
	public void setTipoMercadoria(String tipoMercadoria) {  
	   this.tipoMercadoria = tipoMercadoria;  
	}  
	public String getNome() {  
	   return nome;  
	}  
	public void setNome(String nome) {  
	   this.nome = nome;  
	}  
	public int getQuantidade() {  
	   return quantidade;  
	}  
	public void setQuantidade(int quantidade) {  
	   this.quantidade = quantidade;  
	}
	public double getPreco() {  
		return preco;  
	}  
	public void setPreco(double preco) {  
		this.preco = preco;  
	}  
	public String getTipoNegocio() {  
		return tipoNegocio;  
	}  
	public void setTipoNegocio(String tipoNegocio) {  
		this.tipoNegocio = tipoNegocio;  
	}
	
	@Override  
	public String toString() {  
	   return "Mercadoria [codigo=" + codigo + ", tipomercadoria=" + tipoMercadoria + ", nome=" + nome 
	         + ", quantidade=" + quantidade + ", preco=" + preco + ", tiponegocio=" + tipoNegocio +"]";  
	   }  
}  	