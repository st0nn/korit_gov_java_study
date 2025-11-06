package _33_Exception;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
    public class Exception02 {
        public static void login(String id, String password) throws LoginFailedException {
            String correctId = "admin";
            String correctPassword = "1q2w3e4r";

            if (!id.equals(correctId) || !password.equals(correctPassword)) {
                throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");
            }
        }
    }
}




