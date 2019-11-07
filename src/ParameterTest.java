class Data {
    int x;
}
// 1. ParameterTest 클래스가 메모리에 로드되고,
class ParameterTest {
// ParameterTest 클래스의 main 메서드가 호출되면서 프로그램이 시작된다.
    public static void main(String[] args) {
    // 2. Data 클래스가 메모리에 로드되고, Data 타입의 참조변수 d가 main 메서드의 지역변수로 생성된다.
    // Data 클래스의 인스턴스가 생성되고, 생성된 인스턴스의 주소가 참조변수 d에 저장된다.
        Data d = new Data();
        d.x = 10;
        // println 메서드를 호출해서 d.x의 값을 출력한다. (println 메서드의 수행 내용은 생략한다.)
        System.out.println("main() : x = " + d.x); // "main() : x = 10
        // chagne 메서드를 호출하면서 매개변수로 참조변수 d가 가리키고 있는 인스턴스의 멤버변수 d.x의 값을 넘겨준다.
        // d.x의 값인 10이 change의 매개변수 x에 복사된다.
        change(d.x);
        // change 메서드의 수행이 끝났으므로 change메서드가 사용하던 공간은 호출스택에서 제거되고
        // 다시 main 메서드로 돌아가 change를 호출한 다음 문장이 수행된다.  
        System.out.println("After change(d.x)"); // After change(d.x)
        //println 메서드를 호출하여 d.x의 값을 출력한다.
        // d.x의 값은 10이므로 "main() : x = 10"을 출력한다.                             
        System.out.println("main() : x = "+ d.x ); // main() : x = 10


    }
        static void change(int x) {
        // change 메서드의 지역변수 x에 1000을 저장한다.
        // x의 값이 10에서 1000으로 변경된다.
        x = 1000;
        // println 메서드를 호출하여 x값을 출력한다.
        // x의 값을 출력한다. x의 값인 1000이 출력된다.  
        System.out.println("change() : x = " + x); // change() : x = 1000
    }

}
