public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public int calories() {
        return 300;
    }

    @Override
    public double price() {
        return 3.0;
    }
}
