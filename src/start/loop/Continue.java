package start.loop;

public class Continue {
    public static void main(String[] args) {
        int cnt = 1, sum = 0;

        while (true){
            sum = sum + cnt;
            if (cnt == 3) {
                cnt++;
                continue;
            }
            if (sum > 10){
                System.out.println(sum + "cnt는 " + cnt);
                break;
            }
            cnt++;
        }
    }
}
