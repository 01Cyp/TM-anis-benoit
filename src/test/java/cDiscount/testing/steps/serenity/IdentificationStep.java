package cDiscount.testing.steps.serenity;

import org.junit.Assert;

import cDiscount.testing.steps.serenity.pageObject.IDPage;
import net.thucydides.core.annotations.Step;

public class IdentificationStep {
	
	IDPage idPage;
	
	@Step
	public void allerSurPageIdentification() {
		idPage.openIdPage();
	}

	//Saisir ses identifiants de comptes
	@Step
	public void rentrerIdentifiants(String login, String pwd) {
		idPage.saisirIdentifiants(login,pwd);
		idPage.clickerSurValider();
	}

	// S'assurer que le compte est ouvert (avec de vrai identifiants)
	public void verifierConnection(String text) {
		String res = idPage.getBonjour();
		Assert.assertEquals(res,text);
	}

	//S'assurer que le compte ne s'est pas ouvert (avec de faux identifiants)
	public void verifierNonConnection(String err) {
		String res = idPage.getError();
		Assert.assertEquals(res,err);
	}

	
	
}
