package start.scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("0을 입력하면 프로그램은 종료됩니다.");
        while (true) {
            System.out.print("숫자를 입력하세요. : ");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.print("프로그램을 종료합니다.");
                break;
            }

            sum = sum + num;
            System.out.println("입력한 수의 합은 " + sum + "입니다.");
        }
    }
}

