public class Nuggets implements IFoodItem{
    @Override
    public String name() {
        return "Nuggets";
    }

    @Override
    public int calories() {
        return 250;
    }

    @Override
    public IPacking packing() {
        return new Container();
    }

    @Override
    public double price() {
        return 400;
    }
}
