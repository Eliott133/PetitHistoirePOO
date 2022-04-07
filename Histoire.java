package tp1;

public class Histoire {

	public static void main(String[] args) {

		
		Dame luna = new Dame("Luna",CouleurRobe.BLEU);
		Cowboy wilfried = new Cowboy("Wilfried");
		Brigand zucca = new Brigand("Zucca");
		Barman samuelEnfantDe13 = new Barman("Samuel");
		System.out.println(luna.quelleEstTonNom());
		System.out.println(zucca.quelleEstTonNom());
//		luna.changerRobe(CouleurRobe.BLANC);
//		System.out.println(luna.getCouleurRobe());
//		System.out.println("Point de populariter du cowboy "+wilfried.getPopulariter());
//		System.out.println("Nombre de dame enlever pour "+zucca.quelleEstTonNom()+" est de : "+ zucca.getNbDameEnlever());
//		System.out.println("Recompense de "+zucca.quelleEstTonNom()+" "+zucca.getRecompenseOfferte());
//		zucca.capturerDame(luna);
//		System.out.println("Recompense de "+zucca.quelleEstTonNom()+" "+zucca.getRecompenseOfferte());
//		wilfried.libererDame(luna);
//		System.out.println("Point de populariter du cowboy "+wilfried.getPopulariter());
//		System.out.println("Nombre de dame enlever pour "+zucca.quelleEstTonNom()+" est de : "+ zucca.getNbDameEnlever());
//		wilfried.tirerSurBrigand(zucca);
//		zucca.sePresenter();
		samuelEnfantDe13.sePresenter();
		samuelEnfantDe13.donnerBoisson(luna);
		
	}

}
