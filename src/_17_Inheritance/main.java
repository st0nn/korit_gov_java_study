package _17_Inheritance;

public class main {
    static void main(String[] args) {
//
//        Animal animal1 = new Animal(12, "호랑이");
//        animal1.move();
//        Tiger tiger = new Tiger(12, "호랭이", true);

        Human human1 = new Human(25, "남영석", "한국어");
        human1.getAnimalName();
        human1.move();
        human1.getAnimalAge();
        human1.read("크크루삥뽕");

        System.out.println();
        Message message = new Message("기본메세지");
        System.out.println(message.format());

        System.out.println();
        SimpleMessage simpleMessage = new SimpleMessage("심플메세지");
        System.out.println(simpleMessage.format());

        System.out.println();
        FancyMessage fancyMessage = new FancyMessage("팬시메세지");
        System.out.println(fancyMessage.format());
    }
}
