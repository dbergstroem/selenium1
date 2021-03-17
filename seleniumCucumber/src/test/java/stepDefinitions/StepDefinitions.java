package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

		@Given("I have entered {int} into the calculator")
		public void i_have_entered_into_the_calculator(Integer int1) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\myDriver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
			Thread.sleep(5000);
			WebElement searchBox = driver.findElement(By.name("n01"));
			searchBox.sendKeys("123");
			WebElement searchBox2 = driver.findElement(By.name("n02"));
			searchBox2.sendKeys("456");
			WebElement searchButton = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[4]/input"));
			searchButton.click();
			WebElement additionAnswer = driver.findElement(By.name("answer"));
			additionAnswer.isDisplayed();
			assertEquals(true, additionAnswer.isDisplayed());
			Thread.sleep(5000);
			driver.quit();
		
			}

		@Given("I have also entered {int} into the calculator")
		public void i_have_also_entered_into_the_calculator(Integer int1) {
		    
		}
		
		@When("I press add")
		public void i_press_add() {
		    
		}
		
		@Then("the result should be {int} on the screen")
		public void the_result_should_be_on_the_screen(Integer int1) {
		    
		}

}
