package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        /*
        String 은 클래스다. 기본형(int, boolean, double ... )이 아니라 참조형이다.
        따라서 Str1 변수에는 String 인스턴스의 참조값(x001) 만 들어갈 수있다.
         */
        String str1 = "hello";      // 참조값만 들어가는데 이건 뭔가 좀 어색한데? 객체를 생성해야 하는거 아님? new..
        // 자바에서 문자열은 많이 쓰기 때문에 알아서 `new String()' 을 넣어주는거임.
        String str2 = new String("goodbye");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
