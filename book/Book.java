package inventory;

public class Book implements Comparable<Book>{
    static long nextNO = 100000000L;
    final int bookID;
    String title;
    String author;
    long ISBN;
    int genre;
    int publicationYear;
    double price;
    int quantity;

    public Book(String title, String author, int genre, int publicationYear, double price, int quantity) {
        if(title == null || author == null || genre < 0 || publicationYear < 0
                || price < 0 || quantity < 0) throw new IllegalArgumentException();
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.price = price;
        this.quantity = quantity;

        int result = ComputeISBN.computeISBN10(nextNO);

        while(result == 10) {
            nextNO++;
            result = ComputeISBN.computeISBN10(nextNO);
        }


        this.ISBN = 10 * nextNO + result;
        this.bookID = (int)nextNO;
        nextNO++;
    }

    @Override
    public int compareTo(Book book) {
        return this.bookID - book.bookID;
    }

    @Override
    public String toString() {
        return String.format("Book(ID: %d, ISBN-10:%d, Title:%s, Author:%s, genre:%d, Publication-Year: %d, Price: %.2f, Quantity: %d \n",bookID,ISBN,title,author,genre,publicationYear,price,quantity);
    }


}
