package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverUtils;

public class HomePage
{
    WebDriver driver;
    WebDriverWait wait;

    //locators
    @FindBy(linkText = "Register") public WebElement registerLink;

    @FindBy(linkText = "Log in") public WebElement loginLink;


    @FindBy(id="small-searchterms") public WebElement searchTextBox;


    @FindBy(className="search-box-button") public WebElement searchBtn;

    @FindBy(linkText = "Log out") public WebElement logoutLink;

   public HomePage(WebDriver driver)
   {
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }



    //actions

   public void clickRegisterLink()
   {
       registerLink.click();
   }

    public void clickLoginLink()
    {

       DriverUtils.click(loginLink);
    }

    public void enterSearchText(String productName)
    {

        DriverUtils.type(searchTextBox,productName);
    }

    public void clickSearchButton()
    {

        DriverUtils.click(searchBtn);
    }

   public  void verifyLogout()
   {

       DriverUtils.click(logoutLink);
   }







}
