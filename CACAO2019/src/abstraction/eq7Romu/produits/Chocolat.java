package abstraction.eq7Romu.produits;

public enum Chocolat {
	MG_NE_HP(Gamme.MOYENNE, false, false),
	MG_NE_SHP(Gamme.MOYENNE, false, true),
	MG_E_SHP(Gamme.MOYENNE, true, true),
	HG_E_SHP(Gamme.HAUTE, true, true);
	
	private boolean equitable;
	private boolean sansHuileDePalme;
	private Gamme gamme;
	
	Chocolat(Gamme gamme, Boolean equitable, Boolean shdp) {
		this.gamme = gamme;
		this.equitable = equitable;
		this.sansHuileDePalme = shdp;
	}
	public Gamme getGamme() {
		return this.gamme;
	}
	public boolean isEquitable() {
		return this.equitable;
	}
	public boolean isSansHuileDePalme() {
		return this.sansHuileDePalme;
	}
	public static void main(String[] args) {
		for (Chocolat c : Chocolat.values()) {
			System.out.println(c);
		}
	}

}
