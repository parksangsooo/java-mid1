package lang.immutable.change;

public class ImmutableObj {
    private final int val;

    public ImmutableObj(int val) {
        this.val = val;
    }

    public ImmutableObj add(int addval){
        int result = val + addval;
        return new ImmutableObj(result);
    }

    public int getVal() {
        return val;
    }
}
