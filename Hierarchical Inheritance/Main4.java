//Hierarchical Inheritance
class Animal {
    private String nama;

    public void setNama(String n) { nama = n; }
    public String getNama() { return nama; }

    public void makan() {
        System.out.println(getNama() + " sedang makan");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println(getNama() + " menggonggong");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println(getNama() + " mengeong");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setNama("Buddy");
        d.makan();
        d.bark();

        Cat c = new Cat();
        c.setNama("Kitty");
        c.makan();
        c.meow();
    }
}
