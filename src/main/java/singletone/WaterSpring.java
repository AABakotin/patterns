package singletone;

public class WaterSpring {

    private static WaterSpring instance;
    private static final String kingOfWater = " liter of fresh water";

    public static WaterSpring getInstance() {
        if (instance == null){
            instance = new WaterSpring();
        }
        return instance;
    }

    public String getWater (float liter){
        return (liter + kingOfWater);
    }


}
