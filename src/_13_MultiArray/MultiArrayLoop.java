package _13_MultiArray;

import java.util.Arrays;

public class MultiArrayLoop {
    static void main(String[] args) {
/*

        //다차원 배열 순회
        String seats[][] = new String[][]
                {
                        {"A1","A2","A3","A4","A5",}, //0번 인덱스
                        {"B1","B2","B3","B4","B5",}, //1번 인덱스
                        {"C1","C2","C3","C4","C5",} //2번 인덱스
                };

        for (int i = 0; i < 3; i++) {//행
            for (int j = 0; j <5 ; j++) {//열
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < seats.length; i++) {//행
            for (int j = 0; j <seats[i].length ; j++) {//열
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }

*/

        //===============================================================================
        //아이맥스 영화관
        //ㅔㅅ로 10칸, 가로 15칸

   /*     String imaxSeats[][] =  new String[10][15]; //멀티 어레이 선언
        String[] eng = {"A", "B","C","D","E","F","G","H","I","J","K","L","M","N","O"};

        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[i].length; j++) {
                imaxSeats[i][j]=eng[i]+(j+1);
            }
            System.out.println();
        }
        imaxSeats [1][1] = "__";

        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[i].length; j++) {
                System.out.print(imaxSeats[i][j]+" ");
            }
            System.out.println();
        }*/
        //===============================================================================
        //다차원 배열 합 구하기
        //3*3 크기 1부터 홀수 차례로 넣고 확인 후 총합구하기
        int hole[][] =  new int[3][3]; //멀티 어레이 선언
        int num = 1;
        int sum = 0;

        for (int i = 0; i < hole.length; i++) {
            for (int j = 0; j < hole[i].length; j++) {
                hole [i][j]=num;
                sum+=num;
                num+=2;
                System.out.print(hole[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("총합은 "+sum);


        //===============================================================================
        System.out.println();
        System.out.println("=========각 행 합, 각 열 합, 전체 합 구하기 문제=======");

        int[][] a={
                {1,2,3},
                {4,5,6}
        };
        int n =a.length;
        int m = a[0].length;
        int sumA = 0;
        int row []= new int[n]; //열
        int coloum []= new int[m]; //행

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                row[i] += a[i][j];
                coloum[j] += a[i][j];
                sumA += a[i][j];
            }
        }
        System.out.println("전체합은 "+sumA);
        System.out.println("열 합은 "+ Arrays.toString(coloum));
        System.out.println("행 합은 "+Arrays.toString(row));


        //===============================================================================
        //A+B, A-B의 값 구하기
        int[][] A = {{1, 2},{3,4}};
        int[][] B = {{5,6},{7,8}};
        int n1 = A.length;
        int m1 = A[0].length;


    }
}
