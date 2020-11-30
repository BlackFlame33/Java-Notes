class Dog {
    int size;
    String name;

    void bark(int numOfBark) {
        while (numOfBark > 0) {
            if (size > 60) {
                System.out.println("Wooof!");
            } else if (size > 14) {
                System.out.println("Ruff!");
            } else {
                System.out.println("Yip!");
            }
            numOfBark = numOfBark - 1;
        }
    }

    int mySize(int mySize) {
        return mySize;
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;
        one.bark(3);
        two.bark(4);
        three.bark(5);
        System.out.println("My size is " + one.mySize(306));
    }
}