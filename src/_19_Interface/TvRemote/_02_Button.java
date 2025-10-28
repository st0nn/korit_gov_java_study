package _19_Interface.TvRemote;

public abstract class _02_Button implements _01_Press, _01_Up, _01_Down {

    @Override
    public void onDown(){
    }

    @Override
    public abstract void onPressed();

    @Override
    public void onUp(){
    }
}
