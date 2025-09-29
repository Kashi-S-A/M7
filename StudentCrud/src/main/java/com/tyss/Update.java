package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/student_app";
		String user = "postgres";
		String password = "root";
		String driver = "org.postgresql.Driver";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, user, password);

			Statement stm = con.createStatement();

			String update = "UPDATE student SET name='Tiger Zinda hai' WHERE sid=4";

			boolean result = stm.execute(update);
			
			System.out.println(result);

			con.close();

			System.out.println("record updated and connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
