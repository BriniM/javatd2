package io.brinim.td2.ex1;

import java.time.LocalDate;

class Contrat {
    private Client client;
    private Voiture voiture;
    private LocalDate dateLocation, dateFinLocation;

    public Contrat() {}

    public Contrat(Client client, Voiture voiture, LocalDate dateLocation, LocalDate dateFinLocation) {
        this.client = client;
        this.voiture = voiture;
        this.dateLocation = dateLocation;
        this.dateFinLocation = dateFinLocation;
    }

    public String toString() {
        return "--- LOCATION ---"
        + client.toString() 
        + voiture.toString()
        + String.format("Date debut location: %s\n"
        + "Date fin location: %s\n", dateLocation, dateFinLocation)
        + "--- FIN LOCATION ---";
    }
 
    public Client getClient() {
        return client;
    }

    public LocalDate getDateFinLocation() {
        return dateFinLocation;
    }

    public LocalDate getDateLocation() {
        return dateLocation;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDateFinLocation(LocalDate dateFinLocation) {
        this.dateFinLocation = dateFinLocation;
    }

    public void setDateLocation(LocalDate dateLocation) {
        this.dateLocation = dateLocation;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
}
