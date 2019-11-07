import java.util.Scanner;

public class DynamicBind {
    public static void main(String[] args) {
        System.out.println("Input No : [1. 강아지, 2. 야옹이 3. 오리]");

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        Base base = null;

        switch(no) {
            case 1:
                base = new Puppy();
                break;
            case 2:
                base = new Cat();
                break;
            case 3:
                base = new Duck();
                break;
        }
        base.start();
        base.stop();
    }
}
