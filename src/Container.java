public class Container implements IPacking{
    @Override
    public String pack() {
        return "Container";
    }

    @Override
    public double packingPrice() {
        return 3;
    }
}
