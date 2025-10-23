package _16_Class.WaterBottle;

//WaterBottle 패키지를 만들고
//WaterBottle 클래스
//currentWater 뮬의 양 => 속성

public class Waterbottle {
    private int currentWater;

    Waterbottle(int water){
        System.out.println("물이 채워졌습니다. 물통 총량은 1000, 현재 잔량은 "+currentWater+"입니다.");
        currentWater = water;
        System.out.println();
    }

    public int drink(int drink) {
        if ((currentWater + drink) < 1000) {
            System.out.println("허용량을 초과했습니다.");
        } else {
            currentWater = -drink;
            System.out.println("현재 남은 물의 양은 " + currentWater + "입니다.");
        }
        return currentWater;

    }


    public int getCurrentWater() {
        return currentWater;
    }

    public int fill(int fill){
        if (1000<fill) {
            System.out.println("현재 용량보다 초과해서 마실 수 없습니다.");
        } else {
            System.out.println("현재 남은 물의 양은 " + currentWater + "입니다.");
            currentWater =+ fill;

        }
        return currentWater;
    }
}
