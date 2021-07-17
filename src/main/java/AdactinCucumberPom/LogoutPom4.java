package AdactinCucumberPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.AdactinmainBase;

public class LogoutPom4 extends AdactinmainBase {
	
	@FindBy(xpath="//input[@id=\'logout\']")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}




	public LogoutPom4(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}

}

