package main.java.bancodedados.connector;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	static final String URL = "jdbc:postgresql://localhost:5432/postgres";

	static final String USER = "postgres";

	static final String PASS = "0A9sw5RfQ";

	public static java.sql.Connection createConnection() throws ClassNotFoundException, SQLException {

		Class.forName("org.postgresql.Driver");

		java.sql.Connection connect = DriverManager.getConnection(URL, USER, PASS);

		if (connect != null) {
			System.out.println("Connection works!");
			return connect;
		}

		return null;

	}

}
