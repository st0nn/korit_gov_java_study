package _19_Interface.TvRemote;

public class _03_PowerBotton extends _02_Button {
    private boolean status;

    @Override
    public void onPressed() {
        if (status) {
            status = false;
            System.out.println("전원을 끕니다.");
        } else {
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }
}
