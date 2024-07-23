package start.variable;

public class Var8 {

    public static void main(String[] args) {
        // 정수
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647
        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        // 실수
        float f = 10.0f; // 소수점 계산에서 오류가 자주 발생함 -> 권장하지 않음 <- 표현 범위가 작아서
        double d = 10.0;
    }
}
