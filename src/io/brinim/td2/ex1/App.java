package io.brinim.td2.ex1;

import java.time.LocalDate;

public class App {
    static Agence ag = new Agence();

    public static void main(String[] args) {
        // TODO: Explore java reflectors
        Menu.ajouterCommande("Afficher", () -> ag.afficherAgence());

        Menu.ajouterCommande("Ajouter", () -> {
            String option = Menu.question("Ajouter?", "Voiture/Client/Contrat");
            
            switch (option.toLowerCase()) {
              case "voiture":
                Voiture v = new Voiture();
                v.setMarque(Menu.question("marque"));
                v.setCategorie(Menu.question("categorie"));
                v.setPuissance(Integer.parseInt(Menu.question("puissance")));
               
                ag.ajouterVoiture(v);
                break;
              case "client":
                Client c = new Client();
                c.setNom(Menu.question("nom"));
                c.setNumeroPermis(Menu.question("n permis"));
                c.setAdresse(Menu.question("adresse"));
                
                c.setCin(Integer.parseInt(Menu.question("cin"))); 
                c.setNumeroTelephone(Integer.parseInt(Menu.question("n telephone")));
                 
                ag.ajouterClient(c);
                break;
              case "contrat":
                ag.afficherClients();
                ag.afficherVoitures();
                
                boolean exist = Menu.prompt("Client existe? (Oui/Non): ").toLowerCase().equals("oui") ? true : false; 

                if (exist) {
                  int cin = Integer.parseInt(Menu.question("CIN Client"));
                  int i = Integer.parseInt(Menu.question("Indice voiture a louer"));
                  if (ag.getVoitureParIndice(i).getEstDisponible()) {
                    Contrat contrat = new Contrat();
                    contrat.setDateLocation(LocalDate.parse(Menu.question("date debut location", "YYYY-MM-JJ")));
                    contrat.setDateFinLocation(LocalDate.parse(Menu.question("date fin location", "YYYY-MM-JJ")));
                    contrat.setClient(ag.getClientParCin(cin));
                    ag.ajouterContrat(contrat);
                  } else {
                    System.out.println("Voiture indisponible.");
                  }
                } else {
                  System.out.println("Client inexistant");
                }

                break;
              default:
                System.out.println("Parametre inconnu, veuillez ressayer.");
            }
        });

        // Menu.loop(); // Runs a blocking menu
        Menu.loopAsync(); // Runs a non blocking menu

        /* Starting web app? or other logic in here... */
    }
}
