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
public class UserDelegate {
  public static List<Users> usersList = new LinkedList<Users>();
  private static int userCount = 0;

  public void saveUsers(String name, String address, String phoneNo, String emailId, String country) {
    userCount++;
    Users user = new Users(userCount, name,address,phoneNo,emailId,country);
    usersList.add(user);
  }
  
  public void deleteUser(int id) {
    Users user = new Users();
    user.setId(id);
    usersList.remove(user);
  }
}
