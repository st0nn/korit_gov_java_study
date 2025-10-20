package _11_While;
import java.util.Scanner;

public class DoWhile {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ====================================================
//        int i = 10;
//        do {System.out.println(i);
//            i++;
//        } while (i <= 5);

        // ====================================================
//        int choice;
//        do {
//            System.out.println("===메뉴===");
//            System.out.println("1. 주문하기");
//            System.out.println("2. 취소하기");
//            System.out.println("0. 종료");
//            System.out.println("선택: ");
        // ====================================================
            //1부터 n까지의 합을 구하시오
//        System.out.print("n:");
//        int n = scanner.nextInt();
//        int num = 0;
//        do {
//        } while (num < n); {
//            n =+ num;
//            n++;
//
//        }
//        System.out.println(num);

        // ====================================================
        //숫자 맞추기 게임!
        //숫자를 입력 받아 정답 맞추기
        //업다운 출력
        //시도한 횟수를 나중에 정답 맞췄을떄 같이 출력

        int guess = scanner.nextInt();
        int answer = (int)(Math.random()*100)+1;
        int tries = 0;

        System.out.println(answer);

        do {
            System.out.println("숫자:");
            guess = scanner.nextInt;
            tries ++;

            if(guess < answer) {
                System.out.println("업");
            } else if (guess > answer) {
                System.out.println("다운");
        }
        } while ( guess != answer);

        System.out.println("정담!");







    }
}


