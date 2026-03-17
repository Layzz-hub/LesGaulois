package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;
	private int NB_VILLAGEOIS_MAX;

	public Village(String nom, Gaulois chef, int nB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.chef = chef;
		NB_VILLAGEOIS_MAX = nB_VILLAGEOIS_MAX;
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois - 1] = gaulois;
		nbVillageois++;
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois > nbVillageois) {
			System.out.println("Il n'y a pas autant d'habitants dans notre village");
			return null;
		} else {
			return villageois[numVillageois - 1];
		}
	}

	public void afficherVillage() {

	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);
		village.trouverVillageois(30);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);

	}
}
