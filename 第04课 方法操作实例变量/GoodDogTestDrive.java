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
        GoodDog[] dog = new GoodDog[2];
        dog[0] = new GoodDog();
        dog[1] = new GoodDog();
        dog[0].setSize(20);
        dog[1].setSize(40);
        System.out.println("Dog one: " + dog[0].getSize());
        System.out.println("Dog two: " + dog[1].getSize());
        dog[0].bark();
        dog[1].bark();
    }
}