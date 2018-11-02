import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\42HW170006\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        Thread.sleep(5000);
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle();

        Thread.sleep(5000);
        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }

        Thread.sleep(5000);
        driver.switchTo().window(originalHandle);

        Thread.sleep(5000);
        driver.quit();
    }
}
