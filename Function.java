package assignment;

public class Function {
    public static int calculateRidersPayment(int succesfulDeliveries) {
        int basePay = 5000;
        int collectionRate;
        if(succesfulDeliveries < 50){
            collectionRate = 160;
        } else if (succesfulDeliveries < 60) {
            collectionRate = 200;
        } else if (succesfulDeliveries < 70) {
            collectionRate = 250;
        }else{
            collectionRate = 500;
        }
        int totalPayment = (succesfulDeliveries * collectionRate) + basePay;
        return totalPayment;
    }

    public static void main(String[] args) {
         int payment = calculateRidersPayment(70);
         System.out.println("The rider's Payment is " + payment);
    }
}
