// Base 클래스를 상속받은 Cat 클래스를 선언
public class Cat extends Base {
    @Override
    public void start() {
        System.out.println("Cat start!!");
    }
    @Override
    public void stop() {
        System.out.println("Cat stop!!");
    }
}