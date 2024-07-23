package cond;

public class Condop1 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("status = " + status + "  age = " + age);
    }
}
