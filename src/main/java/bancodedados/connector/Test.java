package main.java.bancodedados.connector;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		
		try {
			Connection connect = Connect.createConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
