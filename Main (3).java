package books;

class Book {
    private int bookId;
    private int accessionNumber;
    private String bookName;
    private String author;
    private String publication;

    public Book(int bookId, int accessionNumber, String bookName, String author, String publication) {
        this.bookId = bookId;
        this.accessionNumber = accessionNumber;
        this.bookName = bookName;
        this.author = author;
        this.publication = publication;
    }

    public int getBookId() {
        return bookId;
    }

    public int getAccessionNumber() {
        return accessionNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }
}

package journals;

class Journal {
    private int journalId;
    private String journalName;

    public Journal(int journalId, String journalName) {
        this.journalId = journalId;
        this.journalName = journalName;
    }

    public int getJournalId() {
        return journalId;
    }

    public String getJournalName() {
        return journalName;
    }
}

class Staff {
    private Book book;
    private Journal journal;

    public Staff(Book book, Journal journal) {
        this.book = book;
        this.journal = journal;
    }

    public void displayBookDetails() {
        System.out.println("Book Details for Staff:");
        System.out.println("Book ID: " + book.getBookId());
        System.out.println("Accession Number: " + book.getAccessionNumber());
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publication: " + book.getPublication());
    }

    public void displayJournalDetails() {
        System.out.println("\nJournal Details for Staff:");
        System.out.println("Journal ID: " + journal.getJournalId());
        System.out.println("Journal Name: " + journal.getJournalName());
    }
}

class Student {
    private Book book;
    private Journal journal;

    public Student(Book book, Journal journal) {
        this.book = book;
        this.journal = journal;
    }

    public void displayBookDetails() {
        System.out.println("\nBook Details for Student:");
        System.out.println("Book ID: " + book.getBookId());
        System.out.println("Accession Number: " + book.getAccessionNumber());
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publication: " + book.getPublication());
    }

    public void displayJournalDetails() {
        System.out.println("\nJournal Details for Student:");
        System.out.println("Journal ID: " + journal.getJournalId());
        System.out.println("Journal Name: " + journal.getJournalName());
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of books and journals
        Book book1 = new Book(1, 12345, "Book A", "Author A", "Publisher X");
        Journal journal1 = new Journal(101, "Journal of Science");

        // Create instances of staff and student
        Staff staff1 = new Staff(book1, journal1);
        Student student1 = new Student(book1, journal1);

        // Display book and journal details as requested by the user
        staff1.displayBookDetails();
        staff1.displayJournalDetails();

        student1.displayBookDetails();
        student1.displayJournalDetails();
    }
}

