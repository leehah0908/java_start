package start.scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("첫번째 숫자 : ");
        int a = scanner.nextInt();

        System.out.print("두번째 숫자 : ");
        int b = scanner.nextInt();

        System.out.println("두 수의 합은 : " + (a + b));
    }
}
