package _29_Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class StrMap {

    /*
    Map - Key와 Value의 쌍으로 이루어진 데이터들의 집합
    Key는 중복될 수 없고 value는 중복이 가능하다.

    Map는 직접적으로 순회할 수 없다 > 직접 foreach를 돌릴 수 없다,
    왜냐하면 순화하기 위해서는 Iterable이라는 인터페이스를 구현한 클래스여야 하는데
    Collection은 Iterable 인터페이스를 상속받고 Map이 이것으로 구현이 되어있어야 하는데 그렇지 않음
     */

    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();
        strMap1.put("kor222", "남영석");
        strMap1.put("kor223", "남일석");
        strMap1.put("kor224", "남이석");
        strMap1.put("kor225", "남삼석");
        strMap1.put("kor226", "남사석");

        System.out.println(strMap1);


        //Map의 특징 중 하나로 하나의 key에는 하나의 value만 가능
        //만약에 key가 동일하게 들어간다면 value값은 최신 것으로 덮어쓰기 된다.

        //특정 키의 존재 여부
        boolean searchKeyFlag1 = strMap1.containsKey("kor2023");

        // Map 정렬 => 사실 불가능
        // Map은 빠른 탐색 및

    }
}
