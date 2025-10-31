package _25_LayeredArchitecture.view;

import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.entity.User;

import java.util.Scanner;



public class TodoListView {
    private Scanner scanner;
    private User principal;

    public TodoListView() {
        scanner = new Scanner(System.in);
    }

    public void homeView() {
        while (true) {
            System.out.println(" [ Todoist ] ");
            System.out.println(" [ 1. Todoist 관리 ] ");
            if (principal == null) {
                System.out.println(" [ 2. 회원가입 ] ");
                System.out.println(" [ 3. 로그인 ] ");
            } else {
                System.out.println(" [ 2. 로그아웃 ] ");
            }
            System.out.println(" [ q. ㅍ로그램 정료 ] ");
            System.out.println(" [ >>> ] ");
            String cmd = scanner.nextLine();

            if("q".equals(cmd)){
                break;
            } else if ("1".equals(cmd)){
                // To-do리스트 꽌리
                if (principal == null) {
                    System.out.println("로그인 후 사용가능합니다");
                    continue;
                }
            } else if ("2".equals(cmd) && principal == null ){
                // 회원가입
            } else if ("2".equals(cmd) && principal != null ){
                // 로그아웃
            } else if ("3".equals(cmd) && principal == null){
                // 로그인
            } else {
                System.out.println("메뉴룰 다시 선택해 주세요");
            }
        }
    }

    public void signupView() {
        System.out.println(" [ 회원가입 ] ");
//        String username = null;

        //중복확인
        String username = null;
        while (true) {
            System.out.print("username >> ");
            username = scanner.nextLine();
            if (false) { //중복이 되지 않았을떄
                break;
            }

        }
        System.out.print("username >> ");
        String username = scanner.nextLine();

        System.out.print("username >> ");
        String password = scanner.nextLine();

        System.out.print("username >> ");
        String name = scanner.nextLine();

        SignupReqDto signupReqDto = new SignupReqDto(username, password,name);
        //userService의 회원가입 로직에 signupReqDto 전달
    }



}
