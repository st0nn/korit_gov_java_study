package _06_String;

public class String02 {
    static void main(String[] args) {
        String s = "I like gurumgwaja";
        //특정 문자열 대체
        System.out.println(s.replace("I", "U"));
        // 범위내 문자열 출력
        System.out.println(s.substring(0, 3));

        // 특정 문자열이 있는 위치부터 출력하는법
        System.out.println(s.substring((s.indexOf("like")),13));

        String s1 = "Hello";
        String s2 = "world";
        System.out.println();

    }
}
