package _23_Static.Person;

public class Person {

    public static int population = 0;
    //객체 수준에서의 상수(객체수준에서 변경할 수 없는 상수)
    final String COUNTRY1 = "KOREA";
    //클래스 전체에서 하나뿐인 상수
    static final String COUNTRY2 = "US";

    public Person() {
        population++;
    }

    public static void showPopulation() {
        System.out.println("인구수 : "+population);
        //ShowPopulation 메소드는 객체가 필요없이 호출이 가능한 메소드인데
        //안에서 쓰는 population 필드가 스태틱이 아니므로
        //객체가 필요하기 떄문에 접근할 수 없다.

    }
}
