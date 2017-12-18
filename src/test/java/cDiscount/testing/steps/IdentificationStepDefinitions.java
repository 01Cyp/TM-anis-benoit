package cDiscount.testing.steps;

import cDiscount.testing.steps.serenity.IdentificationStep;
import cucumber.api.java.fr.*;
import net.thucydides.core.annotations.Steps;

public class IdentificationStepDefinitions {
	
	@Steps
	IdentificationStep identificationSteps;
	
	@Soit("^un internaute sur la page d'identification de cDiscount$")
	public void un_internaute_sur_la_page_d_identification_de_cDiscount() throws Exception {
	    identificationSteps.allerSurPageIdentification();
	}


	@Lorsque("^il rentre les identifiants \"([^\"]*)\" et \"([^\"]*)\"$")
	public void il_rentre_les_identifiants(String arg1, String arg2) throws Exception {
	    identificationSteps.rentrerIdentifiants(arg1,arg2);
	}
	
	@Alors("^il est écrit \"([^\"]*)\" en haut de la page de compte$")
	public void il_est_connecté_à_son_compte_cDiscount(String arg1) throws Exception {
	    identificationSteps.verifierConnection(arg1);
	}

	@Alors("^le message d'erreur \"([^\"]*)\" est affiche$")
	public void il_n_est_pas_connecté_à_son_compte_cDiscount(String arg1) throws Exception {
		identificationSteps.verifierNonConnection(arg1);
	}
	
}
