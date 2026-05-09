import java.util.ArrayList;
import java.util.Scanner;
class Order{
    String name;
    double price;
    int quantity;

    Order(String name, double price, int quantity){
        if(price<=0){
            throw new IllegalArgumentException("Error: Unit Price must be greater then zero. Skipping this Item");
        }
        if(quantity<=0){
            throw new IllegalArgumentException("Error: Quantity must be greater then zero. Skipping this Item.");
        }
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
}
public class BillCalculator2 {
    static ArrayList<Order> takeInput(Scanner sc, int n){
        ArrayList<Order> cart=new ArrayList<>();

        for(int i=0; i<n; i++){
            System.out.print("Enter Product "+(i+1)+" Name: ");
            String name=sc.nextLine();

            System.out.print("Enter Price: ");
            double price=sc.nextDouble();
            

            System.out.print("Enter Qantity: ");
            int quantity=sc.nextInt();
            sc.nextLine();
        try{
            Order o =new Order(name, price, quantity);
            cart.add(o);
        }catch(Exception a){
            System.err.println(a.getMessage());
        }
    }
        return cart;   
    }

    public static double calculateSubTotal(ArrayList<Order> cart){
        double subTotal=0;
        for(Order o: cart){
            subTotal+=o.price*o.quantity;
        }
        return subTotal;
    }

    public static double calculateDiscount(double subTotal){
        if(subTotal>100) return subTotal*0.2;
        else if(subTotal>50) return subTotal*0.1;
        else return subTotal*0.05;
    }

    public static double showPercentage(double subTotal){
        if(subTotal>100) return 20;
        else if(subTotal>50) return 10;
        else return 5;
    }

    public static void printReceipt(ArrayList<Order> cart,double subTotal, double discountAmount, double deliveryFee, double finalTotal, double showDissPercentage){
        System.out.println("--- Final Receipt ---");
        int i=1;
        for(Order o: cart){
            System.out.println("Item "+i+": "+o.name+" - "+ o.quantity+ " pcs x "+ o.price+ " = "+ (o.price*o.quantity));
            i++;
        }
        System.out.println("Subtotal: "+subTotal);
        System.out.println("Discount Applied "+"("+showDissPercentage+"): "+ discountAmount);
        System.out.println("Delivery Fee: "+ deliveryFee);
        System.out.println("Final Total: "+finalTotal);
        System.out.println("--------------------------");
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("--- Welcome to BaseCase Shop ---");
        System.out.print("How many items do you want to purchase? ");
        int n=sc.nextInt();
        sc.nextLine();
        if(n>5){
            System.out.println("Error: You Entered More then 5! Now Item Set to 5");
            n=5;
        }

        ArrayList<Order> cart= takeInput(sc, n);
        double subTotal = calculateSubTotal(cart);
        double discountAmount= calculateDiscount(subTotal);
        double showDissPercentage= showPercentage(subTotal);
        double deliveryFee= (subTotal<50)? 10:0;
        double finalTotal= subTotal - discountAmount +deliveryFee;
        printReceipt(cart,subTotal, discountAmount, deliveryFee,finalTotal,showDissPercentage);
    }
}
