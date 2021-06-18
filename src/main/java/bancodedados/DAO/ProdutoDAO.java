package main.java.bancodedados.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Strings;

import main.java.bancodedados.connector.Connect;
import main.java.bancodedados.dominio.Categoria;
import main.java.bancodedados.dominio.Produto;

public class ProdutoDAO {

	public void salvarProduto(Produto produto) {

		String sql = "INSERT INTO produto(descricao, preco, quantidade, categoria) VALUES (?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = Connect.createConnection();

			pstm = conn.prepareStatement(sql);
			pstm.setString(1, produto.getDescricao());
			pstm.setDouble(2, produto.getPreco());
			pstm.setInt(3, produto.getQuantidade());
			pstm.setString(4, produto.getCategoria().toString());
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

	@SuppressWarnings("null")
	public void deletarProduto(Produto produto) {

		String sql = "DELETE FROM produto WHERE id = ?";

		Connection conexao = null;
		PreparedStatement pstm = null;

		try {
			pstm = conexao.prepareStatement(sql);

			pstm.setInt(1, produto.getId());
			pstm.execute();

			System.out.println("Cadastro de Produto exclu�do.");

		} catch (SQLException e) {
			e.getMessage();
		}
	}

	public List<Produto> listarProdutos() {

		String sql = "SELECT * FROM produto";

		List<Produto> produtos = new ArrayList<>();
		Connection conexao = null;

		try {
			PreparedStatement pstm = conexao.prepareStatement(sql);
			ResultSet resultado = pstm.executeQuery();

			while (resultado.next()) {
				Produto produto = new Produto();
				produto.setDescricao(resultado.getString("descricao"));
				produto.setPreco(resultado.getDouble("preco"));
				produto.setQuantidade(resultado.getInt("quantidade"));
//				produto.setCategoria(resultado.getString("categoria"));

				produtos.add(produto);
			}
		} catch (SQLException e) {
			e.getMessage();
		}
		return produtos;
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
