package _19_Interface.Zookeeper;

public class Lion extends Animal implements Predetor{
    @Override
    public String getFood() {
        return "바나나";
    }
}
