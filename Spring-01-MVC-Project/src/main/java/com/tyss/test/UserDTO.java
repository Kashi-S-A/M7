package com.tyss.test;

public class UserDTO {

	private String username;
	private String useremail;
	private long phone;
	private String pwd;

	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", useremail=" + useremail + ", phone=" + phone + ", pwd=" + pwd + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
