package _17_Inheritance;

//     * Message라는 클래스 생성
public class Message {
    //     * 속성으로는 String text
    String text;

    //     * Allargs 생성자
    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //     * 메소드 String 반환 makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능하도록
    //     *  ===>return "[MSG] "
    protected String makePreFix(){
        return "[MSG]";
    }

    //     * 메소드 String 반환 format() => 모두 접근 가능
    //     *  ===> return 접두사로 "[MSG] "가 붙고 뒤에는 메세지 텍스트가 붙어서 리턴
    public String format(){
        return makePreFix() + text;
    }

    //     * 메소드 void print() => 모두 접근 가능
    //     *  ===> format()을 호출한 값 출력
    public void print(){
        System.out.println(format());
    }



}
