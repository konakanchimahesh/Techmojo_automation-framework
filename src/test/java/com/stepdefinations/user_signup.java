package com.stepdefinations;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.techmojo.web.automation.test.base.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import okhttp3.Cookie;

public class user_signup {
	String driverPath = "C:\\Users\\mahesh.konakanchi\\Documents\\Framework_cucumber\\Framework\\Framework\\src\\test\\resources\\drivers\\chromedriver.exe";

	WebDriver driver;
	

	@Before
	public void setup() {

		// Initialize the webdriver and open the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}

	@Given("User is on Dazn landing page")
	public void user_is_on_dazn_landing_page() {
		driver.get("https://stag.dazn.com/en-AT/account/signup");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		try {
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='onetrust-button-group']//button[2]")));
			//Set<org.openqa.selenium.Cookie> cookie=driver.manage().getCookies();
			//System.out.println(cookie);
			Thread.sleep(6000);
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='onetrust-pc-btn-handler']")));
			//System.out.println("clickable2");
			WebElement accept1=driver.findElement(By.xpath("//*[@id='onetrust-pc-btn-handler']"));
			accept1.click();
			Thread.sleep(2000);
			//more options
			driver.findElement(By.xpath("//*[@id='accept-recommended-btn-handler']")).click();
			//keepall
			driver.findElement(By.xpath("//*[@id='onetrust-pc-sdk']/div[3]/div[1]/button[1]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User click on signup now option")
	public void user_click_on_signup_now_option() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='root']/div/div[3]/section/div[2]/form/button")).click();
	}

	@When("^User enters username as ([^\"]*) and Lastname as ([^\"]*) and Email as ([^\"]*) and Confirm Email as ([^\"]*) and Create a password as ([^\"]*)$")
	public void signup_details(String username,String lastname,String emailid,String cemailid,String password) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='firstName--1']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='lastName--2']")).sendKeys(lastname);
		driver.findElement(By.xpath("//*[@id='emailWithConfirmation-email--4']")).sendKeys(emailid);
		driver.findElement(By.xpath("//*[@id='emailWithConfirmation-confirmEmail--5']")).sendKeys(cemailid);
		driver.findElement(By.xpath("//*[@id='password--6']")).sendKeys(password);
		
		if (driver.findElement(By.xpath("//*[@id='onetrust-pc-btn-handler']")).isDisplayed()) {
			WebElement accept2 = driver.findElement(By.xpath("//*[@id='onetrust-pc-btn-handler']"));
			accept2.click();
			driver.findElement(By.xpath("//*[@id='root']/div/div[3]/section/div[2]/form/button")).click();
		}
		//driver.findElement(By.xpath("")).click();
		
	}

	@When("click on continue")
	public void click_on_continue() {
		driver.findElement(By.xpath("//*[@id='root']/div/div[3]/section/div[2]/form/div[2]/button")).click();
	}

	@When("^enter card details as ([^\"]*) and Expiry date as ([^\"]*)  and Expiry year as ([^\"]*) and Security code as ([^\"]*)$")
	public void enter_card_details_as_and_expiry_date_as_and_security_code_as(String cardno, String edate,String eyear, String cvv) throws InterruptedException {
		driver.findElement(By.xpath("//*[contains(text(),'Credit & Debit Card')]")).click();
		Thread.sleep(6000);
		//WebElement cardnoiframe=driver.findElement(By.xpath("//*[@id='encryptedCardNumber']"));
		driver.switchTo().frame(0);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='encryptedCardNumber']")).sendKeys(cardno);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//*[@id='encryptedExpiryMonth']")).sendKeys(edate);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//*[@id='encryptedExpiryYear']")).sendKeys(eyear);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//*[@id='encryptedSecurityCode']")).sendKeys(cvv);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='adyenCreditCardSubmitButton']")).click();
	}

	@Then("User should be able to login sucessfully and new page open")
	public void user_should_be_able_to_login_sucessfully_and_new_page_open() {
	}

	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
