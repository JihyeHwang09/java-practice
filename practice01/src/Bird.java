public class Bird {
    public String name;
    // static(정적) 변수는 클래스 영역으로 메모리 공간 중에 static 영역에 할당 된다.
    // -> 모든 해당 클래스의 인스턴스는 같은 변수를 참조할 수 있게 된다.
    public static int countofwing;

    public void fly () {
        System.out.println(name + countofwing + "날다");
    }
}



class BirdTest {
    public static void main(String[] args) {
        Bird Pizon = new Bird();
        Pizon.name = "피존";
        Pizon.countofwing = 2;

        Pizon.fly();
        Pizon = null;

    }
}