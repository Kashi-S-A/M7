package com.tyss;

public class StudentQueries {

//	public static final String TABLE = "CREATE TABLE student(sid integer not null ,)";
	public static final String INSERT = "INSERT INTO student VALUES(?,?,?,?)";
	public static final String UPDATE = "UPDATE student SET phone=? WHERE sid=?";
	public static final String DELETE = "DELETE FROM student WHERE name=?";
}
