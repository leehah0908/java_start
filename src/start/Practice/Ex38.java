package start.Practice;

public class Ex38 {
    public static void main(String[] args) {
        System.out.println("평균값 : " + avgerage(1, 2, 3));
        System.out.println("평균값 : " + avgerage(15, 25, 35));

    }

    public static double avgerage(int a, int b, int c){
        int sum = a + b + c;
        double avg = sum / 3.0;
        return avg;
    }
}
