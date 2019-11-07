/*
## 다운캐스팅 (DOWNCASTING)
> 업캐스팅이 되었던 객체 참조 변수가 원래의 형으로 되돌아오는 것
 */
public class DownCastingTest {
    public static void main(String args[]) {
        Top top = new Bottom();
        //상위 클래스 타입에 하위 클래스 인스턴스 대입
        top.show(); // 하위 클래스에서 호출 됩니다.
        top.show2(); // 추상 메서드 재정의!!

        // 다운 캐스팅
        // 상위 클래스 타입인 top을 하위 클래스 타입인 Bottom으로 다운캐스팅하고 있다.
        // bottom은 하위 클래스 타입이므로 하위 클래스에서 구현한 show3()메서드를 호출하는데 문제가 발생하지 않는다.
        Bottom bottom = (Bottom) top;
        bottom.show3(); // show3() 호출
    }
}
abstract class Top {
    public void show () {
        System.out.println("상위 클래스에서 호출 됩니다.");
    }
    public abstract void show2();
}

class Bottom extends Top {
    public void show() {
        System.out.println("하위 클래스에서 호출 됩니다.");
    }

    public void show2() {
        System.out.println("추상 메서드 재정의!!");
    }

    public void show3() {
        System.out.println("show3() 호출");
    }
}
/*

 */