package com.jenkins.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jenkins.demo.UserDelegate;

public class UserDelegateTest {
  
  UserDelegate ud = new UserDelegate();
  
  UserDelegateTest()
  {
    ud.saveUsers("Sameer", "Warje Jakat Naka", "972372878", "demo@jenkins.com", "India");
  }
  
  @Test
  public void saveUserNameTest() {

    String requiredName = ud.usersList.get(0).getName();
    Assert.assertTrue(requiredName.equals("Sameer"));
    //    assert(true);
  }
  //Name,address,phoneNo,emailId,country
  @Test
  public void saveUserAddressTest(){
    //System.out.println(ud.usersList.get(0).getAddress());
    Assert.assertTrue(ud.usersList.get(0).getAddress().equals("Warje Jakat Naka"));
  }
  
  @Test 
  public void saveUserPhoneNoTest(){
    Assert.assertTrue(ud.usersList.get(0).getPhoneNo().equals("972372878"));
  }
  
  @Test
  public void saveUserEmailID(){
    Assert.assertTrue(ud.usersList.get(0).getEmailId().equals("demo@jenkins.com"));

  }
  
  @Test
  public void saveUserCountry(){
    Assert.assertTrue(ud.usersList.get(0).getCountry().equals("India"));
  }
  
  @Test 
  public void anotherTest(){
    
//    UserDelegate ud1 = new UserDelegate();
//    ud1.usersList.clear();
//    ud1.saveUsers("Sameer", "Warje Jakat Naka", "972372878", "demo@jenkins.com", "India");
//    ud1.usersList.remove(0);
//    System.out.println(ud1.usersList.isEmpty());
   // Assert.assertTrue(ud1.usersList.isEmpty());
  }  
}
