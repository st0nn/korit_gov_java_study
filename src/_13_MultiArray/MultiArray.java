package _13_MultiArray;

public class MultiArray {
    static void main(String[] args) {

        //다차원 배열(2차원)

        //영화관 좌석
        String seatA [] = {"A1","A2","A3","A4","A5",};
        String seatB [] = {"B1","B2","B3","B4","B5",};
        String seatC [] = {"C1","C2","C3","C4","C5",};
        //2원 배열 선언 => 3*5
        String seats[][] = new String[][]
                {
                {"A1","A2","A3","A4","A5",}, //0번 인덱스
                {"B1","B2","B3","B4","B5",}, //1번 인덱스
                {"C1","C2","C3","C4","C5",} //2번 인덱스
        };
        //B3 에 접근시
        System.out.println(seats[1][2]);
    }
}
