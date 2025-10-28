package _08_if;

import java.util.Scanner;

public class if01 {
    static void main(String[] args) {


        //아이디 비밀번호 확인

        String userId = "myid1234";
        String userPw = "qwer1234";
        // 사용자에게 아이디 비밀번호를 입력받아 일치하면 "로그인 확인 출력"
        // 아이디가 틀리면 "아이디가 틀렸습니다" "비밀번호가 틀리면 비밀번호가 틀려씁니다". 출력


        if (userId == "myid1234") {
            if (userPw == "qwer1234") {
                System.out.println("로그인 확인");
            } else {
                System.out.println("비밀번호 틀");
            }
        } else {
            System.out.println("아이디 틀");
        }
    }
}
        // if (조건(불리언)) { 참일떄 실행할 코드 }
        //키가 120이상이면 탑승가능
        /*int height = 120;
        if (height >= 120) {
            System.out.println("탑승가능");
        } else {
            System.out.println("탑승 불가능");
        }

        //키가 120이상이거나 어린이면 탑승가능//
        // if (height >=120  iskid);

        boolean iskid = true;
        if (height >= 120 || iskid) {
            System.out.println("탑승가능");
        }

        //1. 3의 배수인지 판단하여라
        int num = 12;
        if (num % 3 == 0) {
            System.out.println("3의 배수입니다.");
        }
        ;

        //2. 절댓값 출력하는법
        int num2 = -12;
//        int (num2<0) ? num2+ : num2 ;

        //3. 최댓값 출력
        int num3 = 12;
        int num4 = 8;
        System.out.println((num3 > num4) ? num3 : num4);
  */


