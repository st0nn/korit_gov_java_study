package _24_Builder.User;

public class UserMain {
    public static void main(String[] args) {

        User user = new User.Builder()
                .userId(123)
                .email("st0nnnaver.com")
                .username("남")
                .build();

        System.out.println(user.toString());
    }


}
