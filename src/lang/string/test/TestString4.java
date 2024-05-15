package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String substring1 = str.substring(0, 5);
        String substring2 = str.substring(5);
        System.out.println("filename = " + substring1);
        System.out.println("extName = " + substring2);

    }
}
