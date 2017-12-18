//Page d'acueil de Cdiscount
package cDiscount.testing.steps.serenity.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.cdiscount.com/")
public class HomePage extends PageObject {
	//barre de recherche
	@FindBy(xpath="//*[@id=\"hFull\"]/div[2]/div[1]/input")
	private WebElement searchBar;
	
	//bouton recherche pres de la barre de recherche
	@FindBy(xpath="//*[@id=\"hFull\"]/div[2]/div[1]/button")
	private WebElement searchButton;
	
	//button vers page des conditions de ventes
	@FindBy(xpath="//*[@id=\"asyncFooter\"]/div[1]/div[2]/ul/li[5]/ul/li[1]/a")
	private WebElement LinkToCGV;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	//Aller sur la page d'accueil
	public void openHomePage() {
		this.open();
	}

	// Cliquer sur le lien vers les conditions de ventes
	public void clickOnCGV() {
		WebElement element = this.getDriver().findElement(By.xpath("//*[@id=\"asyncFooter\"]/div[1]/div[2]/ul/li[5]/ul/li[1]/a"));
		((JavascriptExecutor) this.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		LinkToCGV.click();
	}
	
	// Saisir dans la bare de recherche un mot (produit) a rechercher
	public void saisirRecherche(String keyword) {
		searchBar.sendKeys(keyword);
		searchButton.click();
	}

	// recuperer le resultat de la recherche
	public String recupererResultat() {
		return find(By.xpath("//*[@id=\"lpTBk\"]/div[2]/div/ul/li[1]/div/a/div[2]")).getText();
	}

	
	//Recuperer le titre de la page en cours
	public String recupererTitre() {
		return find(By.xpath("//*[@id=\"czCt\"]/h1[2]")).getText();
	}

}
