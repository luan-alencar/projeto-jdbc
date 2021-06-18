package main.java.bancodedados.dominio;

public enum Categoria {

	SUPLEMENTOS("Suplementa��oo Alimentar"),
	HIGIENE ("Produtos de	Higiene"),
	SAUDE ("Produtos bem estar e cuidado Adulto"),
	MEDICAMENTOS ("Fitoterapicos , e medicamentos em geral"),
	COSMETICOS ("Dermocosm�ticos , Nutricosm�ticos");
	
	private String categoria;
	
	private Categoria(String categoria) {
		this.categoria = categoria;
	}

	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
