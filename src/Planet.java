abstract class Planet {
    String name;
    static int nbrPlanetsFind = 0;
    static int totalVisiter = 0;
    long diametre;
    Atmosphere atmosphere;


    Planet(String name, long diametre, Atmosphere atmosphere) {
        this.name = name;
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

}


