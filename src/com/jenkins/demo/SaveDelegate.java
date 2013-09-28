/**
 * 
 */
package com.jenkins.demo;

import java.util.LinkedList;
import java.util.List;

/**
 * @author pavang
 *
 */
public class SaveDelegate {
  public static List<Users> usersList = new LinkedList<Users>();

  public void saveUsers(String name, String address, String phoneNo, String emailId, String country) {
    Users user = new Users(name,address,phoneNo,emailId,country);
    usersList.add(user);
  }
}
