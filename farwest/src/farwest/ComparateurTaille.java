package farwest;

class ComparateurTaille  implements java.util.Comparator<Bandit> {

	@Override
	public int compare(Bandit bandit1, Bandit bandit2) {
		return bandit1.getTaille().compareTo(bandit2.getTaille());
	}

}
