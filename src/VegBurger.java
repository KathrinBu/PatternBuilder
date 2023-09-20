public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public int calories() {
        return 100;
    }

    @Override
    public double price() {
        return 5.5;
    }
}
