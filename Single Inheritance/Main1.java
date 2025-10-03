//Single Inheritance
class animal {
    private String nama;

    public void setNama(String n) { nama = n; }
    public String getNama() { return nama; }

    public void makan() {
        System.out.println(getNama() + " sedang makan.");
    }
}

class Dog extends animal {
    public String ras;
    public void bark() {
        System.out.println(getNama() + " (" + ras + ") menggonggong!");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setNama("Buddy");
        d.ras = "Bulldog";
        d.makan();
        d.bark();
    }
}