package _34_Lambda;
//1. 스캐너 객체 선언과 입력받아 저장할 Map선언(String, Integer)
//2. 상품을 입력할 갯수를 count로 입력받기(nextInt로)
//3. count만큼 반복하며 상품명(키)과 가격(값)으로 각각 입력받고 Map변수에 추가
//4. [상품 목록] 출력 후 람다식을 이용해서 forEach로 [상품명]: ***, [가격]: ***원 이런식으로 출력


import java.util.*;

public class ForEachMap {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("상품수를 입력해주세요");
        int count = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < count; i++) {
            System.out.print((i+1)+"번째 상품명을 입력해주세요 :");
            String key = scanner.nextLine();
            System.out.print("값를 입력해주세요 :");
            int value = scanner.nextInt();
            scanner.nextLine();
            stringIntegerMap.put(key, value);
        }

        System.out.println("[상품목록]");
        stringIntegerMap.forEach((key, value) -> System.out.println("[상품명]: "+key+ ", [가격]: "+value+"원"));
//
//        System.out.println(stringIntegerMap);
//
//        stringIntegerMap.forEach(pruduct -> System.out.println("상품: " + pruduct));
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        numbers.forEach(number -> System.out.println(number * 2));





    }
}
