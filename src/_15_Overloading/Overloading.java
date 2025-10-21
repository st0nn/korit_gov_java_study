package _15_Overloading;

public class Overloading {

    public static int getPower(int number) {
        return number * number;
    }
    public static void printInfo(String name) {
        System.out.println("이름은 "+name);
    }
    public static void printInfo(String name, int age) {
        System.out.println("이름은"+name+", 나이는"+age);
    }
    public static void printInfo(String name, int age, String adrs) {
        System.out.println("이름은"+name+", 나이는 "+age+", 주소는 "+adrs);
    }

    public static int max(int a, int b) {
        int maxInatant = a;
        if (maxInatant < b) {
            maxInatant=b;
        }
        return maxInatant;
    }

    public static double max(double a, double b) {
        double maxInatant = a;
        if (maxInatant < b) {
            maxInatant=b;
        }
        return maxInatant;
    }



    static void main(String[] args) {
        printInfo("남영석", 12);
        System.out.println(max(1,4));
        System.out.println(max(1.2,4.4));

    }

}
