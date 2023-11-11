import javax.swing.*;

class Book {
    String title;
    String author;
    double price;
    String publisher;
    int stock;

    public Book(String title, String author, double price, String publisher, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.stock = stock;
    }

    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price + "\nPublisher: " + publisher + "\nStock: " + stock;
    }
}

class BookInventory {
    private static Book[] books = {
            new Book("Book1", "Author1", 20.0, "Publisher1", 5),
            new Book("Book2", "Author2", 25.0, "Publisher2", 10),
            // Add more books as needed
    };

    public static Book searchBook(String title, String author) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && book.author.equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public static boolean checkStock(Book book, int requestedCopies) {
        return book != null && book.stock >= requestedCopies;
    }

    public static double calculateCost(Book book, int requestedCopies) {
        return book.price * requestedCopies;
    }

    public static void sellBook(Book book, int requestedCopies) {
        book.stock -= requestedCopies;
    }
}

public class BookShopApplication {
    public static void main(String[] args) {
        String title = JOptionPane.showInputDialog("Enter the book title:");
        String author = JOptionPane.showInputDialog("Enter the author:");

        Book requestedBook = BookInventory.searchBook(title, author);

        if (requestedBook == null) {
            JOptionPane.showMessageDialog(null, "Book not found in the inventory.");
        } else {
            JOptionPane.showMessageDialog(null, requestedBook.toString());

            int requestedCopies = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of copies required:"));

            if (BookInventory.checkStock(requestedBook, requestedCopies)) {
                double totalCost = BookInventory.calculateCost(requestedBook, requestedCopies);
                JOptionPane.showMessageDialog(null, "Total Cost: $" + totalCost);
                BookInventory.sellBook(requestedBook, requestedCopies);
            } else {
                JOptionPane.showMessageDialog(null, "Required copies not in stock.");
            }
        }
    }
}