package decorator;

public class VanillaCoffee implements Coffee {
    private final Coffee coffee;

    public VanillaCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return this.coffee.getCost()+5;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription()+" with whip";
    }
}
