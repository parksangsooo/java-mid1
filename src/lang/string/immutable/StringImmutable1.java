package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");    // 받는 곳이 없어..?
        System.out.println("str = " + str);
    }
}
