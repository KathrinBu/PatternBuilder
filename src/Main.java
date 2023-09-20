public class Main {
    public static void main(String[] args){
        OrderBuilder orderBuilder1=new OrderBuilder();
        Order order1=orderBuilder1.setCustomerName("Mysj").setWay(Way.TAKE_AWAY).setItems(new VegBurger()).build();

        OrderBuilder orderBuilder2=new OrderBuilder();
        Order order2=orderBuilder2.setWay(Way.EAT_HERE).build();

        OrderBuilder orderBuilder3=new OrderBuilder();
        Order order3=orderBuilder3.setWay(Way.EAT_HERE).setItems(new ColdDrink(BeverageSize.M)).build();

        Printer.printBill(order1);

    }
}
