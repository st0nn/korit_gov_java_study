package _06_String;

public class EscapeSequence {
    static void main(String[] args) {
        //특수문자, 이스케이프 문자 \n, \t, \\, \", \'
        System.out.println("1.\\안뇽" );

        String id = "0000301-12345678";
        System.out.println(id.substring(0,(id.indexOf("2345678"))));


        String str1 = "1234";
        String str2 = "1234";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        str2 = new String("1234");
        str1 = new String("1234");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
