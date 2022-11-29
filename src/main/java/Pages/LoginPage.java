package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
    private WebDriver driver;
    private By Username = By.name("");
    private By Password = By.name("");
    private By Login_btn = By.xpath("");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void SetUserName(String user_name){
        driver.findElement(Username).sendKeys(user_name);
    }

    public void SetPassword(String password){
        driver.findElement(Password).sendKeys();

    }

    public void Click_loginbtn(){
        driver.findElement(Login_btn).click();
    }

}
