package tp1;

public class Cowboy extends Humain {

	private static final String ADJ_DEFAULT = "Vaillant";
	private static final String BOISSON_FAV_COWBOY = "RedBull";
	
	private int populariter = 0;
	private String adj;
	
	public Cowboy(String nom, String adj, String boissonFav) {
		super(nom, boissonFav);
		this.adj = adj;
	}
	
	public Cowboy(String nom) {
		this(nom, ADJ_DEFAULT, BOISSON_FAV_COWBOY);
	}
	
	public void tirerSurBrigand(Brigand mechant) {
		// A faire
		super.commentaire("Le "+this.adj+" "+this.quelleEstTonNom()+" tire sur "+mechant.quelleEstTonNom()+". PAN ! ");
		super.parler("Prend ça rascal !");
		mechant.seFaireEmprisoner(this);
	}
	
	public void libererDame(Dame dame) {
		super.parler("Je te libère "+dame.quelleEstTonNom());
		this.populariter++;
		dame.seFaireLiberer(this);
	}
	
	public int getPopulariter() {
		return populariter;
	}
	
	@Override
	public void sePresenter() {
		super.sePresenter();
		super.parler("J'ai l'air incroyable je suis "+this.adj);
		super.parler("je suis populaire à "+getPopulariter());
	}
}
