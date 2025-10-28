//package _20_Casting.Animal;
//
//public class Main {
//    static void main(String[] args) {
//        Dog dog1 = new Dog();
//        dog.speak();
//
//        Animals a = new Dog();
//        //a는 Animal 타입이지만 내부적으로 Dog의 객체
//        a.speak();
//        a.wagTail();
//
//        //다운캐스팅 (부모 -> 자식)
//        ((Dog)a).wagTail();
//
//        Animals a2 =dog;
//        Dog dog2 = (Dog) a2;
//        dog2.wagTail();
//
//
//        //다양한 자식들을 하나의 클래스타입으로 처리할 수 있다.
//        Dog dog3 = new Dog();
//        Dog dog4 = new Dog();
//        Dog dog5 = new Dog();
//        Dog[] dogs = {
//                dog3,
//                dog4,
//                dog5
//        };
//
//        Animals dog = new Dog();
//        Animals cat = new Dog();
//        Animals tiger = new Tiger();
//        Animals [] animals = {
//                dog,
//                cat,
//                tiger
//
//        };
//
////        for ( )
//
//    }
//}
