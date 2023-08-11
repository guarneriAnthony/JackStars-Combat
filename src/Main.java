import java.io.PrintStream;

public class Main {

    static WarShip chasseur = new WarShip("chasseur", 2, 1, 156, 2F, false);
    static CivilShip shipWorld = new CivilShip("shipWorl", 10, 2, 4784, 30F, false);


    static Atmosphere uranusAtmosphere = new Atmosphere(83, 2.5F, 0, 15, 0, 0);
    static PlanetteTellurique uranus = new PlanetteTellurique("uranus", "Rock", 20000, uranusAtmosphere);
    static PlanetteGazeuse mars = new PlanetteGazeuse("mars", "Gaz", 20000, uranusAtmosphere);

    public static void main(String[] args) {
        chasseur.enableShield();
        shipWorld.enableShield();
        chasseur.attack(shipWorld, "laser", 3);
        shipWorld.disableShied();
        System.out.println(shipWorld.armor + " armor");
        System.out.println(shipWorld.shieldLife + " shieldLife");
        System.out.println("_____________________________________");
        uranus.accueillirVaisseaux(chasseur);
        System.out.println(uranus.totalVisiter + "total visiteurs");
        System.out.println(uranus.usedSpaceShip + "total usedSpaceShip");
        System.out.println(uranus.matter);
        uranus.departVaisseaux();
        uranus.accueillirVaisseaux(chasseur);
        uranus.accueillirVaisseaux(shipWorld);

    }
}