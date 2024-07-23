package Practice;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        int num;

        System.out.println("-1을 입력하면 프로그램은 종료됩니다.");
        while (true) {
            System.out.print("숫자를 입력하세요. : ");
            num = scanner.nextInt();

            if (num == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            sum += num;
            cnt++;
        }

/*  이렇게도 할 수 있음
        while ((num = scanner.nextInt()) != -1){
            sum += num;
            cnt++;
        }
*/

        double avg = (double) sum / cnt;
        System.out.println("입력한 수의 합은 " + sum + "입니다.");
        System.out.println("입력한 수의 평균은 " + avg + "입니다.");
    }
}
