package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);    // 반환 값을 꼭 받아야 함.

        System.out.println("obj1 = " + obj1.getVal());
    }
}
