package canard.model;

import canard.model.cancan.CanardMuet;
import canard.model.vol.NePasVoler;

public class CanardEnPlastique extends Canard {

	public CanardEnPlastique(String nom) {
		super(nom, new NePasVoler(),new CanardMuet());
	}

	@Override
	public String afficher() {
		return "Je suis un canard en plastique";
	}

}
