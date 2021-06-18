package main.java.bancodedados.dominio;

public class Venda {

	private Produto idProduto;
	private Funcionario idFuncionario;
	private String nome_Func;
	private String descricao;
	private int quantidade;
	private double valorTotal;
	

	
	public void calculaTotal(int quantidade, double preco) {
		valorTotal = quantidade * preco;
	}
	
	
	public Produto getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Produto id_produto) {
		this.idProduto = id_produto;
	}
	public Funcionario getIdFuncionario() {
		return getIdFuncionario();
	}
	public void setIdFuncionario(Funcionario idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNome_Func() {
		return nome_Func;
	}
	public void setNome_Func(String nome_Func) {
		this.nome_Func = nome_Func;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	
}
