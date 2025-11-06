package _33_Exception;

public class Exception01 {
    public static void main(String[] args) {
            /*
    try - catch - finally 구문 / throws 키워드
    try {
    예외가 발생할 수 있는 코드
    } catch (ExceptionType e) {
    예외 발생 시 실행할 코드
    } finally {
    예외 발생 여부와 상관없이 무조건 실행되는 코드
    }
     */
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. : " + e.getMessage());
        } finally {
            System.out.println("프로그램 종류");
        }

        int numbers[] = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생!: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
            //throw - 이미 정의된 예외 클래스를 이용해서 의도적으로 예외를 던지는 역활
            //반드시 new 키워드를 이용해서 예외 객체를 생성해야 한다.
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
