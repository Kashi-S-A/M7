package com.tyss;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallStm {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/employeedb?user=postgres&password=root";
		String driver = "org.postgresql.Driver";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url);

			String sql = "call procedure_name(?,?,?,?,?)";// command to call stored procedure
			String sql1 = "select function_name(?,?)";//command to function

			CallableStatement cstm = con.prepareCall(sql);
			cstm.setInt(1, 101);
			cstm.setString(2, "Penga");
			cstm.setString(3, "Thane");
			cstm.setString(4, "penga@gmail.com");
			cstm.setInt(5, 112233);

			cstm.execute();

			con.close();

			System.out.println("procedure executed and connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
