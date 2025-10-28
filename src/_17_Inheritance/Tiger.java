package _17_Inheritance;

//Animal 에게 상속받아 Animal의 속성을 그대로 받은 상태
// 이때 부모클래스에는 없는 속성을 따로 추가할 수 있다.

public class Tiger extends Animal{
    private boolean isStriped;
    // 세터

    public void setStriped(boolean striped) {
        isStriped = striped;
    }
    // 게터
    public boolean isStriped() {
        return isStriped;
    }

    // 따라서 부모에게 있는 속성만 getter/setter가 있음
    // 그러므로 자식클래스에서 추가한 필드 속성도 getter/setter를 만들어 줘야 한다.
    // 고유 필드 속성을 대입하기 전에 부모의 속성을 먼저 생성자 호출 해야 함.

    // 부모클래스 생성자
    public Tiger(int animalAge, String animalName, boolean isStriped) {
        super(animalAge, animalName);
    }


    /*
     어노테이션(시그니쳐), 코드에 붙이는 꼬리표
     코드를 읽고 컴퓨터가 이해하도록 어노테이션을 달아주면 컴퓨터가 어노테잇ㄴ을 보고 인식함
    */

    // 오버라이딩
    @Override
    public void move(){
        System.out.println("호랑이가 움직입니다.");
    }

    public void hunt() {
        System.out.println(getAnimalName()+"가 사냥을 합니다.");
    }
    /*getAnimalName() 가.super가 필요 없는 이유,
    * 상속을 했을때 메소드를 호출 시 탐색에는 순서가 있음
    * 자식 클래스에서 해당 메소드가 없다면 부모 클래스에서 찾음.
    * */


}
