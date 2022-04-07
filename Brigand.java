package tp1;

public class Brigand extends Humain {

	private static final String LOOK_DEFAULT = "mechant";
	private static final String BOISSON_FAV_BRIGAND= "Vodka";
	
	private String look;
	private int nbDameEnlever;
	private int recompenseOfferte;
	private boolean prison;
	
	public Brigand(String nom, String look, String boissonFav) {
		super(nom);
		this.nbDameEnlever = 0;
		this.prison = false; // false = pas en prison
		this.recompenseOfferte = 0;
		this.look = look;
	}
	
	public Brigand(String nom) {
		this(nom, LOOK_DEFAULT, BOISSON_FAV_BRIGAND);
	}
	
	public void capturerDame(Dame dame) {
		if(this.prison==false) {
			super.parler("Ah ! Ah ! "+dame.quelleEstTonNom()+" tu es mienne desormais");
			this.nbDameEnlever ++;
			this.recompenseOfferte += 100;
			dame.seFaireKidnapper();
		}
		else {
			super.commentaire(this.quelleEstTonNom()+" est en prison ne peux pas capturer "+dame);
		}
	}
	
	@Override
	public String quelleEstTonNom() {
		return super.quelleEstTonNom()+" le "+this.look;
	}
	
	public int getNbDameEnlever() {
		return nbDameEnlever;
	}

	public int getRecompenseOfferte() {
		return recompenseOfferte;
	}
	
	public void seFaireEmprisoner(Cowboy cowboy) {
		if(this.nbDameEnlever>0) {
			super.parler("Damned je suis fait ! "+cowboy.quelleEstTonNom()+" tu m'a eu !");
			this.recompenseOfferte = 0;
			this.prison = true;
			this.nbDameEnlever = 0;
			super.commentaire("Sa récompense etait de : "+calculWanted()+" €");
		}
	}
	
	public int calculWanted() {
		return this.recompenseOfferte+=100;
	}
	
	@Override
	public void sePresenter() {
		super.sePresenter();
		super.parler("J'ai l'air "+this.look+" et j'ai déjà kidnapper "+this.nbDameEnlever+" dames");
		super.parler("Ma tête est mise à prix à "+this.recompenseOfferte);
	}

}
