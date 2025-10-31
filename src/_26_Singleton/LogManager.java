package _26_Singleton;

public class LogManager {
    private static LogManager instance;
    //유일한 인스턴스를 담는 정적 변수
    //객체 생성 없이 인스턴스를 담아두는 공간

    //생성자를 막아서 외부에서 객체 생성 막기
    private LogManager() {}


    public static LogManager getInstance() {
        if (instance==null) {
            System.out.println("객체생성됨");
            instance = new LogManager();
        }
        return instance;
    }

//    public void log(String message)
}
