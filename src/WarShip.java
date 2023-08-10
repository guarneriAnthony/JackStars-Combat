public class WarShip extends Ship{


    WarShip(String type, int nbrPassagers, int spaceForDock, int armor, float shieldLife, boolean shieldActived) {
        super(type, nbrPassagers, spaceForDock, armor, shieldLife, shieldActived);
    }

    void attack(Ship target, String weaponName, int duration){
        System.out.println("Un vaisseau de type " +type +" attaque un vaisseau de type " +target.type +" en utilisant l'arme " +weaponName +" pendant " +duration +" minutes.");
        target.armor *= 0.5F;
        target.shieldLife = 0;
    }
}
