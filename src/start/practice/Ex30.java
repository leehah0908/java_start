package start.practice;

public class Ex30 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;

        for (int i : students) {
            total += i;
        }

        double avg = (double) total / students.length;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + avg);


    }
}
