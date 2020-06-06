//package stepDefinition;
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//import org.junit.Assert;
//
//
//
//public class LoginStepDefinition {
//	WebDriver driver;
//	
//
//      @Given("^user is already on Login Page$")
//       public void user_is_already_on_Login_Page() throws InterruptedException{    	  
//    	System.setProperty("webdriver.chrome.driver","C:\\Chrome\\chromedriver.exe");
//  		driver=new ChromeDriver(); // error explanation :In user_is_already_on_Login_Page() you're using a local variable named driver within that method. You're not setting the static driver that your other methods are using. As a result, when they reference driver it is still null.
//  		driver.get("https://freecrm.co.in/");  		
//  		WebElement Loginb= driver.findElement(By.xpath(".//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']"));
//  		JavascriptExecutor js= (JavascriptExecutor)driver;
//  	    js.executeScript("arguments[0].click();",Loginb);	
//	    //driver.findElement(By.xpath(".//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
//  	    }
//	
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM(){		
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Cogmento CRM",title);
//	}
//	
//	/*Data Driven approach  another way Reg Expresiion: 1)\"([^\"]*)\"
//	                                                    2)\"(.*)\"         */
//	
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username,String password){		
//		driver.findElement(By.xpath(".//*[@name='email']")).sendKeys(username);
//		driver.findElement(By.xpath(".//*[@name='password']")).sendKeys(password);
//	}
//	
//	// Use for hardcoded values
//	
//	/*@Then("^user enters username and password$")
//	public void user_enters_username_and_password(){		
//		driver.findElement(By.xpath(".//*[@name='email']")).sendKeys("rakhideulkar10@gmail.com");
//		driver.findElement(By.xpath(".//*[@name='password']")).sendKeys("Rakhi@123");
//	}*/
//	
//	
//	@Then("^user clicks on Login button$")
//	public void user_clicks_on_Login_button() {
//		//driver.findElement(By.xpath(".//*[@class='ui fluid large blue submit button']")).click();
//		
//		WebElement Loginbtn= driver.findElement(By.xpath(".//*[@class='ui fluid large blue submit button']"));
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();",Loginbtn);	
//	}
//	
//
//	@Then("^user is on HomePage$")
//	public void user_is_on_HomePage() throws InterruptedException {		
////		boolean status=driver.findElement(By.xpath(".//*[@class='content card-header']")).isDisplayed();
////		Assert.assertTrue(status);
////		System.out.println("Login  Successfull");
//			
//		Thread.sleep(2000);
//	    WebElement itle= driver.findElement(By.xpath(".//span[contains(@class,'item-text') and text()='Home']"));
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0];",itle);	
//		
////		String title=driver.getTitle();
////		System.out.println("Home Page title: "+title);
////		Assert.assertEquals("Cogmento CRM", title);
//	}
//	
//	@Then("^move to new contact details page$")
//	public void move_to_new_contact_details_page() throws InterruptedException{
//		   WebElement Contact= driver.findElement(By.xpath(".//span[contains(@class,'item-text') and text()='Contacts']"));
//			JavascriptExecutor js= (JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click();",Contact);
//			
//			Thread.sleep(1000);
//			
//			WebElement NewContact= driver.findElement(By.xpath(".//*[@href='/contacts/new']"));
//		    JavascriptExecutor jss= (JavascriptExecutor)driver;
//		    jss.executeScript("arguments[0].click();",NewContact);	
//			
//			
//	   
//	}
//	
//
//    @Then("^user enters contact details \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
//    public void user_enters_contact_details_and_and(String firstname, String lastname, String description){
//	   driver.findElement(By.xpath(".//*[@name='first_name']")).sendKeys(firstname);
//	   driver.findElement(By.xpath(".//*[@name='last_name']")).sendKeys(lastname);
//	   driver.findElement(By.xpath(".//*[@name='description']")).sendKeys(description);
//	   driver.findElement(By.xpath(".//*[@class='save icon']")).click();
//     }
//
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//	driver.quit();
//	}
//}
