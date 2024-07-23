package Practice;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 : ");
        int len = input.nextInt();

        int[][] grade = new int[len][3];
        int sum;
        double avg;

        for (int i = 0; i < grade.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입혁하세요.");

            System.out.print("국어 점수 : ");
            grade[i][0] = input.nextInt();
            System.out.print("영어 점수 : ");
            grade[i][1] = input.nextInt();
            System.out.print("수학 점수 : ");
            grade[i][2] = input.nextInt();
        }

        for (int i = 0; i < grade.length; i++) {
            sum = 0;
            for (int j : grade[i]) {
                sum += j;
            }
            avg = (double) sum / grade[i].length;
            System.out.println((i + 1) + "번 학생의 총점 : " + sum + ", 평균 : " + avg);
        }
    }
}
