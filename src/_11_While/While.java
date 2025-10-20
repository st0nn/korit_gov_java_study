package _11_While;

import java.util.Scanner;

public class While
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        // =============================================
//        int i = 1;
//        while ( i <= 5) {
//            System.out.println(i);
//            i++;
//        }
        // =============================================
//        int i = 0;
//        while (i<= 10){
//            if (i%2==0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//        // =============================================
//        boolean flag = true;
//        while (flag) {
//            int score = scanner.nextInt();
//            if (0 <= score && score <= 100) {
//                System.out.println("점수는"+score);
//                flag = false;
//            } else {
//                System.out.println("다시 입력하세요");
//            }
//        }
//        // =============================================
//        While (true) {
//            System.out.println("메뉴를 선택하세요.");
//        }
//        // =============================================
//        int num = 0;
//        int count = 0;
//        while (count<=100){
//            num =+ count;
//            count++;
//        }
//        System.out.println(num);
        // =============================================

        // 1번부터 100번까지 식당 웨이팅
        // 이때 1번부터 차례대로 입장

        // =============================================
//        int i = 1;
//        int soldeOut = 10;
//        while (i <= 100){
//            System.out.println(i+"번"+"손님 입장");
//            if (i == soldeOut) {
//                System.out.println("솔드아웃");
//                break;
//            }
//            i++;
//
//        }

        // =============================================
        int i = 10;
        int soldOut = 20;
        int noShow = 14;
        while (i<=10) {
            if (i==noShow) {
                System.out.println(i + "번손님 노쇼 발생!");
            }
            if (i==soldOut) {
                System.out.println("한정판매 종료");
            }
        }




    }
}
