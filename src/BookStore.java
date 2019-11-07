public class BookStore {
    public void superprint() {
        System.out.println("가져다 쓰세요");
    }
}

class Web extends BookStore {
    @Override
    public void superprint() {
        System.out.println("Web이다");
    }
}

class Java extends BookStore{
    public static void main(String[] args) {
        Java j1 = new Java();
        Web w1 = new Web();
        BookStore[] book = new BookStore[2];



    }
}