package _29_Collections.TodoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {



/*
문제 TodoList
1. todoList를 담을 리스트 생성
2. 사용자한테 투두를 입력받을건데 몇개 입력할건지 count변수에 입력받기
3. count만큼 반복해서 사용자에세 투두 입력받아 리스트에 추가

4. 그 다음 향상된 for문을 사용해서 할일 목록 쭉 출력

5. 특정 투두를 포함여부를 확인하기 위해서 searchTodo라는 변수에 찾을 투두 입력받고 포함여부 확인 후 여부 출력
6. 포함여부 확인 후 삭제할 투두를 입력받아 삭제
7. 투두들을 오름차순차순 정렬 후 전체출력
8. 이번엔 투두들을 내림차순 정렬 후 전체출력
9. 전체 투두들의 갯수 툴력하기
*/
        int count = 0;
        String searchTodo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("몇번 실행할지 입력해주세요");

        count = scanner.nextInt();
        scanner.nextLine();


        System.out.println("데이터를 입력해주세요");
        List<String> todoList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            todoList.add(scanner.nextLine());
            System.out.println(i + 1 + "번째 입력 완료");
            if (i == (count - 1)) {
                System.out.println("입력이 완료되었습니다.");
                System.out.println(todoList);
            }
        }

        System.out.println("찾을 값을 입력햊세요");
        searchTodo = scanner.nextLine();


    }
}
