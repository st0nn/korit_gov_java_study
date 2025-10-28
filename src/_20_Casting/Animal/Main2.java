package _20_Casting.Animal;

public class Main2 {
    static void main(String[] args) {
        Dog dog1 = new Dog();
        Animals animal1 = new Animals();

        // instanceof
        // 객체 > instanceof > 클래스 (boolean)
        boolean result1 = animal1 instanceof Animals;
        System.out.println(result1); //true (animal1은 ANimals 클래스의 객체가 맞음)

        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2); //true (animal1은 ANimals 클래스의 객체가 아님)

        // 확인하고자 하는 객체의 해당 클래스의 인스턴스(객체) 인지
        // 자식 클래스의 인스턴스인지 확인

        Animals animal2 = new Dog();


    }
}
