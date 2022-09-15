package com.techmojo.web.automation.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "application")
//@Data
public class CustomProperties {
	private String url;
	private String password;
	private String username;
	private String otp;
	private String newpassword;
	private String phonenumber;
	private String accName;
	private String Beneficiaryname;
	private String Bankacctnumber;
	private String Bankaddress;
	private String bankcode;
	private String newBeneficiaryname;
	private String bankname;
	private String selectBeneficiaryname;
	private String selectBankacctnumber;
	private String APIkey;
	
	
	
	
public String getAPIkey() {
		return APIkey;
	}
	public void setAPIkey(String aPIkey) {
		APIkey = aPIkey;
	}
public String getSelectBeneficiaryname() {
		return selectBeneficiaryname;
	}
	public void setSelectBeneficiaryname(String selectBeneficiaryname) {
		this.selectBeneficiaryname = selectBeneficiaryname;
	}
	public String getSelectBankacctnumber() {
		return selectBankacctnumber;
	}
	public void setSelectBankacctnumber(String selectBankacctnumber) {
		this.selectBankacctnumber = selectBankacctnumber;
	}
public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
public String getNewBeneficiaryname() {
		return newBeneficiaryname;
	}
	public void setNewBeneficiaryname(String newBeneficiaryname) {
		this.newBeneficiaryname = newBeneficiaryname;
	}
public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public String getAccName() {
		return accName;
	}
	public String getBeneficiaryname() {
		return Beneficiaryname;
	}
	public void setBeneficiaryname(String beneficiaryname) {
		Beneficiaryname = beneficiaryname;
	}
	public String getBankacctnumber() {
		return Bankacctnumber;
	}
	public void setBankacctnumber(String bankacctnumber) {
		Bankacctnumber = bankacctnumber;
	}
	public String getBankaddress() {
		return Bankaddress;
	}
	public void setBankaddress(String bankaddress) {
		Bankaddress = bankaddress;
	}
	public String getBankcode() {
		return bankcode;
	}
	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	
	
	
}