public class orderShipping {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;

    public orderShipping(boolean filled, double cost, String shippingMethod, String coupon){
        if (cost>24.00){
            System.out.println("High value item");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
        couponCode = coupon;
    }

    public double calculatedShipping(){
        if (shipping.equals("Regular")){
            return 0;
        } else if(shipping.equals("Express")) {
            if (couponCode == "ship50") {
                return 0.85;
            } else {
                return 1.75;
            }
        }else{
            return 0.5;
        }
    }

    public void ship(){
        if (isFilled==true){
            System.out.println("Shipping");
            System.out.println("Shipping cost = "+calculatedShipping());
        } else{
            System.out.println("Order not ready");
        }
    }

    public static void main(String[] args){
        orderShipping book = new orderShipping(true,9.99,"Express","ship50");
        orderShipping chemistrySet = new orderShipping(false, 72.50, "Regular", "freeShipping");
        book.ship();
        chemistrySet.ship();
    }

}
