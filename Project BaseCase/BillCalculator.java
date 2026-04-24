import java.util.Scanner;
public class BillCalculator{
   static final double DISCOUNT = 0.15;

   public static void shopName(){
      System.out.println("--- Welcome to the Mehedi's shop ---\n");
   }
   public static void pdInfo(Scanner in){
      System.out.print("Enter Prduct Name: ");
      String pdName = in.nextLine();

      System.out.print("\n");

      System.out.print("Enter Unit Price: ");
      double pdPrice = in.nextDouble();

      System.out.print("\n");

      System.out.print("Enter Quantity: ");
      int pdQuan = in.nextInt();

      System.out.print("\n");

      calculation(pdName,pdPrice, pdQuan);
   }
   public static void calculation(String pdName, double pdPrice, int pdQuan){
      double subTotal= pdPrice*pdQuan;
      double disPrice= subTotal* DISCOUNT;
      double total= subTotal- disPrice;
      displPart(pdName,subTotal, disPrice, total);
   }
   public static void displPart(String pdName,double subTotal, double disPrice, double total){
      System.out.println("--- Final Receipt ---\n");
      System.out.println("Item: " + pdName + "\n");
      System.out.println("Subtoal: " + subTotal + "\n");
      System.out.println("Discount Applied: $" + disPrice +"\n");
      System.out.println("Total (Rounded Down): $" + (int)Math.floor(total) +"\n");
   }
   public static void main(String [] args){
      Scanner in = new Scanner(System.in);
      shopName();
      pdInfo(in);
      
   }
}
