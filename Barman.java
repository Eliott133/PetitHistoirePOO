package tp1;

public class Barman extends Humain {
	
	private String nomBar;
	private static final String BOISSON_BARMAN_DEF = "Vin";

	Barman(String nom){
		this(nom, "Chez "+nom);
	}
	
	Barman(String nom, String nomBar){
		super(nom, BOISSON_BARMAN_DEF);
		this.nomBar = nomBar;
	}
	
	@Override
	public void parler(String texte) {
		super.parler(texte+" Coco");
	}
	
	@Override
	public void sePresenter() {
		super.sePresenter();
		parler("Mon bar "+this.nomBar+" est le meilleur de toute la ville");
	}
	
	public void donnerBoisson(Humain personne) {
		if(personne instanceof Dame) {
			
		}
		parler("Tient "+personne.quelleEstTonNom()+ " un verre de "+personne.quelleTaBoissonFav()+" ");
	}
}
