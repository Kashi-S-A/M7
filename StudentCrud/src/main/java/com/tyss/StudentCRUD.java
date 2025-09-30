package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentCRUD {

	private static final String URL = "jdbc:postgresql://localhost:5432/student_app?user=postgres&password=root";
	private static final String DRIVER = "org.postgresql.Driver";

	public static void saveStudent(int sid, String name, String email, long phone) {

		try (Connection con = createConnection();) {
			PreparedStatement pstm = con.prepareStatement(StudentQueries.INSERT);
			pstm.setInt(1, sid);
			pstm.setString(2, name);
			pstm.setString(3, email);
			pstm.setLong(4, phone);

			int rows = pstm.executeUpdate();

			System.out.println(rows + " saved successfully!!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteStudent(String name) {

		try (Connection con = createConnection();) {
			PreparedStatement pstm = con.prepareStatement(StudentQueries.DELETE);
			pstm.setString(1, name);

			int rows = pstm.executeUpdate();

			System.out.println(rows + " deleted successfully!!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void updateStudent(int sid, long phone) {

		try (Connection con = createConnection();) {
			PreparedStatement pstm = con.prepareStatement(StudentQueries.UPDATE);
			pstm.setLong(1, phone);
			pstm.setInt(2, sid);

			int rows = pstm.executeUpdate();

			System.out.println(rows + " updated successfully!!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static Connection createConnection() {
		Connection con = null;

		try {
			Class.forName(DRIVER);

			con = DriverManager.getConnection(URL);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
