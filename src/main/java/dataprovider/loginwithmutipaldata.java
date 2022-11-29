package dataprovider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;

public class loginwithmutipaldata {
//    WebDriver driver;
//    @BeforeTest
//    public  void starttest(){
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("http://testcrm.1lm.com.au");
//
//    }

    @Test(dataProvider = "testdata")
        public void testing(String unsername, String password){
            System.out.println(unsername + password);
//
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("demo@timewize.com.au");
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demo123");
//        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
//        driver.getTitle();
//        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//body/div[@id='root']/section[1]/section[1]/div[1]/main[1]/div[1]"));


    }

//    @AfterTest
//    public void aftertest(){
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//      //  driver.quit();
//
//    }
}
