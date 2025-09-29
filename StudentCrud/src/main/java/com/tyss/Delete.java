package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/student_app";
		String username = "postgres";
		String password = "root";

		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection(url, username, password);

			Statement stm = con.createStatement();

			String delete = "DELETE FROM student WHERE name='Tiger'";

			int rs = stm.executeUpdate(delete);

			System.out.println("rows affected : " + rs);

			con.close();

			System.out.println("record is deleted and connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
