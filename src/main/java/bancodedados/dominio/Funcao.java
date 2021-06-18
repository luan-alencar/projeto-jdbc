package main.java.bancodedados.dominio;

public enum Funcao {
	
	CAIXA ("Responsavel por, fechamento de caixa e atendimento ao publico com pagamentos"),
	FARMACEUTICO ("Responsavel por venda de medicamentos em geral ou sob prescricao medica"),
	BALCONISTA ("Responsavel por auxiliar o farmaceutico e atendimento ao cliente");
	

	private String funcao;
	
	private Funcao(String funcao) {
		this.funcao = funcao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
