package _21_Objecs;

public class Main {
    static void main(String[] args) {
        Teacher teacher =  new Teacher("남영석", "국비");
        System.out.println(teacher.toString());

        Teacher teacher2 =  new Teacher("박화목", "웹개발");

        System.out.println(teacher);
        System.out.println(teacher.equals(teacher2));
        System.out.println(teacher.hashCode());
        System.out.println(teacher2.hashCode());


    }
}
