package _17_Inheritance;

public class Animal {
    private String animalName;
    private int animalAge;

//    public Animal() {
//    }

    //AllArgs 생성
    public Animal(int animalAge, String animalName) {
        this.animalAge = animalAge;
        this.animalName = animalName;
    }

    //getter
    public String getAnimalName() {
        return animalName;
    }
    public int getAnimalAge() {
        return animalAge;
    }

    // setter 생성
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    // 메서드로 move만들기, => 움직입니다
    public void move() {
        // 부모클래스인 Animal 클래스의 move()메소드를 사용
        move();
    }
}