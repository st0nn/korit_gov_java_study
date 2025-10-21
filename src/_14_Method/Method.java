package _14_Method;

public class Method {
    public static void sayHello() {
        System.out.println("Hello world");
    }

    // 1. 최댓값 구하기(세개의 인자)
    //=================================================================

   /* public static void maxInt(int a, int b, int c) {
        int max = a;
        if (b > max) {
            b = max;
        } else if (c > max) {
            c = max;
            return max;
        }
    }*/

    // 2. 홀짝 판단하기
    //======================================================================
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 3. 절대값 구하기 (삼항연산자)
    //======================================================================
    public static int abs(int n) {
        return n < 0 ? -n : n;
    }

    // 4. 포함 여부(선형탐색)
    //======================================================================
    // contains({1,3,5},3) => 있으면 True, 없으면 False
    public static boolean contains(int[] a, int b) {
        boolean judge = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                judge = true;
            }
        }
        return judge;
    }

    static void main(String[] args) {



    }



}
