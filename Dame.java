package tp1;

public class Dame extends Humain{

	private CouleurRobe couleurRobe;
	private static final CouleurRobe COULEUR_ROBE_DEFAULT = CouleurRobe.BLANC;
	private static final String BOISSON_FAV_DAME = "LAIT";
	private String etat = "libre";
	
	public Dame(String nom, CouleurRobe couleurRobe, String boissonFav) {
		super(nom, boissonFav);
		this.couleurRobe = couleurRobe;
		this.etat = "libre";
	}
	
	public Dame(String nom) {
		this(nom, COULEUR_ROBE_DEFAULT, BOISSON_FAV_DAME);
	}
	
	public Dame(String nom, CouleurRobe couleurRobe) {
		this(nom, couleurRobe, BOISSON_FAV_DAME);
	}
	
	@Override
	public String quelleEstTonNom() {
		return "Miss "+super.quelleEstTonNom();
	}
	
	public void seFaireKidnapper() {
		if(this.etat.equals("captive")) {
			super.commentaire("Ceci est impossible elle est deja capturer");
		}
		else {
			super.parler("Ahhhh aider moi ! ");
			this.etat = "captive";
		}
	}
	
	public void seFaireLiberer(Cowboy sauveur) {
		if(this.etat.equals("libre")) {
			super.parler("Je suis déjà en liberter "+sauveur.quelleEstTonNom());
		}
		else {
			super.parler("Merci de m'avoir sauver "+sauveur.quelleEstTonNom());
			this.etat = "libre";
		}
	}
	
	public void changerRobe(CouleurRobe newCouleurRobe) {
		this.couleurRobe = newCouleurRobe;
		super.parler("Regarder ma nouvelle robe elle est maintenant "+newCouleurRobe);
	}
	
	public CouleurRobe getCouleurRobe() {
		return couleurRobe;
	}
	
	@Override
	public void sePresenter() {
		super.sePresenter();
		super.parler("J'ai l'air toute belle ma robe est "+this.couleurRobe+" et je suis "+this.etat);
	}
}
