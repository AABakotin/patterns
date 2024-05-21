package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getCost());
        System.out.println(simpleCoffee.getDescription());

        Coffee milkCoffee = new MilkCoffee(simpleCoffee);
        System.out.println(milkCoffee.getCost());
        System.out.println(milkCoffee.getDescription());


        Coffee vanilaCoffee = new VanillaCoffee(milkCoffee);
        System.out.println(vanilaCoffee.getCost());
        System.out.println(vanilaCoffee.getDescription());

        Coffee whipCoffee = new WhipCoffee(vanilaCoffee);
        System.out.println(whipCoffee.getCost());
        System.out.println(whipCoffee.getDescription());
    }


}
