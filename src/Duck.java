// Base 클래스를 상속받은 Duck 클래스를 선언
public class Duck extends Base {
    @Override
    public void start() {
        System.out.println("Duck start!!");
    }
    @Override
    public void stop() {
        System.out.println("Duck stop!!");
    }
}