package mainActivity.ship;

abstract public class Ship {
    public String type;
    public int nbrPassagers;
    int dockMax = 0;
    int dockActualy;
    public int spaceForDock;
    float armor;
    boolean shieldActived = false;
    float shieldLife;

    Ship(TypeShip ship) {
        this.type = ship.type;
        this.nbrPassagers = ship.nbrPassagers;
        this.armor = ship.armor;
        this.shieldLife = ship.shieldLife;
        this.shieldActived = ship.shieldActived;
        this.spaceForDock = ship.spaceForDock;

        switch (type) {
            case "croiser":
                if (nbrPassagers > 50) {
                    dockMax = 100;
                } else if (nbrPassagers >= 12) {
                    dockMax = nbrPassagers * 2;
                }
                break;
            case "fregate":
                if (nbrPassagers > 25) {
                    dockMax = 50;
                } else if (nbrPassagers >= 12) {
                    dockMax = nbrPassagers * 2;
                }
                break;
            case "cargo":
                dockMax = 500;
                break;
            case "vaisseau-monde":
                dockMax = 2000;
                break;
        }
    }

    void enableShield() {
        System.out.println("Shield Activé du ship de type : " + type);
        shieldActived = true;
    }

    void disableShied() {
        System.out.println("Shield Desactive du ship de type : " + type);
        shieldActived = false;
    }

    public void load(int spaceLoad) {
          int spaceAvalidable = dockMax - dockActualy;
          if ( spaceLoad <= spaceAvalidable){
              dockActualy += spaceLoad;
          }
        System.out.println("Refuse Quantutu : " +Math.max(0,spaceLoad - spaceAvalidable));
    }
}
