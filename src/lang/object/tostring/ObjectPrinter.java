package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object object){    //  인수 전달
        String string = "객체정보 출력: "+ object.toString();
        System.out.println(string);
    }
}
