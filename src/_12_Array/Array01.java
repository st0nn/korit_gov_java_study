package _12_Array;

public class Array01 {
    static void main(String[] args) {
//
//        String[] countries = new String[5]; //5개의 공간 할당
//        countries[0] = "헝가리";
//        countries[1] = "크로아티아";
//        countries[2] = "일본";
//        countries[3] = "대한민국";
//        countries[4] = "대한민국";
//        countries[5] = "대한민국";
//        System.out.println(countries);
        //=========================================================
        // 선언과 동시에 값 나열 가능
//        String[] countries = new String[] {"헝가리', 크로아티아","일본"};

        // 선언과 동시에 값 나열도 가능(new) 생략
        String[] countries = {"헝가리", "크로아티아","일본"};
        System.out.println(countries[2]);
        System.out.println(countries.length);

        int numbers [] = {1,2,3};

    }
}
