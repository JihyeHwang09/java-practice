import java.util.Scanner;

public class Staticind {
    public static void main(String[] args) {
        System.out.println("Input No: [1. 강아지, 2. 야옹이 3. 오리]");

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        switch (no) {
            case 1:
                Puppy p = new Puppy();
                p.start();
                p.start();
                break;

            case 2:
                Cat c = new Cat();
                c.start();
                c.start();
                break;

            case 3:
                Duck d = new Duck();
                d.start();
                d.start();
                break;
        }
    }
}
