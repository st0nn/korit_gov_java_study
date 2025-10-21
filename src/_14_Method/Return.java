package _14_Method;

public class Return {
    public static void getAverage() {

    }
    public static String getName() {
        String name = "남영석";
        return name;
    }

    public static int power (int number) {
        int result = number*number;
        return result;
    }

    static void main(String[] args) {
        int powerResult = power(2);
        System.out.println(powerResult);
    }

//    public static int powerByExp(int number, int exponent) {
//        int result = 1;
//        for (
}
