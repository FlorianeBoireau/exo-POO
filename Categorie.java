public enum Categorie {

    FICTIONNELLE ("fictionnelle"),
    DOCUMENTAIRE("documentaire");

    private String title;

    Categorie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
