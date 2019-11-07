class Data {
    int x;
}

// ParameterTest2 클래스가 메모리에 로드되고, ParameterTest2 클래스의 main 메서드가 호출되면서
// 프로그램이 시작된다.
public class ParameterTest2 {
    public static void main(String[] args) {
        // Data 클래스가 메모리에 로드되고, Data 타입의 참조변수 d가 main 메서드의 지역변수로 생성된다.
        // Data 클래스의 인스턴스가 생성되고, 생성된 인스턴스의 주소가 참조변수 d에 저장된다.
        Data d = new Data();
        d.x = 10;
        // println 메서드를 호출해서 d.x의 값을 출력한다. (println 메서드의 수행내용은 생략했다.)
        System.out.println("main() : x = " + d.x); // main() : x = 10

        // change 메서드를 호출하면서 매개변수로 참조변수 d를 넘겨준다.
        change(d);

        System.out.println("After change(d)"); // After change(d)
        // println 메서드를 호출하여 d.x값을 출력한다.
        // d.x의 값은 1000이므로 "main() : x = 1000"을 출력한다.
        System.out.println("main() : x =" + d.x); // main() : x = 1000이 출력된다.
    }
    // main 메서드의 참조변수 d의 값(Data 인스턴스의 주소)은
    // change 메서드의 매개변수 d에 복사된다.
    static void change (Data d) {
        d.x = 1000;
        // println 메서드를 호출해서 d.x의 값을 출력한다.
        System.out.println("change() : x =" + d.x); // change() : x = 1000
    }
}
