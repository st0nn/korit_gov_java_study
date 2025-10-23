package _16_Class.Student;

public class StudentMain {
    static void main(String[] args) {
        Student student = new Student();
        student.name = "남영석";
        student.age = 25;
        student.email = "st0nn@naver.com";
        student.adress = "부산";

        student.showInfo();
        student.showInfo();
    }



}
