package start.Practice;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하세요 : ");
        int dan = input.nextInt();

        System.out.println(dan + "단의 구구단:");

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X "  + i + " = " + dan * i);
        }
    }
}
