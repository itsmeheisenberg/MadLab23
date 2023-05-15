class Mother {
    public static void show() {
        System.out.println("Hello Mother");
    }
}

class child extends Mother {
    public static void show() {
        System.out.println("Hello Child");
    }
}

public class ApplicationI {
    public static void main(String args[]) throws Exception {
        // new child().show();
        Mother m1 = new child();
        m1.show();
    }
}
