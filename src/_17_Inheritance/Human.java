package _17_Inheritance;
    //1. Animal 클래스를 상속 받을것 v
    //2. 고유 필드 속성으로 language 라는 속성 추가 v
public class Human extends Animal{
        String lang = "한국어";

        public Human(int animalAge, String animalName, String lang) {
            super(animalAge, animalName);
            this.lang = lang;
        }

        //setter들을 사용해서 각 속성의 값을 주입
        public void setLang(String lang) {
        this.lang = lang;
    }

    //getAnimalName을 재정의하여 호출했을 때 "안녕하세요, 제 이름은 ~~입니다"라고 출력할 수 있도록 코드를 작성
    @Override
    public String getAnimalName() {
        System.out.println("안녕하세요, 제 이름은 "+super.getAnimalName()+"입니다.");
        return super.getAnimalName();
    }

    //getAnimalAge을 재정의하여 호출했을 때
    //"올해 제 나이는 ~~살 입니다. 내년에는 ~~ +1살이 됩니다." 출력
    @Override
    public int getAnimalAge() {
        System.out.println("올해 제나이는 "+super.getAnimalAge()+"살 입니다. 내년에는 "+(super.getAnimalAge()+1)+"살이 됩니다.");
        return super.getAnimalAge();
    }

    //move를 재정의 하여 사람이 두발로 걷습니다. 라고 재정의
    @Override
        public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }

    //    * 고유 메소드로 read()선언하는데 파라미터롤 bookName을 받음
    //    * 호툴 시 파라미터로 받은 bookName을 읽는 중 입니다. 출력
    public void read(String bookName){
        System.out.println(bookName+"을 읽는 중입니다.");
    }
}
