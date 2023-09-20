public class Wrap implements IPacking{
    @Override
    public String pack() {
        return "Wrap";
    }

    @Override
    public double packingPrice() {
        return 0.5;
    }
}
