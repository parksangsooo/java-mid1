package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat(" java");    // return 참조값 받는 곳 필요
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
    }
}
