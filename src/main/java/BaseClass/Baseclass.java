package BaseClass;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.logging.Logger;

public class Baseclass {

   public WebDriver driver;

   public Logger logger;

    @BeforeTest
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://testcrm.1lm.com.au");
        LoginPage login = new LoginPage(driver);

        logger= Logger.getLogger("1LMTestingFrameWorkcom");
        logger.info("");


    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }


}
