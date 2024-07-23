package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine(); // 엔터를 입력할때 까지 문자열을 가져옴
        System.out.println("입렵한 문자열 : " + str);

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt();
        System.out.println("입렵한 정수 : " + intValue);

        System.out.print("실수를 입력하세요 : ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입렵한 실수 : " + doubleValue);
    }
}
