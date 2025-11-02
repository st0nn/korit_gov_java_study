package _28_Wildcard;


/*
* 하한 경계 와일드 카드
* 하위 클래스 제한 (U와 그 부모클래스들만 가능)
* 하한 U
* 쓰기는 가능하나 읽기가 안전하지 않다
* */
public class LowerBounded {
    public static void inspect(Box<? super Animal> box) {
        box.setValue(new Dog());
        box.setValue(new Animal());
    }
}
