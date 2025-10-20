package _07_Scanner;

import java.util.Scanner;

public class Scanner01 {
    static void main(String[] args) {
        // Scanner 입력 받기

        Scanner scanner = new Scanner(System.in);

        //String 문자열 입력받기
        //next() => 토큰 다누이로 읽음
        //토큰 => 공백문자(띄어쓰기)
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println("str1:"+str1);
        System.out.println("str2:"+str2);

        String str3 = scanner.nextLine();
        System.out.println("str3:"+str3);

        int num = scanner.nextInt();
        String str = scanner.nextLine();
        scanner.nextLine();
        System.out.println("num:"+num+"str"+str);
//        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력해주세요");
        String age = scanner.nextLine();
        System.out.println("이름을 입력해주세요");
        String name = scanner.nextLine();
        System.out.println(age+"살 "+name+"입니다.");

    }
}
