// Base 클래스를 상속받은 Puppy 클래스를 선언
public class Puppy extends Base {
    @Override
    public void start() {
        System.out.println("Puppy start!!");
    }
    @Override
    public void stop() {
        System.out.println("Puppy stop!!");
    }
}