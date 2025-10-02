package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	static public WebElement username(WebDriver d) {
		return d.findElement(By.name("username"));
	}
	static public WebElement password (WebDriver d) {
		return d.findElement(By.name("password"));
	}
	static public WebElement login (WebDriver d) {
		return d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	}
}
