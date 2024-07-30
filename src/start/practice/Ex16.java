package start.practice;

public class Ex16 {
    public static void main(String[] args) {
        int num = 1;

        System.out.println("while문 시작");
        while (num <= 10) {
            System.out.println(num*2);
            num++;
        }

        System.out.println("for문 시작");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*2);
        }
    }
}
