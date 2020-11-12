package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class actilogin 
 {
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement logIn;
	
	public actilogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void passBtn()
	{
		logIn.click();
	}
 }
