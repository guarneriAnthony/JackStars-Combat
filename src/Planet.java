public class Planet {
    String name;
    String matter;
    static int nbrPlanetsFind = 0;
    long diametre;
    int totalVisiter = 0;
    int totalSpaceShip = 1;
    int usedSpaceShip = 0;
    Atmosphere atmosphere;
    Ship dockedShip;

    Planet(String name, String matter, long diametre, Atmosphere atmosphere) {
        this.name = name;
        this.matter = matter;
        this.diametre = diametre;
        this.atmosphere = atmosphere;
        nbrPlanetsFind++;
    }

    void revolution() {
        System.out.println("Je suis le planete " + this.name + " et je tourne autour de mon étoile.");
    }

    void rotation() {
        System.out.println("Je suis la planete " + this.name + " et je tourne sur moi-meme.");
    }


    void departVaisseaux() {
        usedSpaceShip -= dockedShip.spaceForDock;
    }

    boolean accueillirVaisseaux(Ship ship) {
        if (dockedShip != null) {
            departVaisseaux();
            System.out.println("Le ship " + dockedShip.type + " part.");
        }
        if (usedSpaceShip < totalSpaceShip) {
            usedSpaceShip += ship.spaceForDock;
            dockedShip = ship;
            totalVisiter += ship.nbrPassagers;
            System.out.println("Le ship " + ship.type + " arrive.");
        }
        return false;
    }


}


