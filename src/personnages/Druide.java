package personnages;

public class Druide {
	private String nom;
	private int force;

	private Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public void parler(String texte) {

	}

	private static void prendreParole() {

	}

	public void fabriquerPotion(int quantite, int forcePotion) {

	}

	public void booster(Gaulois gaulois) {

	}

	public String getNom() {
		return nom;
	}

}
