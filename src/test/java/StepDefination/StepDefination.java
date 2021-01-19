package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
WebDriver driver;
public static String URL="http://orangehrm.qedgetech.com/";

@When("^i Launch url in brwser$")
public void i_Launch_url_in_brwser() throws Throwable {
	driver= new FirefoxDriver();
    driver.get(URL);
    driver.manage().window().maximize();
	
    
}

@When("^i enter username and i enter password$")
public void i_enter_username_and_i_enter_password() throws Throwable {

    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
    driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
    
}

@When("^i click login button$")
public void i_click_login_button() throws Throwable {
	driver.findElement(By.name("Submit")).click();
	   Thread.sleep(4000);
}

@Then("^i should see dashboard in url$")
public void i_should_see_dashboard_in_url() throws Throwable {
	String expected="dashboard";
	   String actual=driver.getCurrentUrl();
	   if(actual.contains(expected)) {
		   System.out.println("Login successs::"+actual+" "+expected);
	   }
	   else {
		   System.out.println("Login Fail");
	   }
}

@When("^i close browser$")
public void i_close_browser() throws Throwable {
	driver.close();
    
}



}
