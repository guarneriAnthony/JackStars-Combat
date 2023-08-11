public class Atmosphere {
    float hydrogene;
    float methane;
    float azote;
    float helium;
    float argon;
    float sodium;

    Atmosphere(float hydrogene, float methane, float azote, float helium, float argon, float sodium) {
        this.hydrogene = hydrogene;
        this.methane = methane;
        this.azote = azote;
        this.helium = helium;
        this.argon = argon;
        this.sodium = sodium;
    }

    boolean printComposition() {
        System.out.println("A " + this.hydrogene + " % hydrogene");
        System.out.println("A " + this.helium + " % helium");
        System.out.println("A " + this.methane + " % methane");
        return true;
    }
}
