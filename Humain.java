package tp1;

public class Humain {
	
	private static final String DEFAULT_BOISSON_FAV = "eau";
	private String nom;
	private String boissonFav = DEFAULT_BOISSON_FAV ;
	
	public Humain(String nom, String boissonFav) {
		this.nom = nom;
		this.boissonFav = boissonFav;
	}
	
	public Humain(String nom) {
		this(nom, DEFAULT_BOISSON_FAV);
	}
	
	public String quelleEstTonNom() {
		return nom;
	}
	
	public String quelleTaBoissonFav() {
		return boissonFav;
	}
	
	public void parler(String texte) {
		System.out.println(this.nom+" - "+texte);
	}
	
	public void commentaire(String texte) {
		System.out.println("Narrateur - "+texte);
	}
	
	public void sePresenter() {
		if(this.boissonFav.equals(DEFAULT_BOISSON_FAV)) {
			parler("Bonjour mon nom est "+this.nom+" et ma boisson favoris est l' "+this.boissonFav);
		}
		else {
			parler("Bonjour mon nom est "+this.nom+" et ma boisson favoris est le "+this.boissonFav);
		}
	}
	
	public void boire() {
		if(this.boissonFav.equals(DEFAULT_BOISSON_FAV)) {
			parler("Ah ! un bon verre d' "+this.boissonFav+" ! GLOUPS !");
		}
		else {
			parler("Ah ! un bon verre de "+this.boissonFav+" ! GLOUPS !");
		}
	}
}
