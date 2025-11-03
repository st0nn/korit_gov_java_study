package _29_Collections.Map;

import java.util.*;

public class ProductMap {
    /*
    1. 스캐너 객체 하나 생성하고 변수명이 productMap인 hashMap 선언(키는 String, 값은 Integer)
    2. 상품 등록하기 라고 출력하고 for 문 이용, 5번 반복, 상품명(키)입력받고 가격(값)입력받고
    productMap에 넣기

    3. 전체상품 출력하기 > 향상된 for문 순회하면서 "- 아이폰 17 => 1250000원"이런식으로 출력
    4. 상품가격 수정 => 수정할 상품명 입력받고 입력한 상품이 productMap에 있으면 수정할 가격 입력받고
    없으면 "해당 상품이 없습니다" 출력 > 만역 수정 성공 시 "가격이 수정되었습니다" 출력
    5. 특정 상품 검색 => 검색할 상춤명 입력받고 입력한 상품이 있으면 출력 없으면 "해당 상품이 없습니다." 출력
    6. 정렬하기 => 키 기준 정렬 후 출력
    7. 내림차순 정렬하기 > 키 기준 내림차순 정렬 후 출력
    */

    public static void main(String[] args) {
        System.out.println("상품 등록하기");
        Scanner scanner= new Scanner(System.in);

        Map<String, Integer> productMap = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+"번째 값을 입력해 주세요.");
            System.out.println("상품명 입력해주세요");
            String key = scanner.nextLine();

            System.out.println("값를 입력해주세요");
            int value = scanner.nextInt();

            productMap.put(key,value);
        }

        System.out.println("전체상품조회");
        for(Map.Entry<String, Integer> entry : productMap.entrySet());
        System.out.println();


    }





}
