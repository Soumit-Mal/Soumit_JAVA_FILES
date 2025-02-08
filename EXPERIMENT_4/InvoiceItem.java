class InvoiceItem {
    String id, desc;
    int qty;
    double price;
    InvoiceItem(String i, String d, int q, double p) {
        id = i;
        desc = d;
        qty = q;
        price = p;
    }
    double total() {
        return qty * price;
    }
    double discount(double d) {
        return total() * (1 - d / 100);
    }
    double tax(double t) {
        return total() * (1 + t / 100);
    }
    void print() {
        System.out.println("ID: " + id + "\nDesc: " + desc + "\nQty: " + qty + "\nPrice: " + price);
        System.out.println("Total: " + total());
    }
    public static void main(String[] args) {
        InvoiceItem i = new InvoiceItem("101", "Laptop", 2, 50000);
        i.print();
        System.out.println("After 10% discount: " + i.discount(10));
        System.out.println("After 18% tax: " + i.tax(18));
    }
}
