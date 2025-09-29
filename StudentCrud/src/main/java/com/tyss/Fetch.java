package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/student_app";
		String username = "postgres";
		String password = "root";
		String driver = "org.postgresql.Driver";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, username, password);

			Statement stm = con.createStatement();

			String fetch = "SELECT * FROM student";

			ResultSet rs = stm.executeQuery(fetch);

			System.out.println("-------------Students------------");

			while (rs.next()) {
				System.out.println("Sid   : " + rs.getInt(1));
				System.out.println("Name  : " + rs.getString(3));
				System.out.println("Email : " + rs.getString(2));
				System.out.println("Phone : " + rs.getLong(4));

				System.out.println("======================");
			}

			con.close();

			System.out.println("records fetched and connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
