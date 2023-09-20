public class ColdDrink extends Drink{
    public ColdDrink(BeverageSize size) {
        super(size);
    }

    @Override
    public String name() {
        return "Cold drink";
    }

    @Override
    public int calories() {
        switch (size){
            case S:
                return 100;
            case M:
                return BeverageSize.M.getCalories();
            case L:
                return BeverageSize.L.getCalories();
        }
        return 0;
    }

    @Override
    public IPacking packing() {
        return null;
    }

    @Override
    public double price() {
        switch (size){
            case S:
                return 1.0;
            case M:
                return 1.5;
            case L:
                return 2.0;
        }
        return 0;
    }
}
