package _10_For;

import java.util.Scanner;

public class For {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i<10; i++) {
//        System.out.println("안녕"+i);
//        int sum = 0;
//        for (int i=1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//
//        int sum2 = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i%2==0) {
//                sum2 += i;
//            }
//        }
//        System.out.println(sum2);
//
//        //구구단 출력하기
//        Scanner scanner  = new Scanner(System.in);
//        int gugu = scanner.nextInt();
//        for (int i = 1; i < 10; i++) {
//            // 3을 넣었으면 3단이 다 나오게
//            // 구구단의 정의?
//            System.out.println(gugu * i);
//        }
//
//
//        int gugu1 = 1;
//        //1열 제한
//        for (int i = 1; i < 10; i++) {
//            // 구구단의 전체출력?
//            if (i<10) {
//                for (int j = 1; j<10; j++) {
//                    System.out.println(i+"곱하기"+j+"="+i*j);
//                }
//            }
//        }

//
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 6; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <=50 ; i++) {
//            if (i%3==0) {
//                System.out.println();
//                continue;
//            }
//            System.out.println(i);
//        }


        //1부터
//        int sum = 0;
//        for (int i = 1; ; i++) {
//            sum += i;
//            if(sum>200) {
//                System.out.println(i);
//                System.out.println(sum);
//                break;
//            }
//
//        int cnt = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//
//
//
//
//        // input의 최댓값을 도출해야 함.
//        // 5번 입력을 받아야 함.
//        int max = 0;
//        for (int i = 0; i<=5 ; i++) {
//            int input = scanner.nextInt();
//            if (max<input) {
//                max = input;
//                System.out.println("변경된 사항"+max);
//            }
//        }
//        System.out.println("최종 결과는"+max);
//
//
//        int fact = 1;
//        int input = scanner.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            if (input>=i){
//                fact = fact * i;
//            }
//        }
//        System.out.println(fact);
//

        int uak = 0;
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                System.out.println(uak+"박수");
            }
            else if (i%10==5){
                System.out.println("으악");
            }
            System.out.println(i);

        }
    }
}









