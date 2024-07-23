package start.cond;

public class If2 {
    public static void main(String[] args) {
        int age = 9, price = 12000, discount = 0;

        if (age <= 10){
            discount += 1000;
        }

        if (price >= 10000){
            discount += 1000;
        }

        System.out.println("총 할인 금액 = " + discount);
    }
}
