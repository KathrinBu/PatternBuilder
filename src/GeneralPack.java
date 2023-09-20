public class GeneralPack implements IPacking{
    private double packingPrice;

    public GeneralPack(double packingPrice) {
        super();
        this.packingPrice = packingPrice;
    }

    @Override
    public String pack() {
        return "общая упаковка";
    }

    @Override
    public double packingPrice() {
        return packingPrice;
    }
}
