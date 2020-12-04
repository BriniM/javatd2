package io.brinim.td2.ex1;

class Voiture {
    private String marque, categorie;
    private int puissance;
    private boolean estDisponible;

    public Voiture() {
        estDisponible = true;
    }

    public Voiture(String marque, String categorie, int puissance, boolean estDisponible) {
        this.marque = marque;
        this.categorie = categorie;
        this.puissance = puissance;
        this.estDisponible = estDisponible;
    }

    public String toString() {
        return String.format("Marque: %s\n" 
            + "Catégorie: %s\n"
            + "Puissance: %d\n"
            + "Disponible: %s\n"
            + "--- Fin Voiture ---\n", marque, categorie, puissance, estDisponible ? "Oui" : "Non");
    }

    public String getCategorie() {
        return categorie;
    }

    public String getMarque() {
        return marque;
    }

    public int getPuissance() {
        return puissance;
    }

    public boolean getEstDisponible() {
        return this.estDisponible;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setDisponible(boolean disponible) {
        this.estDisponible = disponible;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
}
