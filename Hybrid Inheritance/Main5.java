interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Mammal implements Animal {
    private int umur;

    public void setUmur(int u) { umur = u; }
    public int getUmur() { return umur; }

    public void eat() {
        System.out.println("Mammal sedang makan");
    }

    public void walk() {
        System.out.println("Mammal berjalan");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog menggonggong");
    }
}

class Eagle implements Animal, Bird {
    public void eat() {
        System.out.println("Eagle makan daging");
    }
    public void fly() {
        System.out.println("Eagle terbang tinggi");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setUmur(3);
        System.out.println("Umur Dog: " + d.getUmur());
        d.eat();
        d.walk();
        d.bark();

        Eagle e = new Eagle();
        e.eat();
        e.fly();
    }
}