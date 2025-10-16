package _05_Operator;

public class Operator {
    static void main(String[] args) {
   /*     int num1 = 10;
        int num2 = 5;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 * num2 - num2);


        num1 += 10;
        num1 += 5;
        System.out.println(num1);
        int j = 10;
        int i = 11;
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);

        System.out.println(j != i);
        System.out.println(j <= i);

        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 & flag2);
        System.out.println(flag1 | flag1);
        System.out.println(flag1 & flag1);
        System.out.println(!flag1 & flag1);
*/
        int a = 10;
        int b = 20;
        System.out.println(b > a && a < 5);
        System.out.println(b < a || a > 5);

        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int max2 = (x < y) ? x : y;

        y = 5;
        boolean isSame = (x == y) ? true : false;
        System.out.println(isSame);


        int height = 180;
        String heightLimit = (height >= 120) ? "탑승가능합니다^^" : "썩꺼지삼^^";
        System.out.println(heightLimit);



        // 홀짝 맟추는 삼항연산자
        int num3 = 3;
        int num4 = 4;
        String hoist = (num3%2)==0 ? "짝수" : "홀수";
        System.out.println(num3%2);


        // 점수가 0에서 100까지 주어질떄 90 이상 A 80이상 B 70이상 C 나머지 D
        int grade = 98;
        String result =
                (grade >= 70) ?
                        (grade >= 80) ?
                                (grade >= 90) ? "A" :
                        "B":
                "C" :
        "D";
        System.out.println(result);
    }
}
