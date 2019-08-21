/*public class Foo {
    static int x;

    public void go() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.go();
    }
}可以编译*/
/*public class Foo {
    int x;

    public static void go() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.go();
    }
}静态方法不能使用非静态常量*/
/*public class Foo {
    final int x;

    public void go() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.go();
    }
}x并未赋值*/
/*public class Foo {
    static final int x = 12;

    public void go() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.go();
    }
}*/
/*public class Foo {
    static final int x = 12;

    public void go(final int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.go(1);
    }
}*/
public class Foo {
    int x = 12;

    public static void go(final int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.go(1);
    }
}