import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testSuccessfulLogin() {
        System.out.println("1. Navigating to the login page...");
        driver.get("https://the-internet.herokuapp.com/login");
        
        System.out.println("2. Entering username and password...");
        // The robot looks for a box named 'username' and types into it
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        // The robot looks for a box named 'password' and types into it
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        
        System.out.println("3. Clicking the login button...");
        // The robot finds the submit button and clicks it
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        System.out.println("4. Checking if login was successful...");
        // The robot reads the green success banner on the next screen
        String successMessage = driver.findElement(By.id("flash")).getText();
        System.out.println("Robot sees this message: " + successMessage);
        
        // This is the actual "Test". If this message doesn't appear, the test fails.
        Assert.assertTrue(successMessage.contains("You logged into a secure area!"));
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}