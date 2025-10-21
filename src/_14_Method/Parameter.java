package _14_Method;

public class Parameter {
    public static void power(int number) {
        int result = number*number;
        System.out.println(number +"의 2승은 "+result+"입니다.");
    }
    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
            System.out.println(number+"의 "+exponent+"승은 "+result+"입니다.");
        }
    }

    public static void powerByExp(int num1, int num2, int num3) {
        int result = 1;

//
//    static void main(String[] args) {
//        power(2);
//        powerByExp(2,4);
//

        //세개의 정수를 전달하여 평균을 출려갛는 메소를 만드세요
    }
}
