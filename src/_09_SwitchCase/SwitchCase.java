package _09_SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int month = scanner.nextInt();

        //값 수신
        int a = scanner.nextInt();
        scanner.nextLine();
        //연산자 수신
        String oper = scanner.nextLine();
        scanner.nextLine();
        //값 수신
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println(a+oper+b);

        //값 수신
        switch (oper) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("유효한 기호가 아닙니다.");
                break;
        }




        int ranking = 2;
/*
        if (ranking==3) {
            System.out.println("박수");
        } else if (ranking==2) {
            System.out.println("소정의 상금");
        } else {
            System.out.println("전액 장학금");
        }*/
/*
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("소정의 장학금");
                break;
            default:
                System.out.println("박수쳐줌");
        }*/

/*// 일등일시 만원이 출력되게
        int grade = 1;
        int price = 7000;

        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                System.out.println(price);

        }




        switch (month) {
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Autumn");
                break;
            case 1: case 2: case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("유효하지 않는 월입니다.");
        }
        */


    }
}
