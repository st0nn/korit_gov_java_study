package _06_String;

public class String01 {
    static void main(String[] args) {
        String s = "My name is nam.";
        System.out.println(s.length()); // 문자열의 길이
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("e"));
        System.out.println(s.indexOf("e"));

        s = "I like music and movie and travel";
        System.out.println(s.lastIndexOf("movie"));
        System.out.println(s.startsWith("I"));


    }
}