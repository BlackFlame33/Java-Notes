public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}

/*
 * Exception in thread"main" java.lang.NullPointerException at
 * TestBox.go(TestBox.java:11)TestBox.java:11 at TestBox.main(TestBox.java:7)
 * 没有初始值
 */