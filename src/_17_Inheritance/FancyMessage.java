package _17_Inheritance;

//     * 클래스 FancyMessage => Message 상속
public class FancyMessage extends Message {

    //     * * 부모필드 생성자사용해서 객체 생성하도록
    public FancyMessage(String text) {
        super(text);
    }

    //     * 메소드 makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능하도록
    @Override
    protected String makePreFix() {
        return "[FANCY]";
    }

    @Override
    public String format(){
        return makePreFix() + "내용: " +"★"+ super.getText()+"★";
    }


//     * ===> "[FANCY] " 반환하도록 재정의
//     * 메소드 format() => 모두 접근 가능
//     * ===> return 접두사로 "[FANCY] "가 붙고 중간에는 "★ ",
//     * 뒤에는 메세지 텍스트가 붙고 끝에 " ★"로 끝남
//     * ex) [FANCY] ★ 가나다라마바사 ★
//     * */


}
