package webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeCursoSenai {
	
	private WebDriver driver;
	
	@Before
	public void testConfig() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void navTest( ) {
		driver.get("https://informatica.sp.senai.br/");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Excel");
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}
	
	@After
	public void quitConfig( ) {
	}
	
	
	
	
	
	
	
	
	

}
