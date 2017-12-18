package cDiscount.testing.steps;

import cDiscount.testing.steps.serenity.ConditionsVenteStep;
import cucumber.api.java.fr.*;
import net.thucydides.core.annotations.Steps;

public class ConsulterConditionsStepDefinitons {
	
	@Steps
	ConditionsVenteStep conditionsVenteSteps;
	
	@Soit("^un internaute sur cDiscount$")
	public void un_internaute_sur_cDiscount() throws Exception {
	    conditionsVenteSteps.allerSurCDiscount();
	}
	
	@Lorsque("^il clique sur le lien vers les Conditions Générales de Vente$")
	public void il_clique_sur_le_lien_vers_les_Conditions_Générales_de_Vente() throws Exception {
	    conditionsVenteSteps.cliquerSurLeLienDesCGV();
	}


	@Alors("^il est affiché \"([^\"]*)\" en haut de la page$")
	public void il_est_affiché_en_haut_de_la_page(String arg1) throws Exception {
	    conditionsVenteSteps.verifiePageConditionsDeVente(arg1);
	}
}
