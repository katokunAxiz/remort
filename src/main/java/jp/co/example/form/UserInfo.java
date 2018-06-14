package jp.co.example.form;

import org.springframework.stereotype.Component;

@Component
public class UserInfo {

	private String userName;
	private String telephone;
	private String password;





	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}




}
