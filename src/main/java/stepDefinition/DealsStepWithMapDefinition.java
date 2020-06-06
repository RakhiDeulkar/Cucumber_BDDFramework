//package stepDefinition;
//
//import java.util.Map;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
////data table with maps : for parameterization of test cases
//
//public class DealsStepWithMapDefinition {
//	WebDriver driver;
//
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws InterruptedException {
//
//		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
//		driver = new ChromeDriver(); // error explanation :In user_is_already_on_Login_Page() you're using a local
//										// variable named driver within that method. You're not setting the static
//										// driver that your other methods are using. As a result, when they reference
//										// driver it is still null.
//		driver.get("https://freecrm.co.in/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement Loginb = driver.findElement(
//				By.xpath(".//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", Loginb);
//
//	}
//
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Cogmento CRM", title);
//	}
//
//	@Then("user enters username and password$")
//	public void user_enters_username_and_password(DataTable credential) {
//		for (Map<String, String> data : credential.asMaps(String.class, String.class)) {
//
//			driver.findElement(By.xpath(".//*[@name='email']")).sendKeys(data.get("username"));
//			driver.findElement(By.xpath(".//*[@name='password']")).sendKeys(data.get("password"));
//		}
//	}
//
//	@Then("^user clicks on Login button$")
//	public void user_clicks_on_Login_button() {
//
//		WebElement Loginbtn = driver.findElement(By.xpath(".//*[@class='ui fluid large blue submit button']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", Loginbtn);
//	}
//
//	@Then("^user is on HomePage$")
//	public void user_is_on_HomePage() throws InterruptedException {
//
//		Thread.sleep(2000);
//		WebElement itle = driver.findElement(By.xpath(".//span[contains(@class,'item-text') and text()='Home']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0];", itle);
//	}
//
//	@Then("^move to new deal page$")
//	public void move_to_new_deal_page() throws InterruptedException {
//		WebElement deal = driver.findElement(By.xpath(".//span[contains(@class,'item-text') and text()='Deals']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", deal);
//
//		Thread.sleep(1000);
//
//		WebElement NewDeal = driver.findElement(By.xpath(".//*[@href='/deals/new']"));
//		JavascriptExecutor jss = (JavascriptExecutor) driver;
//		jss.executeScript("arguments[0].click();", NewDeal);
//
//	}
//
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable dealData) throws InterruptedException {
//
//		for (Map<String, String> deal : dealData.asMaps(String.class, String.class)) {
//
//			driver.findElement(By.xpath(".//*[@name='title']")).sendKeys(deal.get("title")); // row.column
//			driver.findElement(By.xpath(".//*[@name='amount']")).sendKeys(deal.get("amount"));
//			driver.findElement(By.xpath(".//*[@name='probability']")).sendKeys(deal.get("probability"));
//			driver.findElement(By.xpath(".//*[@name='commission']")).sendKeys(deal.get("commission"));
//
//			driver.findElement(By.xpath(".//*[@class='save icon']")).click(); // save button
//
//			Thread.sleep(2000);
//
//			WebElement deal1 = driver.findElement(By.xpath(".//span[contains(@class,'item-text') and text()='Deals']"));
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", deal1);
//
//			Thread.sleep(2000);
//
//			WebElement NewDeal = driver.findElement(By.xpath(".//*[@href='/deals/new']"));
//			JavascriptExecutor jss = (JavascriptExecutor) driver;
//			jss.executeScript("arguments[0].click();", NewDeal);
//
//			Thread.sleep(2000);
//		}
//
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}
