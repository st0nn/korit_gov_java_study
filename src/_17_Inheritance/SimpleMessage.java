package _17_Inheritance;

//     * 클래스 SimpleMessage => Message 상속
public class SimpleMessage extends Message {

    //     * 부모필드 생성자사용해서 객체 생성하도록
    public SimpleMessage(String text) {
        super(text);
    }

    //     * 메소드 makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능하도록
    //     * ===> "[SIMPLE] " 반환하도록 재정의

    @Override
    protected String makePreFix(){
        return "[SIMPLE]";
    }

    //     * 메소드 format() => 모두 접근 가능
    //     * ===> return 접두사로 "[SIMPLE] "가 붙고 중간에는 "내용: ", 뒤에는 메세지 텍스트가 붙어서 리턴
    //     * ex) [SIMPLE] 내용: 가나다라마바사
    @Override
    public String format(){
        return makePreFix() + "내용: " + super.getText();
    }






}
