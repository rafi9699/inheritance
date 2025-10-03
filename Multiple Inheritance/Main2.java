//Multiple Inheritance
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    private int data;

    public void setData(int d) { data = d; }
    public int getData() { return data; }

    public void methodA() {
        System.out.println("Method A dengan data: " + data);
    }

    public void methodB() {
        System.out.println("Method B dengan data: " + data);
    }
}

public class Main2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.setData(100);
        obj.methodA();
        obj.methodB();
    }
}
