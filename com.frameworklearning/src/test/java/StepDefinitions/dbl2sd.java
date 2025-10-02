package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class dbl2sd {
	WebDriver d;

	@Given("you are at login page")
	public void you_are_at_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JITHIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   d = new ChromeDriver();
		   
		   d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("user typing the below cred")
	public void user_typing_the_below_cred(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		List<Map<String, String>> cred = dataTable.asMaps(String.class,String.class );
		String user=cred.get(0).get("uname");
		String pass=cred.get(0).get("pass");
		Thread.sleep(3000);
		/*
		 * d.findElement(By.name("username")).sendKeys(user); Thread.sleep(3000);
		 * d.findElement(By.name("password")).sendKeys(pass);
		 */
	    
	LoginPage.username(d).sendKeys(user);
	Thread.sleep(3000);
	LoginPage.password(d).sendKeys(pass);
	}
	@When("click login")
	public void click_login() throws InterruptedException {
	   
		Thread.sleep(3000);
		/*
		 * d.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).
		 * click(); d.quit();
		 */
		//System.out.print("dne");
		LoginPage.login(d).click();
		d.quit();
	}
}
