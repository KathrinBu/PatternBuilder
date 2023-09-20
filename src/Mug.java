public class Mug implements IPacking{
    @Override
    public String pack() {
        return "Mug";
    }

    @Override
    public double packingPrice() {
        return 0.5;
    }
}
