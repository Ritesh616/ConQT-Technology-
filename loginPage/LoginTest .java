import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the application URL
        driver.get("https://www.conqt.com");

        // Find the username and password fields and login button
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // Enter valid username and password
        usernameField.sendKeys("your_username");
        passwordField.sendKeys("your_password");

        // Click on the login button
        loginButton.click();

        // Wait for some time to allow login process (you might need to add an explicit wait here)
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify successful login (example: checking the current URL)
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.conqt.com/dashboard")) {
            System.out.println("Login successful. Redirected to the dashboard.");
        } else {
            System.out.println("Login failed or redirected to unexpected page.");
        }

        // Close the browser
        driver.quit();
    }
}
