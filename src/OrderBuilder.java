import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderBuilder {
    protected static final double discount=2.75;
    List<IFoodItem> items=new ArrayList<IFoodItem>();
    String customerName;
    Way way;

    public OrderBuilder setItems(IFoodItem item) {
        items.add(item);
        return this;
    }

    public OrderBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder setWay(Way way) {
        this.way = way;
        return this;
    }

    public OrderBuilder(){
        super();
    }
    //скидочные наборы
    public OrderBuilder vegDiscount(){
        List<IFoodItem> foodItems=new ArrayList<>();
        foodItems.add(new VegBurger());
        foodItems.add(new ColdDrink(BeverageSize.L));
        Food food=new Food(foodItems,"Veg food set",discount);
        return setItems(food);
    }
    public OrderBuilder chickenBurgerDiscount(){
        List<IFoodItem> foodItems=new ArrayList<>();
        foodItems.add(new ChickenBurger());
        foodItems.add(new HotDrink(BeverageSize.S));
        Food food=new Food(foodItems,"Chiken Hot food set",discount);
        return setItems(food);
    }
    public Order build(){
        Order order = new Order(items,customerName,way);
        return order;
    }
}
