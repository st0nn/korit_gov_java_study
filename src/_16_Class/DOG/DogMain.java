package _16_Class.DOG;

public class DogMain {

    static void main(String[] args) {
        // 객체 생성하는 방법
        Dog dog1 = new Dog(); //Dog 클래스를 가지고 dog1이라는 이름의 객체를 만듦

        //생성된 해당 객체 속성 값 대입
        dog1.name = "방울이";
        dog1.age = 3;
        dog1.dogType = "시고르자브종";

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.dogType);




    }
}
