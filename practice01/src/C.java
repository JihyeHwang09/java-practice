class C {
    public void show () {
        System.out.println("인자가 없는 메서드 호출");
    }

    public void show (int a) {
        System.out.println(a + "인자를 받아서 호출된 메서드");
    }

    public  void show (int a, int b) {
        System.out.println(a+ "와" + b + "를 받아서 호출된 메서드") ;
    }
}

class Main {
    public static void main (String args[]) {
        C c = new C();
        c.show();
        c.show(1);
        c.show(1, 2);
    }
}
