package Homework12;

public class Book {
    private String bookName;
    private Author author;
    private int publishYear;

    public Book(String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    @Override
    public String toString() {
        return author + ", книга: " + bookName + " , год публикации: " + publishYear;
    }
}
