package start.Practice;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int len = input.nextInt();

        int[] nums = new int[len];
        int max , min;

        System.out.println(len + "개의 정수를 입력하세요.");
        for (int i = 0; i < len; i++) {
            nums[i] = input.nextInt();
        }

        max = min = nums[0];

        for (int tmp : nums) {
            if (max < tmp) {
                max = tmp;
            }
            if (min > tmp) {
                min = tmp;
            }
        }

        System.out.println("가장 큰 수 : " + max);
        System.out.println("가장 작은 수 : " + min);
    }
}
