package _33_Exception;

import _06_String.String01;
import _07_Scanner.Scanner01;

import java.util.Scanner;

/*
사용자로부터 문자열 형태의 입력을 받음
입력된 문자열을 Integer.parseInt()를 사용하여 정수로 변환
변환된 숫자를 출력
만약 변환하는 과정에서 입력값이 숫자가 아니라면 예외발생
예외 처리 후 "숫자가 아닌 값을 입력하셨습니다" 출력
 */
public class NumberParseException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String scan = scanner.nextLine();

            int parsed = Integer.parseInt(scan);
            System.out.println(parsed);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값을 입력하였습니다.");
        }
    }



}
