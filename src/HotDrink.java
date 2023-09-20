public class HotDrink extends Drink{
    public HotDrink(BeverageSize size) {
        super(size);
    }

    @Override
    public String name() {
        return "Hot drink";
    }

    @Override
    public int calories() {
        switch (size) {
            case S:
                return 370;
            case M:
                return 450;
            case L:
                return 560;
        }
        return 0;
    }

    @Override
    public IPacking packing() {
        return new Mug();
    }

    @Override
    public double price() {
        switch (size) {
            case S:
                return 2.0;
            case M:
                return 2.5;
            case L:
                return 3.0;
        }
        return 0;
    }
}
