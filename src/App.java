public class App {
    public static void main(String[] args) throws Exception {
        Slice_o_Heaven slice_o_heaven1 = new Slice_o_Heaven("1234","mashroom",13.2);
        Slice_o_Heaven slice_o_heaven2 = new Slice_o_Heaven();
        slice_o_heaven1.otakeorder();
        slice_o_heaven1.makePizza();
        System.out.println("*********************************************");
        slice_o_heaven1.setorderTotle(13.6);
        System.out.println("The new ordertotle is "+slice_o_heaven1.getOrderTotle());
        System.out.println("*********************************************");
        slice_o_heaven1.setdrinks(null);
        slice_o_heaven1.setPizzaPrice(13.6);
        slice_o_heaven1.setsides("bread");
        slice_o_heaven1.makePizza();
        System.out.println("***********************************************");
        slice_o_heaven2.otakeorder();
        slice_o_heaven2.makePizza();


    
    
    }


}
