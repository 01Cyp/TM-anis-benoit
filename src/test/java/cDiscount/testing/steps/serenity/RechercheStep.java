package cDiscount.testing.steps.serenity;

import org.junit.Assert;

import cDiscount.testing.steps.serenity.pageObject.HomePage;
import net.thucydides.core.annotations.Step;

public class RechercheStep {
	
	HomePage homePage;
	
	@Step
	public void allerSurCDiscount() {
		homePage.openHomePage();
	}
	
	// entrer un mot dans la barre de recherche de la page d'accueil
	@Step
	public void rechercheParMotCle(String keyword) {
		homePage.saisirRecherche(keyword);
	}

	// Verfier que les resultats obtenus sont coherents
	@Step
	public void verifieLienVersProduit(String attendu) {
		String recupererResultat = homePage.recupererResultat();
		Assert.assertEquals(attendu, recupererResultat);
	}
}
