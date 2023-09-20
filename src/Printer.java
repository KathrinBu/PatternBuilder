import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.DoubleAdder;

public class Printer {
    static DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void printBill(Order order){
        Way way=order.getWay();
        System.out.println(way);
        System.out.println("==============" + "\n" + dtf.format(LocalDateTime.now())
                           + "\n" + "------------------");
        DoubleAdder itemTotalPrice=new DoubleAdder();
        order.getFoodItems().stream().forEach(item->{
            String name= item.name();
            int calories= item.calories();
            IPacking packing= item.packing();
            double price=item.price();
            double packingPrice=packing.packingPrice();
            double discount=item instanceof Food? ((Food)item).discount() : 0.0;
            double sum=calculateSum(price,packingPrice,discount);
            itemTotalPrice.add(sum);
            System.out.println(order.getCustomerName() + ", заказ готов))");
        });
        System.out.println("ИТОГО: " + itemTotalPrice.doubleValue()*way.getTax() + " руб.");
    }
    private static double calculateSum(double bill, double packingPrice, double discount){
     bill=bill+packingPrice-discount;
     return bill;
    }

}
