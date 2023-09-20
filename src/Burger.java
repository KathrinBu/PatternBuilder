public abstract class Burger implements IFoodItem {
    public IPacking packing(){
        return new Wrap();
    }
}
