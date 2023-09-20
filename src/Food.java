import java.util.ArrayList;
import java.util.List;

public class Food implements IFoodItem{
    private List<IFoodItem> foodItems=new ArrayList<IFoodItem>();
    private String foodName;
    private double discount;

//    @Override
//    public String toString() {
//        return "Food{" +
//                "foodItems=" + foodItems +
//                ", foodName='" + foodName + '\'' +
//                ", calories=" + calories() + "\n"+
//                "price=" +price()+packing()+
//                '}';
//    }

    public Food(List<IFoodItem> foodItems, String foodName, double discount) {
        super();
        this.foodItems = new ArrayList<IFoodItem>(foodItems);
        this.foodName = foodName;
        this.discount = discount;
    }

    public double discount(){
        return discount;
    }
    public List<IFoodItem> getFoodItems(){
        return foodItems;
    }

    @Override
    public String name() {
        return foodName;
    }

    @Override
    public int calories() {
        int generalCalories=foodItems.stream().mapToInt(foodItem-> foodItem.calories()).sum();
        return generalCalories;
    }

    @Override
    public IPacking packing() {
        double packingPrice=foodItems.stream().map(foodItem->foodItem.packing()).
                mapToDouble(packing->packing.packingPrice()).sum();
        return new GeneralPack(packingPrice);
    }

    @Override
    public double price() {
        double generalPrice=foodItems.stream().mapToDouble(foodItem->foodItem.price()).sum();
        return generalPrice;
    }
}
