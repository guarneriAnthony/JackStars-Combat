abstract public class Ship {
    String type;
    int nbrPassagers;
    int spaceForDock;
    float armor;
    boolean shieldActived = false;
    float shieldLife;

    Ship(String type, int nbrPassagers, int spaceForDock, int armor, float shieldLife, boolean shieldActived) {
        this.type = type;
        this.nbrPassagers = nbrPassagers;
        this.spaceForDock = spaceForDock;
        this.armor = armor;
        this.shieldLife = shieldLife;
        this.shieldActived = shieldActived;
    }

    void enableShield() {
        System.out.println("Shield Activé du ship de type : " + type);
        shieldActived = true;
    }

    void disableShied() {
        System.out.println("Shield Desactive du ship de type : " + type);
        shieldActived = false;
    }
}
