import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private List<IFoodItem> foodItems=new ArrayList<IFoodItem>();
    private String customerName;
    private Way way;

    public List<IFoodItem> getFoodItems() {
        return foodItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Way getWay() {
        return way;
    }
//    @Override
//    public String toString() {
//        return "Order{" +
//                "foodItems=" + foodItems +
//                ", customerName='" + customerName + '\'' +
//                ", way=" + way +
//                '}';
//    }

//    public Order(OrderBuilder builder){
//        this.customerName=builder.customerName;
//        this.way=builder.way;
//        this.foodItems=builder.items;
//    }

    public Order(List<IFoodItem> foodItems, String customerName, Way way) {
        super();
        this.foodItems = new ArrayList<IFoodItem>(foodItems);
        this.way = way;
        this.customerName = customerName;
        if (this.customerName==null){
            this.customerName="no_name";
        }
    }
}
