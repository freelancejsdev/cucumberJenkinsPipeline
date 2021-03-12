package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage
{

    WebDriver driver;
    WebDriverWait wait;
  @FindBy(id="gender-male")  public WebElement maleRadioBtn;


  @FindBy(id="gender-female")  public WebElement femaleRadioBtn;

  @FindBy(id="FirstName")  public WebElement firstNameTextBox;

  @FindBy(id="LastName")  public WebElement lastNameTextBox;

  @FindBy(id="Email")  public WebElement emailTextBox;



    @FindBy(id="Password")  public WebElement passwordTextBox;


    @FindBy(id="ConfirmPassword")  public WebElement confirmPasswordTextBox;


    @FindBy(id="register-button")  public WebElement registerButton;

    @FindBy(css = "div.result")  public WebElement registerConfMsg;




    public RegisterPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }


    public void clickMaleRadioBtn()
    {
        maleRadioBtn.click();
    }

    public void clickFemaleRadioBtn()
    {
        femaleRadioBtn.click();
    }

    public void enterFirstName(String fn)
    {
        firstNameTextBox.sendKeys(fn);
    }

    public void enterLastName(String ln)

    {
       lastNameTextBox.sendKeys(ln);
    }


    public void enterEmail(String em)
    {
       emailTextBox.sendKeys(em);
    }

    public void enterPassword(String pw)
    {
      passwordTextBox.sendKeys(pw);
    }

    public void enterConfirmPassword(String cpw)
    {
       confirmPasswordTextBox.sendKeys(cpw);
    }


    public void clickRegisterButton()
    {
        registerButton.click();
    }


    public String verifyRegisterConfMsg()
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(registerConfMsg));
        return registerConfMsg.getText();
    }
}
