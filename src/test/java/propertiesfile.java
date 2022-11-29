import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;

public class propertiesfile {

    Properties prop= new Properties();
    public static String browsername=null;
@Test
    public void readproperties(){


        try {
            InputStream input = new FileInputStream("C:\\Users\\Hp\\IdeaProjects\\_1LMTestingFrameWorkcom\\src\\main\\resources\\config.properties");
            prop.load(input);

           browsername =  prop.getProperty("browser");


        } catch (Exception e) {
            e.printStackTrace();
        }

        if(browsername.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.javatpoint.com/severity-and-priority-in-testing");
        }
        else if (browsername.equalsIgnoreCase("internet")){
            WebDriverManager.iedriver().setup();
            WebDriver fox= new InternetExplorerDriver();
            fox.get("https://www.javatpoint.com/severity-and-priority-in-testing");
        }
    }

    @Test
    public void writeproperties(){

        try {
            OutputStream out = new FileOutputStream("C:\\Users\\Hp\\IdeaProjects\\_1LMTestingFrameWorkcom\\src\\main\\resources\\config.properties");
              prop.setProperty("browser","firefor");
              prop.store(out,"comment");


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
