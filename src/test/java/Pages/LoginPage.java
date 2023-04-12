package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {
//creating constructor
    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }
//WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
    @FindBy(id = "txtUsername")
    public WebElement usernameTextBox;

//WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
    @FindBy(id = "txtPassword")
    public WebElement passwordTextBox;

//WebElement loginBtn = driver.findElement(By.id("btnLogin"));
    @FindBy(id = "btnLogin")
    public WebElement loginBtn;
    // Page Factory Model



    @FindBy(id = "welcome")
    public WebElement welcomeIcon;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutLink;


}