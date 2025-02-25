public class Slice_o_Heaven {
    public String ostoreName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;

    private String pizzaIngredients;
    private double pizzaPrice;
    private String sides;
    private String drinks;
    private String orderID;
    private double orderTotle;
    private final String DEF_ORDER_ID = "DEF-SOH-099";
    private final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    private final double DEF_ORDER_TOTAL = 15.00;

    public Slice_o_Heaven(){
        orderID = DEF_ORDER_ID;
        pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        orderTotle = DEF_ORDER_TOTAL;
        sides = "mashroom";
        drinks = "cola";
  
    }
    public Slice_o_Heaven(String orderID,String pizzaIngredients,double orderTotle){
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotle = orderTotle;
    }
    
    
    public void otakeorder(){
        
        System.out.println("Order is accepted");
        System.out.println("Order is being prepared");


        
    }

    public void makePizza(){
        

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("for pickup");
        }

        System.out.println("ready");
        printReceipt();

    }

    private void printReceipt(){
        System.out.println("*************Receipt*****************");
        System.out.println("ID "+getOrderID());
        System.out.println("size "+getsides());
        System.out.println("Pizzalngredients "+getingredients());
        System.out.println("pizzaprice "+getPizzaPrice());
        System.out.println("drinks "+getdrinks());
        System.out.println("Totle "+getOrderTotle());



    }

    public String getOrderID(){
        return orderID;
    }

    public String getingredients(){
        return pizzaIngredients;
    }

    public double getOrderTotle(){
        return orderTotle;
    }

    public void setPizzaPrice(double Price){
        pizzaPrice=Price;
    }

    public double getPizzaPrice(){
        return pizzaPrice;
    }

    public void setsides(String si){
        sides=si;
    }

    public String getsides(){
        return sides;
    }

    public void setdrinks(String dr){
        drinks=dr;
    }

    public String getdrinks(){
        return drinks;
    }

    public void setorderID(String id){
        orderID = id;
    }

    public void setIng(String Ing){
        pizzaIngredients=Ing;
    }

    public void setorderTotle(double orderTo){
        orderTotle = orderTo;
    }

}
