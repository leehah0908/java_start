package Practice;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxProduct = 10;
        String[] productName = new String[maxProduct];
        int[] productPrice = new int[maxProduct];
        int productCount = 0;

        while (true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int status = input.nextInt();
            input.nextLine();

            if (status == 1) {
                if (productCount >= maxProduct){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                } else {
                    System.out.print("상품 이름을 입력하세요 : ");
                    productName[productCount] = input.nextLine();
                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrice[productCount] = input.nextInt();
                    productCount++;
                }
            } else if (status == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                } else {
                    for (int j = 0; j < productCount; j++) {
                        System.out.println(productName[j] + " : " + productPrice[j] + "원");
                    }
                }
            } else if (status == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 숫자를 입력하세요.");
            }
        }
    }
}
