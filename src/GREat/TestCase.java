package GREat;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.concurrent.TimeUnit;

public class TestCase {
	 
	private WebDriver driver;
	 //Preconditions
	 private String email = RandomStringUtils.randomAlphabetic(8)+"@email.com";
	 private String password = "testaut2020";
	 private String url = "https://www.organizze.com.br/";
	 //Expected outcome: 
	 private String expectedHeader = "Parabéns! O Organizze já está preparado para você!";
	 private String expectedBody = "Enviamos um e-mail para sua caixa de entrada. Confirme seu cadastro para receber um e-mail importante da nossa equipe.";
	 private String expectedButton = "Ok, começar agora";
	 JavascriptExecutor js;
	 
	 @Before
	 public void setUp() {
	    driver = new FirefoxDriver();
	    js = (JavascriptExecutor) driver;
	  }	  
	 @After
	 public void tearDown() {
		 driver.quit();
	 }	  
	 @Test
	 public void testCase() {

		// Test name: Test Case  
	    // 01. Access the URL | open | https://www.organizze.com.br/ |
	    driver.get(url);
	    // 02. Click on Cadastre-se | click | linkText=Cadastre-se |
	    driver.findElement(By.linkText("Cadastre-se")).click(); 
	    // 03. Select Organizar as minhas Finanças option  | click | css=.green > span |
	    driver.findElement(By.cssSelector(".green > span")).click();
	    // 04. | click | id=email | 
	    driver.findElement(By.id("email")).click();
	    // 04. Fill in random email | type | id=email | ${email_random}@gmail.com
	    driver.findElement(By.id("email")).sendKeys(email);
	    // 05. Fill in password | type | id=password | testaut2020
	    driver.findElement(By.id("password")).sendKeys(password);
	    // 06. Fill in password confirmation | type | id=passwordConfirmation | testaut2020
	    driver.findElement(By.id("passwordConfirmation")).sendKeys(password);
	    // 07. Check the Li e concordo com os termos de uso option | click | id=termsOfUse |
	    driver.findElement(By.id("termsOfUse")).click();
	    // 08. Click on Começar a usar | click | css=#signup__form > .btn | 
	    driver.findElement(By.cssSelector("#signup__form > .btn")).click();
	    //wait a moment	  
	    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);	      
	    // 1 | assertText | css = .btn | Ok, começar agora
	    assertEquals("fail assert 1", expectedButton, driver.findElement(By.linkText("Ok, começar agora")).getText());
	    // 2 | assertText | css=.mb-3 | Parabéns! O Organizze já está preparado para você!
	    assertEquals("fail assert 2", expectedHeader, driver.findElement(By.cssSelector(".mb-3")).getText());
	    // 3 | assertText | css=.mb-5 | Enviamos um e-mail para sua caixa de entrada. Confirme seu cadastro para receber um e-mail importante da nossa equipe.
	    assertEquals("fail assert 3", expectedBody, driver.findElement(By.cssSelector(".mb-5")).getText());	  
	  }
	}