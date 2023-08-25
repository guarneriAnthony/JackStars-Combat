package mainActivity.ship;

public class WarShip extends Ship {

    boolean weapon = false;
    public WarShip(TypeShip ship) {
        super(ship);
    }

    void attack(Ship target, String weaponName, int duration) {
        System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + target.type + " en utilisant l'arme " + weaponName + " pendant " + duration + " minutes.");
        target.armor *= 0.5F;
        target.shieldLife = 0;
    }

    void switchStatusWeapon() {
        weapon = !weapon;
        if (weapon) {
            disableShied();
        }
    }

    @Override
    void enableShield() {
        super.enableShield();
        weapon = false;
    }

}
