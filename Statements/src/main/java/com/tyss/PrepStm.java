package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepStm {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/employeedb?user=postgres&password=root";
		String driver = "org.postgresql.Driver";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url);
			System.out.println("connection created");

			String sql = "INSERT INTO employee VALUES(?,?,?,?)";

			String update = "UPDATE employee SET salary=? WHERE eid=?";

			String delete = "DELETE FROM employee WHERE eid=?";

			PreparedStatement pstm = con.prepareStatement(delete);
			// delete
			pstm.setInt(1, 105);

			// update
//			pstm.setDouble(1, 80000);
//			pstm.setInt(2, 105);

			// insert
//			pstm.setInt(1, 105);
//			pstm.setString(2, "Manga");
//			pstm.setString(3, "manga@gmail.com");
//			pstm.setDouble(4, 40000);

			pstm.execute();

			con.close();

			System.out.println("executed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
