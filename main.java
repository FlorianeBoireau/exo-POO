public class main {

    // main point de départ indispenssable pour qu'un programme Java démarre
    public static void main(String[] args) {
		
        // création des objets de class Réalisatrice
        Realisatrice justine = new Realisatrice("Justine", "Triet",5);
        Realisatrice sofia = new Realisatrice("Sofia", "Coppola", 52);
        Realisatrice julia = new Realisatrice("Julia", "Ducournau", 40);


        // création des objets Film
        Film anatomie = new Film("Anatomie d'une chute", justine, 2023);
        Film lost = new Film("Lost in Translation", sofia, 2003);
        Film grave = new Film("Grave", julia, 2016);
        
        // appelle des fonctions qui pèrmette d'afficher les valeurs des objets.
        justine.afficher();
        anatomie.afficher();

        sofia.afficher();
        lost.afficher();

        julia.afficher();
        grave.afficher();

    }   // System.out.println(Categorie.getTitle(Categorie.values()));
}
