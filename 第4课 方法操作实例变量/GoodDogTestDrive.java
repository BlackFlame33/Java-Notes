class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        if (s > 50) {
            System.out.println("It's too big!");
            size = s - 50;
        } else {
            size = s;
        }
    }

    void bark() {
        if (size > 60) {
            System.out.println("Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff!");
        } else {
            System.out.println("Yip!");
        }
    }
}

class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();
    }
}