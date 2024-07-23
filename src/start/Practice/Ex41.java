package start.Practice;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 10000;

        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 : ");
            int menu = input.nextInt();
            int amount;

            if (menu == 1) {
                System.out.print("입금액을 입력하세요 : ");
                amount = input.nextInt();
                balance = deposit(balance, amount);
            } else if (menu == 2) {
                System.out.print("출금액을 입력하세요 : ");
                amount = input.nextInt();
                balance = withdraw(balance, amount);
            } else if (menu == 3) {
                System.out.println("현재 잔액 : " + balance);
            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 메뉴룰 선택해주세요.");
            }
        }
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하셨습니다. 현재 잔액 : " + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하셨습니다. 현재 잔액 : " + balance);
            return balance;
        }
        System.out.println(amount + "원을 출금하려 했으니 잔액이 부족합니다.");
        return balance;
        }
    }
