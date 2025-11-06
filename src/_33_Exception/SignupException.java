package _33_Exception;


/*
AgeRestrictionException
> 나이제한에 대한 예외 클래스
 */


/*
signUp 메소드 (String username, int age)
=> 가입조건 만 14세 이상
이 조건에 만족하지 않으면 AgeRestrictionException 발생
해당 예외는 호출한 곳에서 처리
만약 예외가 발생하지 않는다면 "username"님, 가입을 환영합니다." 출력

main에서 예외처리
예외 발생 시 "회원가입 실패: 이유~~" 출력
예외 유무 상관없이 "회원가입 처리 종료" 출력
 */

public class SignupException extends Exception {

    public SignupException(String message) {
        super(message);
    }

    public static void signUp(String username, int age) throws SignupException {
        if (age < 14) {
            throw new SignupException("만 14세 미만은 가입할 수 없습니다.");
        } else {
            System.out.println(username + "님, 가입을 환영합니다.");
        }
    }

    public static void main(String[] args) {
        try {signUp("남영석", 15);
        } catch (SignupException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("회원가입 처리 종료");
        }
    }
}
