package inventory;

import java.util.Arrays;

public class BookStore {
    String bookStoreName;
    Book[] bookarr;
    int count;

    public BookStore(String bookStoreName) {
        if(bookStoreName.isBlank()) throw new IllegalArgumentException();
        if(bookarr == null) bookarr = new Book[2];
        this.bookStoreName = bookStoreName;
    }

    public boolean addBook(Book book) {
        if(book == null) throw new IllegalArgumentException();
        if(bookarr.length == count) {
            bookarr = Arrays.copyOf(bookarr, bookarr.length+1);
        }
        for(int i=0; i<=count; i++) {
            if(bookarr[i] == null) {
                bookarr[count++] = book;
                return true;
            }
        }
        return false;
    }

//    public int sellBook(Book book, int quantity) {
////        if(book == null || quantity < 1) return -1;
////        if(book.quantity >= quantity) {
////            return book.quantity -= quantity;
////        }
////        return -1;
//    }

    public int sellBook(int id, int quantity) {
        if(id < 1 || quantity < 1) return -1;
        for(int i=0; i<count; i++) {
            if(bookarr[i].bookID == id) {
                if(bookarr[i].quantity >= quantity) {
                    return bookarr[i].quantity -= quantity;
                }
            }
        }
        return -1;
    }

//    public boolean restock(Book book, int restockQuantity) {
//        if(book == null || restockQuantity < 0) return false;
//        book.quantity += restockQuantity;
//        return true;
//    }

    public int restock(int id, int restockQuantity) {
        for(int i=0; i<count; i++) {
            if(bookarr[i].bookID == id) {
                return bookarr[i].quantity += restockQuantity;
            }
        }
        return -1;
    }

    public Book removeById(int id) {
        if(id < 1) return null;
        for(int i=0; i<count; i++) {
            if(bookarr[i].bookID == id) {
                var temp = bookarr[i];
                bookarr[i] = bookarr[--count];
                bookarr[count] = null;
                return temp;
            }
        }
        return null;
    }

    public Book removeByTitle(String title) {
        if(title.isBlank()) return null;
        for(int i=0; i<count; i++) {
            if(bookarr[i].title.equals(title)) {
                var temp = bookarr[i];
                bookarr[i] = bookarr[--count];
                bookarr[count] = null;
                return temp;
            }
        }
        return null;
    }

    public Book removeByAuthor(String author) {
        if(author.isBlank()) return null;
        for(int i=0; i<count; i++) {
            if(bookarr[i].author.equals(author)) {
                var temp = bookarr[i];
                bookarr[i] = bookarr[--count];
                bookarr[count] = null;
                return temp;
            }
        }
        return null;
    }

    public boolean updateBook(Book book, String filter ,String value) {
        if(book ==  null || value.isBlank()) return false;
        switch (filter.toLowerCase()) {
            case "title" -> book.title = value;
            case "author" -> book.author = value;
            case "genre" -> book.genre = Integer.parseInt(value);
            case "publicationyear" -> book.publicationYear = Integer.parseInt(value);
            case "price" -> book.price = Double.parseDouble(value);
        }
        return true;
    }

    public boolean updateBook(Book book, String title, String author, int genre, int publicationYear, double price) {
        if(book != null) {
            if(title != null) book.title = title;
            if(author != null) book.author = author;
            if(genre > 0) book.genre = genre;
            if(publicationYear > 0) book.publicationYear = publicationYear;
            if(price > 0) book.price = price;
            return true;
        }
        return false;
    }

    public String search(String value) {
        for(int i=0; i<count; i++) {
            if(bookarr[i].title.equals(value)
                    || bookarr[i].author.equals(value)
                    || String.valueOf(bookarr[i].genre).equals(value)
                    || String.valueOf(bookarr[i].ISBN).equals(value)
                    || String.valueOf(bookarr[i].publicationYear).equals(value)) {
                return bookarr[i].toString();
            }
        }
        return null;
    }

    public String display(String filter, String value) {
        if(filter.isBlank() || value.isBlank()) return null;
        Book[] displayBooks = new Book[1];
        int cout = 0;
        for(int i=0; i<count; i++) {
            if(displayBooks.length == cout) {
                displayBooks = Arrays.copyOf(displayBooks, displayBooks.length+1);
            }
            switch (filter.toLowerCase()) {
                case "author" -> {
                    if (bookarr[i].author.equals(value)) {
                        displayBooks[cout++] = bookarr[i];
                    }
                }
                case "genre" -> {
                    if (bookarr[i].genre == Integer.parseInt(value)) {
                        displayBooks[cout++] = bookarr[i];
                    }
                }
                case "title" -> {
                    if (bookarr[i].title.equals(value)) {
                        displayBooks[cout++] = bookarr[i];
                    }
                }
                case "publicationyear" -> {
                    if (bookarr[i].publicationYear == Integer.parseInt(value)) {
                        displayBooks[cout++] = bookarr[i];
                    }
                }
            }
        }
        return Arrays.toString(displayBooks);
    }


    public boolean removeOutOfStock() {
        for(int i=0; i<count; i++) {
            if(bookarr[i].quantity == 0) {
                bookarr[i] = bookarr[--count];
                bookarr[count] = null;
            }
        }
        return false;
    }


    public Book replace(Book oldBook, NewBook newBook) {
        if(oldBook == null || newBook == null) return null;
        oldBook.title = newBook.title;
        oldBook.author = newBook.author;
        oldBook.publicationYear = newBook.publicationYear;
        oldBook.price = newBook.price;
        return oldBook;
    }

    public boolean merge() {
        for(int i=0; i<count; i++) {
            for(int j=0; j<count; j++) {
                if( bookarr[i].title.equals(bookarr[j].title) && bookarr[i].quantity == bookarr[j].quantity) {
                    bookarr[i].quantity += bookarr[j].quantity;
                }
            }
        }
        return false;
    }

    @Override public String toString() {
        return Arrays.toString(bookarr);
    }

}
