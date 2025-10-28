package _18_Abstraction;

public class main {
    static void main(String[] args){

        Factory factory = new Factory() {
            @Override
            public void produce(String model) {
            }

            @Override
            public void manage(String model) {
            }
        };

        PhoneFactory phoneFactory2 = new PhoneFactory();
        phoneFactory2.setFactoryName("삼성공장");
        phoneFactory2.produce("갤럭시S25");

        TabletFactory tabletFactory2 = new TabletFactory();
        tabletFactory2.setFactoryName("애플 공장");
        tabletFactory2.produce("아이패드 미니 6세대");
        tabletFactory2.upgrade("아이패드 미니 7세대");


        // ? 얘는 개발용 임시인지?
        // ? 얘를 선언하려면 메소드를 무조건 오버라이드 하는 것 인지?



    }


}
