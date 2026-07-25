import java.util.*;
class Order{
    protected String orderID;
    protected double totalAmount;
    protected String orderDate;


public Order(String orderId, double totalAmount){
    this.orderID = orderId;
    this.totalAmount = totalAmount;
    this.orderDate = new Date().toString();
    System.out.println("Order create: " + orderId );
}

public double calculateDiscount(){
    return totalAmount * 0.05;
}

public void displayOrder(){
    System.out.println("Order ID: " + orderID);
    System.out.println("Amount: " + totalAmount);
    System.out.println("Date: " + orderDate);
    
}
}
class PremiumOrder extends Order {
    private String membershipTier;
    private double cashback;

    public PremiumOrder(String orderId, double totalAmount, String membershipTier) {
        super(orderId, totalAmount);
        this.membershipTier = membershipTier;
        this.cashback = totalAmount * 0.20; // 10% cashback for premium members

        System.out.println("Cashback" + cashback + "----");
        System.out.println("MembershipTier:" + membershipTier + " ");
    
}
public double calculateDiscount() {
        double baseDiscount = super.calculateDiscount();
        double premiumDiscount = totalAmount * 0.10; // Additional 10% discount for premium members
        double finalDiscount = baseDiscount + premiumDiscount;
        System.out.println("premium discount applied: " + finalDiscount);
        return finalDiscount;

}
@Override
    public void displayOrder() {
        super.displayOrder();
        System.out.println("Membership Tier: " + membershipTier);
        System.out.println("Cashback: " + cashback);
    }

}
  // Usage:
public class EcommerceApp{
    public static void main(String[] arge){
        PremiumOrder order =new PremiumOrder("ORD123", 1000.0, "Gold");
        order.displayOrder();
        order.calculateDiscount();
        
    }
}