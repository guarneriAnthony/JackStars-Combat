public class PlanetteGazeuse extends Planet {
    String matter;

    PlanetteGazeuse(String name, String matter, long diametre, Atmosphere atmosphere) {
        super(name, diametre, atmosphere);
        this.matter = matter;
    }
}
