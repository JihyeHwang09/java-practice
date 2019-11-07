import java.util.Vector;

public class InitTest {
    int x; // 인스턴스 변수
    int y = x; // 인스턴스 변수

    void method() {
        int i; // 지역 변수
        int j = i; // 컴파일 에러! 지역 변수를 초기화하지 않고 사용했음
    }




}


