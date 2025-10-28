package _19_Interface.TvRemote;

public class _03_ChannelDownButton extends _02_Button {
    @Override
    public void onDown(){
        System.out.println("채널을 계속 내립니다.");
    }

    @Override
    public void onPressed() {
        System.out.println("채널을 내립니다.");
    }


}
