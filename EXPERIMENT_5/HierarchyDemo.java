class BaseClass {
    public BaseClass() {
        System.out.println("BaseClass constructor called");
    }
}

class IntermediateClass extends BaseClass {
    public IntermediateClass() {
        super();
        System.out.println("IntermediateClass constructor called");
    }
}

class DerivedClass extends IntermediateClass {
    public DerivedClass() {
        super();
        System.out.println("DerivedClass constructor called");
    }
}

public class HierarchyDemo {
    public static void main(String[] args) {
        System.out.println("Creating DerivedClass object:");
        DerivedClass obj = new DerivedClass();
    }
}
