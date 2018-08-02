import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/irmafar/Downloads/chromedrivernew");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.go-jek.com/");
		
		driver.findElement(By.xpath("//*[@id='joinButton']/div")).click();
		String xpathButtonGoClean = "//*[@id='gojek']/div[5]/div/div/div/div/div[2]/div[3]/div/a[2]";
		WebDriverWait wait = new WebDriverWait(driver, 6);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathButtonGoClean)));
		
		driver.findElement(By.xpath(xpathButtonGoClean)).click();
		
		WebDriverWait waitForm = new WebDriverWait(driver, 5);
		// Fill the form
		
		driver.findElement(By.xpath("//*[@id='input-name']")).sendKeys("Irma Farhanah");
		driver.findElement(By.xpath("//*[@id='input-phone']")).sendKeys("085760776776");
		
		Select jenisKelamin = new Select(driver.findElement(By.xpath("//*[@id='select-gender']")));
		jenisKelamin.selectByIndex(1);

		Select daerah = new Select(driver.findElement(By.xpath("//*[@id='select-daerah']")));
		daerah.selectByIndex(1);
		
		Select pengalamanKerja = new Select(driver.findElement(By.xpath("//*[@id='select-work-experience']")));
		pengalamanKerja.selectByIndex(1);
		
		driver.findElement(By.xpath("//*[@id='input-woork-place']")).sendKeys("Blanja");
		
		Select daerahGoClean = new Select(driver.findElement(By.xpath("//*[@id='select-channel']")));
		daerahGoClean.selectByIndex(1);
		
		
		
		
		
//		driver.findElement(By.xpath("//*[@id='input-name']")).sendKeys("Irma Farhanah");
//		driver.findElement(By.xpath("//*[@id='input-name']")).sendKeys("Irma Farhanah");
//		driver.findElement(By.xpath("//*[@id='input-name']")).sendKeys("Irma Farhanah");
		
		
	}
	

}
