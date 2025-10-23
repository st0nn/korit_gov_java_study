package _12_Array;

import _09_SwitchCase.SwitchCase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //정렬
//        int nums [] = {1,3,5,6,3,2,9,8};
        //순회하지 않고 전체를 출력할 수 있는 방법=
//        System.out.println(Arrays.toString(nums));
//
//
        //====================================================
        //sort()
//        Arrays.sort(nums); //오름차수 정렬 / 원본을 수정하는 형태임 /  내림차수 불가능
//        System.out.println(Arrays.toString(nums));

//        for (int i = nums.length-1; i >= 0; i--) {
//            System.out.println(i+"번은");
//            System.out.println(nums[i]);
//        }
//====================================================
//        for (int i = 0; i < nums.length/2; i++) {
//            int temp = nums[0];
//            nums[0] = nums[nums.length-i-1];
//            nums[nums.length - i -1] = temp;
//        }
//
//        System.out.println(Arrays.toString(nums));

        //내림차순으로 하는 정석

        //Arrays.sort(nums, Comparator.reverseOrder());
        //Comparator

        // int 와 Integer 는 같지 않다.
        //같은 정수 타입을 사용하긴 하나 int는 primitive type 즉 원시적인 자료형
        //Integer는 클래스로 이루어져 있으며 Wrapper Class
        //같은 정수지만 int는 연간만 가능한 반면 Integer는 다양한 기능을 사용할 수 있다.
        // double > Double / float > Float 등

        //====================================================
        //평균 구하기
       /* int sum = 0;
        float average = 0F; //평균 변수
        int[] score = {100, 88, 100, 100 , 90};

        for (int i = 0; i <= score.length-1; i++) {
            sum += score[i];
//            System.out.println(i);
//            System.out.println(sum);
            }
        average = sum/(float)(score.length);
        System.out.println("합은 "+sum);
        System.out.println("평균은 "+average);

        //====================================================
        //최소 최댓 값 구하기
        int max = 0;
        int min = 100;
        for (int i = 0; i < score.length; i++) {
            if (max <= score[i]) {
                max = score[i];
            } else if
                (min >= score[i]) {
                min = score[i];
//            System.out.println(i);
//            System.out.println(sum);
            }
        }
        System.out.println("최솟값은"+min);
        System.out.println("최댓값은"+max);*/
// =============================================
        //요일 출력
        char week [] = {'월', '화', '수', '목', '금', '토', '일'};
        int dayNum = scanner.nextInt();
        scanner.nextLine();
        if(dayNum < 8 && dayNum > 1 ) {
            System.out.println(week[dayNum - 1]);
        } else {
        System.out.println("잘못입력했슴");
        }

        int a [] = {4, 2, 7, 2, 3, 7, 4};
        System.out.println("찾을 숫자를 입력하세요");
        int target = scanner.nextInt();
        int idx = -1;

        System.out.println(a.length);

    }
}
