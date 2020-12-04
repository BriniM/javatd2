package io.brinim.td2.ex1;

import java.util.Scanner;
import java.util.HashMap;

final class Menu {
    private static Scanner sc = new Scanner(System.in);
    private static HashMap<String, Runnable> commandes = new HashMap<>();

    public static String question(String cle) {
        System.out.print(String.format("Donner %s: ", cle));
        return sc.nextLine();
    }

    public static String question(String cle, String description) {
        System.out.print(String.format("Donner %s (%s): ", cle, description));
        return sc.nextLine();
    }

    public static String prompt(String req) {
        System.out.print(String.format("%s", req));
        return sc.nextLine();
    }

    public static void ajouterCommande(String commande, Runnable methode) {
        commandes.put(commande, methode);
    }

    public static void loop() {
        for(;;) {
            System.out.print(String.format("Choisir commande %s:", commandes.keySet()));
            String input = sc.nextLine();

            commandes.forEach((cmd, meth) -> {
                if (cmd.toLowerCase().equals(input.toLowerCase()))
                        meth.run();
            });
        }
    }

    public static void loopAsync() {
        new Thread(() -> loop()).start();
    }
}
