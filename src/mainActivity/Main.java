package mainActivity;

import mainActivity.planet.Atmosphere;
import mainActivity.planet.Galaxie;
import mainActivity.planet.PlanetteGazeuse;
import mainActivity.planet.PlanetteTellurique;
import mainActivity.ship.CivilShip;
import mainActivity.ship.TypeShip;
import mainActivity.ship.WarShip;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static WarShip chasseur = new WarShip(TypeShip.CHASSEUR);
    static CivilShip shipWorld = new CivilShip(TypeShip.SHIPWORLD);
    static WarShip fregate = new WarShip(TypeShip.FREGATE);
    static WarShip croiseur = new WarShip(TypeShip.CROISEUR);
    static WarShip cargo = new WarShip(TypeShip.CARGO);


    static Atmosphere uranusAtmosphere = new Atmosphere(83, 2.5F, 0, 15, 0, 0);
    static Atmosphere terreAtmosphere = new Atmosphere(83, 2.5F, 0, 15, 0, 0);
    static PlanetteTellurique uranus = new PlanetteTellurique("uranus", "Rock", 20000, uranusAtmosphere, 10, 2877.38F);
    static PlanetteGazeuse mars = new PlanetteGazeuse("mars", "Gaz", 20000, uranusAtmosphere, 227.9F);
    static PlanetteTellurique terre = new PlanetteTellurique("terre", "Rock", 25000, terreAtmosphere, 4, 149.6F);


    static Galaxie Solaire = new Galaxie("Systeme Solaire", terre, mars);

    public static void main(String[] args) {
        Solaire.planetList.iterator(distance);
            System.out.println(Solaire.planetList.contains());



//        System.out.println("Quelle ship voulez vous ?" );
//        String choiseShip = scanner.nextLine();
//        WarShip warChoice = null;
//        CivilShip civilChoice = null;
//        switch (choiseShip){
//            case "chasseur" -> warChoice = new WarShip(TypeShip.CHASSEUR);
//            case "fregate" -> warChoice = fregate;
//            case "croiseur" -> warChoice = croiseur;
//            case "cargo" -> warChoice = cargo;
//            case "shipWorld" -> civilChoice = shipWorld;
//        }
//
//
//        System.out.println("Sur quelle planette ? \nUranus \nTerre" );
//        String choicePlanette = scanner.nextLine();
//
//        PlanetteTellurique telluriqueChoice = null;
//        switch (choicePlanette){
//            case "uranus" -> telluriqueChoice = uranus;
//            case "terre" -> telluriqueChoice = terre;
//        }
//
//        System.out.println("Quelle tonnage ?" );
//        int choiceTonnage = scanner.nextInt();
//
//       if (telluriqueChoice != null && warChoice != null){
//           telluriqueChoice.accueillirVaisseaux(warChoice);
//           warChoice.load(choiceTonnage);
//       } else if (telluriqueChoice != null && civilChoice != null) {
//           telluriqueChoice.accueillirVaisseaux(civilChoice);
//           civilChoice.load(choiceTonnage);
//       }
//        telluriqueChoice.accueillirVaisseaux(warChoice);
//
//
//
//
//
    }
}