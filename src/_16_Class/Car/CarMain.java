package _16_Class.Car;

public class CarMain {

    static void main(String[] args) {
        Car audi = new Car("audi");
    }

    String carName;
    int carYearModel;
    String carColor;
    public void startcar(){
        System.out.println(carName+"이 시동을 겁니다");
    }

    public void drive(){
        System.out.println(carName+"이 전집합니다.");
    }

    public void showInfo(){
        System.out.println("자동차 이름은"+carName);
        System.out.println("자동차 연식은"+carYearModel);
        System.out.println("자동차 색상은"+carColor);
    }



}
