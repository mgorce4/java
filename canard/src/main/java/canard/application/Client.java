package canard.application;

import canard.model.Canard;
import canard.model.Colvert;
import canard.model.PrototypeCanard;
import canard.model.vol.PropulsionAReaction;

public class Client {

	public static void main(String[] args) {
		Canard duck = new Colvert("duck");
		Canard proto = new PrototypeCanard("blup");

		
		System.out.println(duck.afficher());
		System.out.println(duck.nager());
        System.out.println(duck.effectuerVol());
        System.out.println(duck.effectuerCancan());
        System.out.println(proto.afficher());
        System.out.println(proto.effectuerVol());
        proto.changerComportementVol(new PropulsionAReaction());
        System.out.println(proto.effectuerVol());
		

	}

}
