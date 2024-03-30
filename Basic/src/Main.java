public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        pattern2();
        pattern1();
    }

    public static void pattern1() {
        for(int i = 0; i < 5; i++) {
            System.out.print("----");
        }
    }
    public static void pattern2() {
        for(int i = 0; i < 5; i++) {
            System.out.print("*");
        }
    }
    public static void pattern3() {
        for(int i = 0; i < 5; i++) {
            System.out.print("########");
        }
    }
}