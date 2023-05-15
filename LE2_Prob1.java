class Mother {
    int x;
    void show() {
        System.out.println("Satwik Shukla");
    }
}
class Child extends Mother {

}

public class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show();

        Child ch = new Child();
        ch.show();
    }
}