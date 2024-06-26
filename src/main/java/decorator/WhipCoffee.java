package decorator;

public class WhipCoffee implements Coffee {

    private final Coffee coffee;

    public WhipCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return this.coffee.getCost()+3;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription()+" with whip";
    }
}
