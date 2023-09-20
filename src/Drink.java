public abstract class Drink implements IFoodItem {
    protected BeverageSize size;

    public BeverageSize getSize() {
        return size;
    }

    public Drink(BeverageSize size){
        this.size=size;
    }
}
