//Page d'identification de Cdiscount
package cDiscount.testing.steps.serenity.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://clients.cdiscount.com/Account/Login.html?")
public class IDPage extends PageObject{
	//case pour entrer son email
	@FindBy(id="LoginViewData_CustomerLoginFormData_Email")
	WebElement emailBar;
	
	//case pour entrer son mot de passe
	@FindBy(id="LoginViewData_CustomerLoginFormData_Password")
	WebElement pwdBar;
	
	//boutton de validation
	@FindBy(xpath="//*[@id=\"loginForm\"]/fieldset/div/input")
	WebElement validateButton;
	
	public IDPage(WebDriver driver) {
		super(driver);
	}
	
	//ouvrir la page d'identification
	public void openIdPage() {
		this.open();
	}

	//Saisir ses identifiants (email et mot de passe)
	public void saisirIdentifiants(String login, String pwd) {
		emailBar.sendKeys(login);
		pwdBar.sendKeys(pwd);
	}

	// Appuyer sur le bouton valider
	public void clickerSurValider() {
		validateButton.submit();
	}

	//recuperer le texte de bienvenue lors de la connexion a son compte
	public String getBonjour() {
		return find(By.xpath("//*[@id=\"czCt\"]/div[2]/div/div[1]/span")).getText();
	}

	//recuperer le texte d'erreur lorsque les identifiants ne sont pas correctes
	public String getError() {
		return find(By.xpath("//*[@id=\"loginForm\"]/fieldset/div/ul/li")).getText();
	}

	
	
}
