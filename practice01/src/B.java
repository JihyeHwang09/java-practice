class B {
    public void show () {
        System.out.println("저는 B 클래스입니다.");
    }
}

class A extends B {
    public void show () {
        System.out.println("저는 A 클래스입니다.");
    }
}

class Main {
    public static void main(String args[]) {
        A a = new A();
        a.show(); // "저는 A 클래스입니다."
    }
}

