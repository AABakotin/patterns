package Builder;

public class BuilderApp {
    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new LightIndustrialUnitBuilder());
        IndustrialUnit industrialUnitLight = director.buildIndustrialUnit();
        System.out.println(industrialUnitLight);


        director.setBuilder(new HeavyIndustrialUnitBuilder());
        IndustrialUnit industrialUnitHeavy = director.buildIndustrialUnit();
        System.out.println(industrialUnitHeavy);


    }
}
