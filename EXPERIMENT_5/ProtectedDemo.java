class Parent {
    protected String message = "Protected message";

    protected void displayMessage() {
        System.out.println(message);
    }
}

class Child extends Parent {
    public void show() {
        displayMessage();
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}
