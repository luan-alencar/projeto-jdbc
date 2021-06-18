package main.java.bancodedados.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.bancodedados.connector.Connect;
import main.java.bancodedados.dominio.Funcionario;
import main.java.bancodedados.dominio.Produto;

public class FuncionarioDAO {

	public void salvarFuncionario(Funcionario funcionario) {

		String sql = "INSERT INTO funcionario(id, nome, cpf, endereco, telefone, funcao) VALUES (?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = Connect.createConnection();

			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, funcionario.getId());
			pstm.setString(2, funcionario.getNome());
			pstm.setString(3, funcionario.getCpf());
			pstm.setString(4, funcionario.getEndereco());
			pstm.setString(5, funcionario.getTelefone());
			pstm.setString(6, funcionario.getFuncao().getFuncao());

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void atualizarDadosFuncionario(Funcionario funcionario) {

		String sql = "UPDATE funcionario SET id = ?, nome = ?, cpf = ?, endereco = ?, telefone = ?, funcao = ?"
				+ "WHERE id = ?";

		Connection conexao = null;
		PreparedStatement pstm = null;

		try {
			conexao = Connect.createConnection();
			pstm = conexao.prepareStatement(sql);
			
			pstm.setInt(1, funcionario.getId());
			pstm.setString(2, funcionario.getNome());
			pstm.setString(3, funcionario.getCpf());
			pstm.setString(4, funcionario.getEndereco());
			pstm.setString(5, funcionario.getTelefone());
			pstm.setString(6, funcionario.getFuncao().getFuncao());

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("null")
	public void deletarFuncionario(Funcionario funcionario) {

		String sql = "DELETE FROM funcionario WHERE id = ?";

		Connection conexao = null;
		PreparedStatement pstm = null;

		try {
			pstm = conexao.prepareStatement(sql);

			pstm.setInt(1, funcionario.getId());
			pstm.execute();

			System.out.println("Cadastro de Funcion�rio exclu�do.");

		} catch (SQLException e) {
			e.getMessage();
		}
	}

	public List<Funcionario> listarFuncionarios() {

		String sql = "SELECT * FROM empregado";

		List<Funcionario> lista = new ArrayList<>();
		Connection conexao = null;

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);
			ResultSet resultado = pstm.executeQuery();

			while (resultado.next()) {
				Funcionario func = new Funcionario();
				func.setNome(resultado.getString("nome"));
				func.setCpf(resultado.getString("cpf"));
				func.setEndereco(resultado.getString("endereco"));
				func.setTelefone(resultado.getString("telefone"));
				func.getFuncao().setFuncao(resultado.getString("funcao"));

				lista.add(func);
			}
		} catch (SQLException e) {
			e.getMessage();
		}
		return lista;
	}

	// Produto
	public void inserirProduto(Produto produto) {

		String sql = "INSERT INTO produto(descricao, categoria, preco, quantidade) VALUES (?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = Connect.createConnection();

			pstm = conn.prepareStatement(sql);
			pstm.setString(1, produto.getDescricao());
			pstm.setString(2, produto.getCategoria().getCategoria());
			pstm.setDouble(3, produto.getPreco());
			pstm.setInt(4, produto.getQuantidade());

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void atualizarDadosProduto(Produto produto) {

		String sql = "UPDATE produto SET descricao = ?, categoria = ?, preco = ?, quantidade = ?" + "WHERE id = ?";

		Connection conexao = null;
		PreparedStatement pstm = null;

		try {
			conexao = Connect.createConnection();
			pstm = conexao.prepareStatement(sql);

			pstm.setString(1, produto.getDescricao());
			pstm.setString(2, produto.getCategoria().getCategoria());
			pstm.setDouble(3, produto.getPreco());
			pstm.setInt(4, produto.getQuantidade());
			pstm.setInt(5, produto.getId());

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
