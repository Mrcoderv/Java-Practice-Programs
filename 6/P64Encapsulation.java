class R {
    private int value; // hiding data

    public void setValue(int x) {
        value = ++x;
    }

    public int getValue() {
        return ++value;
    }
}

class P64Encapsulation {
    public static void main(String[] args) {
        R r = new R();
        r.setValue(100);
        System.out.println(r.getValue());
    }
}