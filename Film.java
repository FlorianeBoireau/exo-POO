public class Film {
// Atributs
    private String titre;
    private  Realisatrice realisatrice;
    private int date;

    // constructeurs
    public Film(String titre, Realisatrice realisatrice, int date) {
        this.titre = titre ;
        this.realisatrice = realisatrice;
        this.date = date;
    }
    
    // fonction et méthodes
    public String getTitre() {
		return this.titre;
	}

    public Realisatrice getRealisatrice() {
		return this.realisatrice;
	}

    public int getDate() {
		return this.date;
	}

    public void afficher() {
        System.out.println("Le film " + this.titre + " est sorti en " + this.date + " et est réalisé par " + this.realisatrice.getPrenom() + " " + this.realisatrice.getNom());
    }
}
