package mainActivity.planet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Galaxie {
    String name;
    public List<Planet> planetList = new ArrayList<>();

    public Galaxie(String name, Planet... planetList){
        this.name = name;
        Collections.addAll(this.planetList, planetList);
    }
}
