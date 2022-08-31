package singletone;

public class SingletonApp {


    public static void main(String[] args) {

        System.out.println("************************");

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);

        System.out.println("************************");

        WaterSpring waterSpring = new WaterSpring();
        float water = 2.5f;
        System.out.println(waterSpring.getWater(water));
        water = 1.5f;
        System.out.println(waterSpring.getWater(water));

        System.out.println("************************");

        float waterForTeapot = 3.7f;
        Teapot teapot = new Teapot(waterForTeapot);
        System.out.println(teapot.makeTea());

        System.out.println("************************");

        Multiton multiton = Multiton.getInstance("1");
        System.out.println(multiton);
        Multiton multiton2 = Multiton.getInstance("2");
        System.out.println(multiton2);
        Multiton multiton3 = Multiton.getInstance("3");
        System.out.println(multiton3);

        System.out.println("************************");

        LimitedMultiton limitedMultiton = LimitedMultiton.getInstance(LimitedMultiton.Count.ONE);
        System.out.println(limitedMultiton);
        LimitedMultiton limitedMultiton2 = LimitedMultiton.getInstance(LimitedMultiton.Count.TWO);
        System.out.println(limitedMultiton2);
        LimitedMultiton limitedMultiton3 = LimitedMultiton.getInstance(LimitedMultiton.Count.THREE);
        System.out.println(limitedMultiton3);

    }
}
