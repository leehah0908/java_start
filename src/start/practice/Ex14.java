package start.practice;

public class Ex14 {
    public static void main(String[] args) {
        int x = 3;

        String status = (x % 2 == 0) ? "짝수" : "홀수" ;
        System.out.println("x = " + x + ", " + status);
    }
}
