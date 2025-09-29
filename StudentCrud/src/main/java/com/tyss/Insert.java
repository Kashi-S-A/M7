package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/student_app";
		String username = "postgres";
		String password = "root";
		String driver = "org.postgresql.Driver";

		try {
			// step 1 : Load the driver
			Class.forName(driver);
			System.out.println("driver is loaded");

			// step 2 : Create a connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connection is created");

			// step 3 : Create a Statement
			Statement stm = con.createStatement();
			System.out.println("statement is created");

			String insert = "INSERT INTO student VALUES(4,'Tiger','tiger@gmail.com',76545678)";

			// step 4 : Execute the query

			int result = stm.executeUpdate(insert);

			System.out.println("row affected : " + result);

			System.out.println("record saved");

			// step 5 : close connection
			con.close();
			System.out.println("connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
