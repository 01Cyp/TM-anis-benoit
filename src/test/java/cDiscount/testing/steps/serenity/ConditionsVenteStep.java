package cDiscount.testing.steps.serenity;


import org.junit.Assert;
import cDiscount.testing.steps.serenity.pageObject.*;
import net.thucydides.core.annotations.Step;

public class ConditionsVenteStep {

	HomePage homePage;
	HomePage CGVPage;
	
	@Step
	public void allerSurCDiscount() {
		homePage.openHomePage();
	}
	
	//cliquer sur le lien "condition de vente en bas de la page d'accueil
	@Step
	public void cliquerSurLeLienDesCGV() throws InterruptedException {
		homePage.clickOnCGV();
	}

	// Verifier que nous sommes bien redirigés vers la page des conditions de ventes
	//(on verifie que le titre de la page est "Condition de Vente")
	
	@Step
	public void verifiePageConditionsDeVente(String titre) {
		String res = homePage.recupererTitre();
		Assert.assertEquals(res,titre);
	}

}
