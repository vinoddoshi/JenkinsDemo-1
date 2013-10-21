package com.jenkins.guiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Index {
 
  WebDriver driver = new FirefoxDriver();
  
  @BeforeClass
  public void init()
  {
     driver.get("http://localhost:8081/JenkinsDemo/index.jsp");
     try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  @Test
  public void fillForm(){
    driver.findElement(By.id("txtName")).sendKeys("Arvind");
    driver.findElement(By.id("txtAddress")).sendKeys("Kanad Place near Tilak Marg New Delhi");
    driver.findElement(By.id("txtPhoneNo")).sendKeys("34598899983");
    driver.findElement(By.id("txtEmailId")).sendKeys("arvind@gmail.com");
  }
  
  @Test
  public void selectCountry(){
    //Select country = new Select(driver.findElement(By.id("optCountry")));
    //country.selectByIndex(1);
    //country.selectByValue("Australia");
    //driver.findElement(By.id("optCountry")).click();
    Assert.assertTrue(true);
  }

  @Test
  public void submitForm(){
    driver.findElement(By.id("btnSubmit")).click();
  }
  
  
  @AfterClass
  public void exit()
  {
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    driver.quit();
  }
  
}
