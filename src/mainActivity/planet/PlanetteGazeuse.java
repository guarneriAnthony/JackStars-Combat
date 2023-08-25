package mainActivity.planet;

public class PlanetteGazeuse extends Planet {
 String matter;
    public PlanetteGazeuse(String name, String matter, long diametre, Atmosphere atmosphere, Float distance) {
        super(name, diametre, atmosphere, distance);
        this.matter = matter;
    }
}
