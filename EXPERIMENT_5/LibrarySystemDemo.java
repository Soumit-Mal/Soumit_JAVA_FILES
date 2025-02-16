class LibraryItem {
    protected String title, author;
    protected boolean isCheckedOut;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " checked out.");
        } else {
            System.out.println(title + " already checked out.");
        }
    }

    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }
}

class Book extends LibraryItem {
    public Book(String title, String author) {
        super(title, author);
    }
}

class DVD extends LibraryItem {
    public DVD(String title, String author) {
        super(title, author);
    }
}

class Journal extends LibraryItem {
    public Journal(String title, String author) {
        super(title, author);
    }
}

public class LibrarySystemDemo {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe");
        book.checkOut();
        book.returnItem();
    }
}
