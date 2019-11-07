// - 같은 클래스의 멤버간에는 객체생성이나 참조변수 없이 참조할 수 있다.
//- But, static 멤버들은 인스턴스멤버들을 참조할 수 없다.
public class TestClass2 {
    int iv; // 인스턴스 변수
    static int cv; // 클래스 변수

    void instanceMethod() { // 인스턴스 메서드
        System.out.println(iv); // 인스턴스 메서드
        System.out.println(cv); // 클래스 변수를 사용할 수 있다.
    }

    static void staticMethod() { // static 메서드
        System.out.println(iv); // 에러!
        System.out.println(cv);  // 클래스 변수를 사용할 수 있다.
    }
}
