package start.Practice;

public class Ex39 {
    public static void main(String[] args) {
        printMessage("Hello, World!", 5);

    }
    public static void printMessage(String str, int cnt){
        for (int i = 0; i < cnt; i++) {
            System.out.println(str);
        }
    }
}
