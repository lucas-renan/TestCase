package TestCase;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class testCase {

	  private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
	    driver = new FirefoxDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void testCase() {
	    // Test name: Test Case
	    // Step # | name | target | value
	    // 1 | open | https://www.organizze.com.br/ | 
	    driver.get("https://www.organizze.com.br/");
	    // 2 | click | linkText=Cadastre-se | 
	    driver.findElement(By.linkText("Cadastre-se")).click();
	    // 3 | click | css=.green > span | 
	    driver.findElement(By.cssSelector(".green > span")).click();
	    // 4 | click | id=email | 
	    driver.findElement(By.id("email")).click();
	    // 5 | type | id=email | ashdhashd@email.com
	    driver.findElement(By.id("email")).sendKeys("ashdhashd@email.com");
	    // 6 | type | id=password | testaut2020
	    driver.findElement(By.id("password")).sendKeys("testaut2020");
	    // 7 | type | id=passwordConfirmation | testaut2020
	    driver.findElement(By.id("passwordConfirmation")).sendKeys("testaut2020");
	    // 8 | click | id=termsOfUse | 
	    driver.findElement(By.id("termsOfUse")).click();
	    // 9 | click | css=#signup__form > .btn | 
	    driver.findElement(By.cssSelector("#signup__form > .btn")).click();
	    // 10 | click | linkText=Ok, começar agora | 
	    driver.findElement(By.linkText("Ok, começar agora")).click();
	  }
	}
