package tp1;

public class Sherif extends Cowboy{
	
	private static final String ADJ_DEFAULT = "Honnete";
	private static final String BOISSON_FAV_COWBOY = "Monster";
	private int nbBrigandCoffrer;
	

	public Sherif(String nom, String adj, String boissonFav) {
		super(nom, adj, boissonFav);
	}
	
	public Sherif(String nom) {
		this(nom, ADJ_DEFAULT, BOISSON_FAV_COWBOY);
	}
	
	public void rechercherBrigand(Brigand enRecherche) {
		super.parler("OYER OYER BRAVE GENS !! "+enRecherche.getRecompenseOfferte()+" à qui arretera "+enRecherche.quelleEstTonNom()+" le brigand mort ou vif !!");
	}
	
	@Override
	public void sePresenter() {
		super.sePresenter();
		parler("J'ai capturer ");
	}
}
