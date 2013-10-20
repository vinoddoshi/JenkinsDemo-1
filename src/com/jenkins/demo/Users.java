package com.jenkins.demo;
/**
 * 
 */

/**
 * @author pavang
 *
 */
public class Users {
  private int id;
  private String name;
  private String address;
  private String phoneNo;
  private String emailId;
  private String country;
  
  public Users() {
    
  }
  
  public Users(int id, String name, String address, String phoneNo, String emailId, String country) {
    this.id = id;
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
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Users other = (Users) obj;
    if (id != other.id) return false;
    return true;
  }
  
}
