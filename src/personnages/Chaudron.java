package personnages;

public class Chaudron {
	private int quantitePotion = 0;
	private int forcePotion = 0;

	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}

	public boolean resterPotion() {
		if (quantitePotion == 0) {
			return false;
		} else {
			return true;
		}
	}

	public int prendreLouche() {
		quantitePotion -= 1;
		if (quantitePotion == 0) {
			forcePotion = 0;
		}
		return forcePotion;
	}
}
