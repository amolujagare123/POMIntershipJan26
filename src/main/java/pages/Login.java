package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
  /*  WebDriver driver;
    WebElement element  = driver.findElement(By.xpath(""));
 */

    @FindBy(xpath = "//input[@id='email']")
    WebElement txtUsername;

    @FindBy(xpath = "//input[@id='password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//a[@class='btn btn-default']")
    WebElement forgotPassword;

    public void setUsername(String username)
    {
        txtUsername.sendKeys(username);
    }

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }

    public void clickForgotPassword()
    {
        forgotPassword.click();
    }
}
