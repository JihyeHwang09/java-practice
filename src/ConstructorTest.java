// 기본 생성자 예시
// 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
class Datal {
    int value;

    Data1() {} // 기본 생성자
}

class Data2 {
    int value;

    Data2(int x) { // 매개변수가 있는 생성자
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
//        Data1 d1 = new Data1();
//        Data2 d2 = new Data2(); // compile error 발생
    }

}
