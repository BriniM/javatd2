package io.brinim.td2.ex1;

class Client {
    private String nom, numeroPermis, adresse;
    private int cin, numeroTelephone;

    public Client() {}

    public Client(String nom, String numeroPermis, String adresse, int cin, int numeroTelephone) {
        this.nom = nom;
        this.numeroPermis = numeroPermis;
        this.adresse = adresse;
        this.cin = cin;
        this.numeroTelephone = numeroTelephone;
    }

    public String toString() {
        return "--- Client ---\n"
            + String.format("Client: %s\n" 
            + "CIN: %d\n"
            + "Téléphone: %d\n"
            + "N Permis: %s\n"
            + "Adresse: %s\n"
            + "--- Fin Client ---\n", nom, cin, numeroTelephone, numeroPermis, adresse);
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public int getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }

    public void setNumeroTelephone(int numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
}
