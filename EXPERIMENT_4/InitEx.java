class InitEx {
    int x;
    int y;

    InitEx() { 
        this(0, 0); 
    }

    InitEx(int x, int y) { 
        this.x = x; 
        this.y = y; 
    }

    void print() { 
        System.out.println("x: " + x + ", y: " + y); 
    }

    public static void main(String[] args) {
        InitEx obj1 = new InitEx();
        obj1.print();

        InitEx obj2 = new InitEx(5, 10);
        obj2.print();
    }
}
