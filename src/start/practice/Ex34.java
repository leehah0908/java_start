package start.practice;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int len = input.nextInt();
        int[] nums = new int[len];

        System.out.println(len + "개의 정수를 입력하세요.");
        int sum = 0;

        for (int i = 0; i < len; i++) {
            nums[i] = input.nextInt();
            sum += nums[i];
        }

        double avg = (double) sum / len;
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + avg);
    }
}
