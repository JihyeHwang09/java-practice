// 한개의 자바 파일 안에 이너클래스가 아닌 여러개의 클래스가 존재할수 있다.
// 단, Public으로 선언된 클래스가 한개만 존재해야 하며 파일 이름은 Public으로 선언된 클래스 이름과 같아야 한다.
class CardTest {
//  1.  CardTest클래스의 main메서드가 호출되면서 프로그램이 시작된다.
    public static void main(String args[]) {
        // 3. Card 인스턴스가 생성되고, 멤버변수인 kind와 number가 기본값인 null과 0으로 각각 초기화 된다.
        // 생성된 인스턴스의 주소가 참조변수 c1에 저장된다.
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        // 인스턴스 c1과 c2의 값을 화면에 출력한다.
        // 참조변수는 인스턴스의 주소를 갖고 있고,
        // 모든 인스턴스는 자신을 생성한 클래스의 주소를 갖고 있다.
        // -> 참조변수를 사용해서도 클래스변수에 접근할 수 있다.
        System.out.println("c1은 "+ c1.kind + "," + c1.height + "이며, " +
                "크기는 (" + c1.width + "," + c2.height + ")");
        System.out.println("c2은 "+ c2.kind + "," + c2.height + "이며, " +
                "크기는 (" + c2.width + "," + c2.height + ")");
//        c1은 Heart,250이며, 크기는 (100,250)
//        c2은 Spade,250이며, 크기는 (100,250)

        // 클래스 변수 c1.width와 c1.height의 값을 각각 50, 80으로 변경한다.
        c1.width = 50;
        c1.height = 80;
        // 인스턴스 c1과 c2의 값을 화면에 출력한다.
        // 인스턴스 c1과 c2는 클래스변수 widith와 height을 공유하므로 같은 값이 출력된다.
        System.out.println("c1은 "+ c1.kind + "," + c1.height + "이며, " +
                "크기는 (" + c1.width + "," + c2.height + ")");
        System.out.println("c2은 "+ c2.kind + "," + c2.height + "이며, " +
                "크기는 (" + c2.width + "," + c2.height + ")");
//        c1은 Heart,80이며, 크기는 (50,80)
//        c2은 Spade,80이며, 크기는 (50,80)

    }
}

// 2. Card클래스의 인스턴스를 생성하기 위해 먼저 Card 클래스가 메모리에 로드된다.
// 이 때, Card 클래스의 클래스 변수인 width와 height가 메모리에 생성되고 각각 100, 250으로 초기화 된다.
class Card {
//  클래스 영역
    /* 인스턴스 변수
     : 인스턴스가 생성될 때마다 생성된다.
     -> 인스턴스마다 각기 다른 값을 가질 수 있다.
     */
    String kind; // 무늬
    int number; // 숫자
    /* 클래스 변수
     : 모든 인스턴스가 하나의 저장공간을 공유한다.
     항상 공통된 값을 갖는다.
    */
    static int width = 100; // 폭
    static int height = 250; // 높이
}