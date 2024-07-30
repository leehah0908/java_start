package start.practice;

public class Ex17 {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        int cnt = 0;

        System.out.println("for문 시작");
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        System.out.println("while문 시작");
        while (cnt <= num) {
            sum += cnt;
            cnt++;
        }
        System.out.println(sum);
    }
}
