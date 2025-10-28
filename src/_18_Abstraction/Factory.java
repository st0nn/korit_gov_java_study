package _18_Abstraction;

public abstract class Factory {
    private String factoryName;

    //추상 메소드
    public abstract void produce(String model);
    public abstract void manage(String model);

    //세터
    public String getFactoryName() {
        return factoryName;
    }

    //게터
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public void displayInfo() {

    }
}
