package canard.model;

import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;

public abstract class Canard {
    protected String nom; 
    private ComportementVol comportementVol;
    private ComportementCancan comportementcancan;

    public Canard(String nom, ComportementVol comportementVol, ComportementCancan comportementcancan) {
        this.nom = nom;
        this.comportementVol = comportementVol;
        this.comportementcancan = comportementcancan;
    }

    public String getNom() {
        return nom;
    }

    public String nager() {
        return "Tous les canards flottent, même les leurres!";
    }

    public abstract String afficher(); 

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public String effectuerVol() {
        return comportementVol.voler();
    }
    
	public void setComportementCancan(ComportementCancan comportementcancan) {
		this.comportementcancan = comportementcancan;
	}
	
	public String effectuerCancan() {
		return comportementcancan.cancaner();
	}
	
	public void changerComportementVol(ComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}
	
	public void changerComportementCancan(ComportementCancan comportementCancan) {
		this.comportementcancan = comportementCancan;
	}
}