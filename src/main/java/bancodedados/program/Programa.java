package main.java.bancodedados.program;

import main.java.bancodedados.DAO.FuncionarioDAO;
import main.java.bancodedados.dominio.Categoria;
import main.java.bancodedados.dominio.Funcionario;
import main.java.bancodedados.dominio.Produto;
import main.java.bancodedados.dominio.Venda;

public class Programa {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Moises");
		funcionario1.setCpf("632.997.764-01");
		funcionario1.setEndereco("Rua palestina");
		funcionario1.setTelefone("8399292222");
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Odelandro");
		funcionario2.setCpf("794.105.624-06");
		funcionario2.setEndereco("Rua mofideu");
		funcionario2.setTelefone("83898988412");
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Marcia");
		funcionario3.setCpf("776.186.754-22");
		funcionario3.setEndereco("Rua malaquias do �");
		funcionario3.setTelefone("838989774156");
		
		
		
		Produto produto1 = new Produto();
		produto1.setCategoria(Categoria.SUPLEMENTOS);
		produto1.setDescricao("Whey protein");
		produto1.setPreco(90.00);
		produto1.setQuantidade(20);
		
		Produto produto2 = new Produto();
		produto2.setCategoria(Categoria.SUPLEMENTOS);
		produto2.setDescricao("Colag�no");
		produto2.setPreco(70.00);
		produto2.setQuantidade(5);
		
		Produto produto3 = new Produto();
		produto3.setCategoria(Categoria.MEDICAMENTOS);
		produto3.setDescricao("Dipirona");
		produto3.setPreco(2.00);
		produto3.setQuantidade(150);
		
		Produto produto4 = new Produto();
		produto4.setCategoria(Categoria.MEDICAMENTOS);
		produto4.setDescricao("Anticocepcional Diane");
		produto4.setPreco(15.00);
		produto4.setQuantidade(30);
		
		Produto produto5 = new Produto();
		produto5.setCategoria(Categoria.HIGIENE);
		produto5.setDescricao("Colgate Sensitive 100g");
		produto5.setPreco(7.00);
		produto5.setQuantidade(20);
		
		Produto produto6 = new Produto();
		produto6.setCategoria(Categoria.HIGIENE);
		produto6.setDescricao("Fio dental 50M");
		produto6.setPreco(9.00);
		produto6.setQuantidade(40);
		
		Produto produto7 = new Produto();
		produto7.setCategoria(Categoria.SAUDE);
		produto7.setDescricao("Extrato de propolis 30ml");
		produto7.setPreco(15.90);
		produto7.setQuantidade(15);
		
		Produto produto8 = new Produto();
		produto8.setCategoria(Categoria.SAUDE);
		produto8.setDescricao("Lacday 60 comprimidos");
		produto8.setPreco(98.90);
		produto8.setQuantidade(7);
		
		Produto produto9 = new Produto();
		produto9.setCategoria(Categoria.SAUDE);
		produto9.setDescricao("Extrato de propolis 30ml");
		produto9.setPreco(15.90);
		produto9.setQuantidade(15);
		
		Produto produto10 = new Produto();
		produto10.setCategoria(Categoria.MEDICAMENTOS);
		produto10.setDescricao("Sonrisal 10 comprimidos");
		produto10.setPreco(8.00);
		produto10.setQuantidade(25);
		
		
		
		Venda venda1 = new Venda();
		venda1.setIdFuncionario(funcionario1);
		venda1.setIdProduto(produto9);
		venda1.setDescricao("Compra");
		venda1.setNome_Func(funcionario1.getNome());
		venda1.setQuantidade(2);
		venda1.calculaTotal(venda1.getQuantidade(), venda1.getIdProduto().getPreco());
	
	
		
		FuncionarioDAO funcionario = new FuncionarioDAO();
		funcionario.salvarFuncionario(funcionario1);
	}

}
