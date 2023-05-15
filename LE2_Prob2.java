class Mother {
    public void show() {
        System.out.println("Hello World");
    }
}

class child extends Mother {
    public void show() {
        System.out.println("Hello JUET");
    }
}

public class Application {
    public static void main(String args[]) {
        Mother obj1 = new Mother();
        obj1.show();

        child obj2 = new child();
        obj2.show();

    }
}

/*
 * Make a function with the same return type , name of the function, number and
 * type of
 * arguments in the Child class as they are in the Mother class. Change the
 * string to be
 * displayed on the screen. For example, if Mother class version of show ( ) was
 * displaying
 * “Hello World” then the child class version of show ( ) will display “Hello
 * JUET”. Run the
 * application class and discuss the results obtained with your instructor.
 */