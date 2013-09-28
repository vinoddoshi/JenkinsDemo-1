package com.jenkins.demo;
/**
 * 
 */

/**
 * @author pavang
 *
 */
public class Users {
  private String name;
  private String address;
  private String phoneNo;
  private String emailId;
  private String country;
  
  public Users(String name, String address, String phoneNo, String emailId, String country) {
    super();
    this.name = name;
    this.address = address;
    this.phoneNo = phoneNo;
    this.emailId = emailId;
    this.country = country;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getPhoneNo() {
    return phoneNo;
  }
  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }
  public String getEmailId() {
    return emailId;
  }
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
}
