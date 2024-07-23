package loop;

public class While_2 {
    public static void main(String[] args) {
        int sum = 1, cnt = 1, endNum = 10;

        while (cnt <= endNum){
            sum = sum + cnt;
            cnt++;
        }
        System.out.println(sum);
    }
}
