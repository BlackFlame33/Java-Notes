class Dog {
    int size;
    String breed;
    String name;
    void bark(){
        System.out.print("Ruff!Ruff!");
    }
}
class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}