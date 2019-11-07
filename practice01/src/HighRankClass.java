/*
상속
객체지향 언어에서 물려받는다는 개념보다는 재사용+확장의 의미로 생각하는 게 더 편할 수 있다.

상속의 특징
- 하위 클래스에서 상위 클래스를 상속받고자 한다면, 클래스 정의 후 extends 사용
- 하위 클래스는 여러 개의 상위 클래스를 상속받을 수 없음 (다중 상속 허용 X)
- 하위 클래스는 상위 클래스의 내용을 재사용이 가능하고 내용을 확장시킬 수 있음
- 상위 클래스는 여러 개의 하위 클래스를 가질 수 있음
- 상위 클래스와 하위 클래스에 같은 이름의 멤버 변수나 메서드가 존재할 경우,
상위 클래스의 내용은 감춰진다.
 */


class HighRankClass {
    public int num = 10;
    public static String st = "Static!!";

    // show 메서드는 하위 클래스에서 재사용
    public  void show () {
        System.out.println("하위 클래스에서 재사용 가능");
    }

    public void show2 () {
        System.out.println("상위 클래스 내용");
    }
}

class LowRankClass1 extends HighRankClass {

    public  void show2 () {
        // super.show2("하위 클래스2의 내용");
        System.out.println("하위 클래스1의 내용");
    }

    public void show3 () {
        System.out.println("class1의 확장된 내용 입니다.");
    }
}

class LowRankClass2 extends  HighRankClass {
    public void show2 () {
        System.out.println("하위 클래스2의 내용");
    }
    public  void show3 () {
        System.out.println("class2의 확장된 내용 입니다.");
    }
}


class Main {
    public static void main (String args[]) {
        LowRankClass1 class1 = new LowRankClass1();
        LowRankClass2 class2 = new LowRankClass2();

        // 재사용
        class1.show();
        class2.show();

        System.out.println(class1.num); // 10
        System.out.println(class2.num); // 10

        System.out.println(class1.st); // "Static!!"
        System.out.println(class2.st); // "Static!!"

        //상위 클래스 내용 가려짐
        class1.show2(); //  "하위 클래스1의 내용"
        class2.show2(); // "하위 클래스2의 내용"

        //확장
        class1.show3(); // "class1의 확장된 내용 입니다."
        class2.show3(); // "class2의 확장된 내용 입니다."
    }
}


















