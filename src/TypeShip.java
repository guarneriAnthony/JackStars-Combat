public enum TypeShip {
    CHASSEUR("chasseur", 1, 1, 1, false, 1),
    FREGATE("fregate", 1, 1, 1, false, 1),
    CROISEUR("croiseur", 1, 1, 1, false, 1),
    CARGO("cargo", 1, 1, 1, false, 1),
    SHIPWORLD("shipWorld", 1, 1, 1, false, 2);

    final String type;
    final int nbrPassagers;
    final  int armor;
    final  float shieldLife;
    final boolean shieldActived;
    final  int spaceForDock;

    TypeShip(String type, int nbrPassagers, int armor, float shieldLife, boolean shieldActived, int spaceForDock) {
        this.type = type;
        this.nbrPassagers = nbrPassagers;
        this.armor = armor;
        this.shieldLife = shieldLife;
        this.shieldActived = shieldActived;
        this.spaceForDock = spaceForDock;
    }
}
