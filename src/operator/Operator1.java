package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5, b = 2;

        int sum = a + b;
        System.out.println("a + b =  " + sum);

        int diff = a - b;
        System.out.println("a - b =  " + diff);

        int multi = a * b;
        System.out.println("a * b =  " + multi);

        int div = a / b; // int 끼리의 계산은 결과도 int
        System.out.println("a / b =  " + div);

        int mod = a % b;
        System.out.println("a % b =  " + mod);
    }
}
