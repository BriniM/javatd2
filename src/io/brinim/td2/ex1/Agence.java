package io.brinim.td2.ex1;

import java.util.ArrayList;

class Agence {
    private ArrayList<Voiture> voitures;
    private ArrayList<Client> clients;
    private ArrayList<Contrat> contrats;

    public Agence() {
        voitures = new ArrayList<>();
        clients = new ArrayList<>();
        contrats = new ArrayList<>();
    }

    public void afficherAgence() {
        afficherClients();
        afficherVoitures();
        afficherContrats();
    }

    public Voiture getVoitureParIndice(int i) {
        return voitures.get(i);
    }
    
    public Client getClientParCin(int cin) {
        Client c = null;  
        for (Client i : clients)
            if (i.getCin() == cin)
              return i;
        return c;
    }

    public boolean ajouterClient(Client c) {
        for (var i : clients)
            if (i.getCin() == c.getCin())
                return false;

        return clients.add(c);
    }

    public boolean ajouterVoiture(Voiture v) {
        return voitures.contains(v)? false : voitures.add(v);
    }

    public boolean ajouterContrat(Contrat c) {
        return contrats.contains(c)? false : contrats.add(c);
    }

    public void afficherVoitures() {
        for (int i = 0; i < voitures.size(); i++) {
            System.out.println(String.format("--- VOITURE %d ---", i));
            System.out.println(voitures.get(i));
        }
    }

    public void afficherClients() {
        clients.forEach(c -> System.out.println(c));
    }

    public void afficherContrats() {
        contrats.forEach(c -> System.out.println(c));
    }
}
