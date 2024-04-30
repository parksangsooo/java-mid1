package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1,str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3,str4));
    }

    private static boolean isSame(String x, String y){
        //return x == y;    // 인스턴스를 new String 으로 만들어서 올지, 리터럴로 만들어질지 모름.
        return x.equals(y); // 따라서 문자열 비교는 항상 equals() 를 사용해서 동등성 비교를 해야 함.
    }
}
