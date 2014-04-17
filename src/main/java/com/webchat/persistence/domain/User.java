package com.webchat.persistence.domain;

import java.util.Date;

import javax.persistence.Entity;

@Entity 
public class User {
	private String email;
	private String nickName;
	private Date regDate;
	private Date birthDate;
	private Boolean banFlag;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Boolean getBanFlag() {
		return banFlag;
	}
	public void setBanFlag(Boolean banFlag) {
		this.banFlag = banFlag;
	}

}
