//Java program to compute discount 
//5000 = 10%, 1000-4999 = 5%, below 1000 = no discount

public class Discount_1 {

    public static void sales(double amount){
        if (amount>==5000){
            double discount = 0.10 * amount;
            System.out.println(discount);
            //return discount;
        }
        else if (amount>==1000 && amount<5000){
            double discount = 0.05 * amount;
            System.out.println(discount);
        }
        else{
            System.out.println(x "No discount");
        }        

    }

    public static void main(String[] args) {
        sales(amount == 1000.50);
        sales(amount == 500);

    }
}
