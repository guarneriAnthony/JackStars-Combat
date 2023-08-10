import java.io.PrintStream;

public class Main {

    static WarShip chasseur = new WarShip("chasseur", 2, 1, 156, 2F, false);
    static WarShip shipWorld = new WarShip("shipWorl", 10, 2, 4784, 30F, false);


    static Atmosphere uranusAtmosphere = new Atmosphere(83, 2.5F, 0, 15, 0, 0);
    static Planet uranus = new Planet("uranus", "Rock", 20000, uranusAtmosphere);
    static Planet mars = new Planet("mars", "Rock", 20000, uranusAtmosphere);

    public static void main(String[] args) {
        chasseur.enableShield();
        shipWorld.enableShield();
        chasseur.attack(shipWorld, "laser", 3);
        shipWorld.disableShied();
        System.out.println(shipWorld.armor +" armor");
        System.out.println(shipWorld.shieldLife +" shieldLife");
    }
}