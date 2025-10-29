package _24_Builder.StaticMember;

public class StaticMemberMain {
    public static void main(String[] args) {
        StaticMember staticMember = new StaticMember.Builder()
                .name("남영석")
                .age(27)
                .email("")
                .build();
    }
}
