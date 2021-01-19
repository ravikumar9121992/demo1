package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination1 {
	WebDriver driver;
	public static String url="http://orangehrm.qedgetech.com/";
	@When("^i open url\"([^\"]*)\"$")
	public void i_open_url(String brw) throws Throwable {
		if(brw.equalsIgnoreCase("chrome")) {
	    	driver=new ChromeDriver();
	    	driver.get(url);
	    	driver.manage().window().maximize();
	    }
	    else if(brw.equalsIgnoreCase("firefox")) {
	    	driver=new FirefoxDriver();
	    	driver.get(url);
	    	
	    }
	    else {
	    	System.out.println("Browser value is not matching");
	    }
	
	}

	@When("^i Enter\"([^\"]*)\"in username textbox$")
	public void i_Enter_in_username_textbox(String username) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
	}

	@When("^Enter\"([^\"]*)\"in password textbox$")
	public void enter_in_password_textbox(String password) throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^clicking login button$")
	public void clicking_login_button() throws Throwable {
		driver.findElement(By.name("Submit")).click(); 
	}

	@Then("^i should see dashboard text in url$")
	public void i_should_see_dashboard_text_in_url() throws Throwable {
		String expected="dash";
		   String actual=driver.getCurrentUrl();
		   if(actual.contains(expected)) {
			   System.out.println("Login successs::"+actual+" "+expected);
		   }
		   else {
			   System.out.println("Login Fail");
		   }
	}
	

	@When("^closing browser$")
	public void closing_browser() throws Throwable {
		driver.close();
	}


}
