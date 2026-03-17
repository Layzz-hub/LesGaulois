package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();

	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + quantite + " doses de potoin magique. Elle a une force de " + forcePotion + ".");
	}

	public void booster(Gaulois gaulois) {
		boolean contientPotion = chaudron.resterPotion();
		String nomgaulois = gaulois.getNom();
		if (contientPotion) {
			if (nomgaulois == "Obélix") {
				parler("Non, " + nomgaulois + " Non !... Et tu le sais très bien !");
			} else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nomgaulois + " un peu de potion magique.");
			}
		} else {
			parler("Désolé " + nomgaulois + " il n'y a plus une seule goutte de potion.");
		}
	}

	public String getNom() {
		return nom;
	}

}
