package cDiscount.testing.steps;

import cDiscount.testing.steps.serenity.RechercheStep;
import cucumber.api.java.fr.*;
import net.thucydides.core.annotations.Steps;

public class RechercheProduitStepDefinitions {

	@Steps
	RechercheStep rechercheSteps;

	@Lorsque("^il fait une recherche avec le mot cle \"([^\"]*)\"$")
	public void il_fait_une_recherche_avec_le_mot_cle(String keyword) throws Exception {
		rechercheSteps.rechercheParMotCle(keyword);
	}

	@Alors("^le texte \"([^\"]*)\" est affiché$")
	public void le_texte_est_affiché(String attendu) throws Exception {
		rechercheSteps.verifieLienVersProduit(attendu);
	}
	
}
