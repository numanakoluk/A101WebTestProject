import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dev {
    public String path = "C:\\Selenium\\A101Project\\chromedriver.exe";
    public static WebDriver driver;
    public ChromeOptions options = new ChromeOptions();


    public Dev() {

        this.options.addArguments(new String[]{"--disable-notifications"});
        System.setProperty("webdriver.chrome.driver", this.path);
        driver = new ChromeDriver(this.options);
    }
}
