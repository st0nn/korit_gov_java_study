package _35_StreamApi;
/*
커
 */

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영","김일","김이","최삼","박사","이오","남육");
        // filter() => 말 그대로 어떠한 조건을 통해 거르는 것
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();
        System.out.println("namesWithKim: " + namesWithKim);

        List<Integer> numbers =
                Arrays.asList(1,2,3,4,5);
        //map() => 내부 요소들에게 각각 메소드를 적용하는 형태
        List<Integer> multiNumbers = numbers.stream()
                .map(number -> number * 2)
                .toList();
        System.out.println("multiNumbers: "+ multiNumbers);

        List<String> englishNames = Arrays.asList("alice", "anya", "smith", "pascal", "bacon", "harry","porter");

        List<String> result = englishNames.stream().filter(name -> name.startsWith("a")).map(name -> name.toUpperCase()).toList();
        // :: 은 해당 타입 클래스의 메소드를 직접 호출해서 각각 요소에 적용
        System.out.println("result: "+ result);
        result.forEach(name -> System.out.println(name));

        // englishNames 에서 이름이 5글자 초과 되는 이름의 갯수
        // 일반적으로 for를 이용한 결과
        // 스트림을 이용한 결과

        int count = 0;
        long count2 = englishNames.stream().filter(name -> name.length()>5).count();




    }

}
