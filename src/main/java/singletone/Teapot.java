package singletone;

public class Teapot {

    private float volume;


    public Teapot(float volume) {
        this.volume = volume;
    }

    public String makeTea(){
        return  "The teapot with " + addWater(volume);
    }

    private String addWater(float volume) {
        WaterSpring waterSpring = WaterSpring.getInstance();
        System.out.println("Teapot - " + waterSpring);
        return waterSpring.getWater(volume);
    }
}
