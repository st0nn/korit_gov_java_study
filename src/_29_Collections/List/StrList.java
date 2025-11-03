package _29_Collections.List;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StrList {
    //collection
    //여러 객체를 모아두는 것

    //List = 순서가 있는 데이터의 집합, 중복된 요소를 허락한다.
    public static void main(String[] args) {
        List<String> strList1 = new ArrayList<>();

        //요소 추가
        strList1.add("A");
        strList1.add("B");
        strList1.add("A"); //중복 허용

        List<String> strList = new ArrayList<>(Arrays.asList("A", "B", "A"));
        System.out.println(strList);
        System.out.println("===================================");
        List<String> strList2 = new ArrayList<>();
        strList2.add("java");
        strList2.add("python");
        strList2.add("C#");
        strList2.add("javascript");
        strList2.add("kotlin");

//        String[] strArray = new String[2];
//        strArray[0] = "이동윤";
//        strArray[1] = "삼동윤";
        System.out.println(strList2.get(3));//get메소드 사용하면 편리하게 가능

        //검색
        String searchElem2 = "python";
        boolean containResult2 = strList2.contains("@");

        //요소 삭제
        String removeElem1 = "Kotlin";
        boolean removeResult = strList2.remove(removeElem1);
        System.out.println();

        //정렬 오름차순
        Collections.sort(strList2);
        System.out.println(strList2);
        //정렬 내림차순
        Collections.sort(strList2, Collections.reverseOrder());
        System.out.println(strList2);

        //List의 길이
        System.out.println(strList2.size());

        //언어 붙이기

        for (int i = 0; i < strList2.size(); i++) {
            System.out.println(strList2.get(i)+"언어");
        }













    }
}
