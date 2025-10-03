class Animal {
    private int umur;

    public void setUmur(int u) { if(u>=0) umur=u; }
    public int getUmur() { return umur; }

    public void makan() {
        System.out.println("Animal sedang makan");
    }
}

class Mammal extends Animal {
    public void melahirkan() {
        System.out.println("Mammal melahirkan anaknya");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog menggonggong");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setUmur(5);
        System.out.println("Umur: " + d.getUmur());
        d.makan();
        d.melahirkan();
        d.bark();
    }
}