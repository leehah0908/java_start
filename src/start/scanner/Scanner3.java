package start.scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자 : ");
        int num1  = scanner.nextInt();

        System.out.print("두번째 숫자 : ");
        int num2  = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("큰 수는" + num1 + "입니다.");
        } else if (num1 < num2) {
            System.out.println("큰 수는 " + num2 + "입니다.");
        } else {
            System.out.println("두 수는 같습니다.");
        }
    }
}