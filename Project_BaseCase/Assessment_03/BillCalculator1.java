import java.util.Scanner;
import java.util.ArrayList;
//--------------------------
class Product{
    String name;
    double price;
    int quantity;
}
//-------------------------
public class BillCalculator1 {
    static ArrayList<Product> takeInput(Scanner sc, int n){
        ArrayList<Product> cart = new ArrayList<>();

        for(int i=0; i<n; i++){
            System.out.print("\nEnter Product "+(i+1)+" Name: ");
            Product P= new Product();
            P.name=sc.nextLine();

            System.out.print("Enter Price: ");
            P.price=sc.nextDouble();
            sc.nextLine();
            if(P.price<=0){
                System.out.print("Invalid price! Try again.");
                i--;
                continue;
            }

            System.out.print("Enter Quantity: ");
            P.quantity=sc.nextInt();
            sc.nextLine();
            if(P.quantity<=0){
                System.out.println("Invalid Quantity! Try again.");
                i--;
                continue;
            }
            //System.out.print("\n");
            cart.add(P);
        }
        return cart;
    }
    public static double calculateSubtotal(ArrayList<Product>cart){
        double subtotal=0;
        for(Product P: cart){
            subtotal+=P.price*P.quantity;
        }
        return subtotal;
    }

    public static double calculateDiscount(double subtotal){
        if(subtotal>100) return 0.2*subtotal;
        else if(subtotal>50) return 0.1*subtotal;
        else return 0.05*subtotal;
    }

    static void printReceipt(ArrayList<Product>cart, double subtotal, double discount, double deliveryFee){
            System.out.println("\n*****");
            System.out.println("\n--- Final Receipt ---\n");
            for(int i=0; i<cart.size(); i++){
                Product P = cart.get(i);
                System.out.println("Item "+(i+1)+": "+ P.name + " - " + P.quantity+ 
                " x " + P.price +" = " + (P.quantity*P.price));
            }
            System.out.print("\n");
            System.out.println("Subtotal: " + subtotal);
            System.out.println("Discount Applied:" + discount);
            System.out.println("Delivery Fee: "+ deliveryFee);
            System.out.println("\nFinnal Total: "+ (int)(subtotal-discount+deliveryFee));
            System.out.println("\n--------------------------");


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("--- Welcome to BaseCase Shop ---");
        System.out.print("\nHow many items do you want to purchase? ");
        int n = sc.nextInt();
        sc.nextLine();

        if(n>5){
            System.out.println("Maximum 5 items allowed. Setting Item to 5.");
            n=5;
        }

    ArrayList<Product> cart =takeInput(sc, n);
    double subtotal= calculateSubtotal(cart);
    double discount= calculateDiscount(subtotal);
    double deliveryFee= (subtotal<50)? 10:0;
    printReceipt(cart,subtotal,discount,deliveryFee);
    }
}
