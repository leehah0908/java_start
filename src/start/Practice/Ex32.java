package start.Practice;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("5개의 정수를 입력하세요.");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.print(nums[i] + ",");
        }
    }
}
