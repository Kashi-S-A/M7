package com.tyss;

import java.util.Scanner;

public class TestStudentCrud {

	public static void main(String[] args) {
		System.out.println("============welcome to student app==============");

		while (true) {
			System.out.println("enter 1 to save student");
			System.out.println("enter 2 to update student");
			System.out.println("enter 3 to delete student");
			System.out.println("enter 4 to exit from the app");

			Scanner sc = new Scanner(System.in);

			int opt = sc.nextInt();

			switch (opt) {
			case 1: {
				System.out.println("enter sid");
				int sid = sc.nextInt();
				System.out.println("enter name");
				String name = sc.next();
				System.out.println("enter email");
				String email = sc.next();
				System.out.println("enter phone");
				long phone = sc.nextLong();
				StudentCRUD.saveStudent(sid, name, email, phone);
			}
				break;
			case 2: {
				// logic to update
			}
				break;
			case 3: {
				// logic to delete
			}
				break;
			case 4: {
				System.out.println("thank you for you application!!!!!!");
				return;
			}
			default: {
				System.out.println("Invalid choice!!!!!!!!!!!!!!");
			}
				break;
			}
		}
	}
}
