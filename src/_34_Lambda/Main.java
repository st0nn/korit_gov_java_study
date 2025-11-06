package _34_Lambda;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Runnable job1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("악명 클래스 방식으로 실행");
            }
        };
        job1.run();

        Runnable job2 = () -> System.out.println("람다 방식으로 실행");
        job2.run();

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { //두 정수 객체를 받아 비교하는 로직
                return o1.compareTo(o2);
                //두 객체 중 만약 앞의 객체가 더 작다면 -1, 같다면 0, 크다면 1을 반환
            }
        };

        System.out.println(comparator.compare(5,70));
        /*
        람다 장점
        코드 간결화
        표현력 향상

        람다 단점
        디버깅 어려움 = 람다식 내부애서 발생하는 오류의 디버깅이 어렵다 => 간결하게 코드를 쓰니까
        재사용성 낮음 - 익명 클래스에 비해서 재사용이 어려움 => 한줄로 한번만 사용하고 마니까
        복잡한 로직 표현에 부적합 - 단순 로직의 경우 람다, 아닌 경우는 익명 클래스

        Runnable - void run()
        매개변수도 없고 반환갑도 없는 단순 실행을 위한 인터페이스

        Supplier - T get () ;
        매개변수 없이 값을 반환하는 인터페이스, 단순히 값을 '공급'하는 역활

        Consumer - void accept (T t);
        값을 매개변수로 받아서 사용하고, 아무것도 반환하지 않는 인터페이스, 데이터를 '소비'하는 역활

        Function<T, R> - R apply(Tt);
        하나의 매개변수를 받아서, 연산을 수행한 후 결과를 리턴함

        Predicate - boolean test(T t);
        하나의 매개변수를 받아서 특정 조건을 검사한 후 true/false를 반환
        */

        Supplier<String> stringSupplier = () -> "Supplier 인터페이스 문자열 반환";
        Consumer<String> stringConsumer = (String message) -> System.out.println("메시지: "+ message);
        stringConsumer.accept(stringSupplier.get());
    }
}












