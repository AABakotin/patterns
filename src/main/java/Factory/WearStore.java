package Factory;

public class WearStore implements Store{
    @Override
    public void saleGood() {
        System.out.println("Awesome wear");
    }
}
