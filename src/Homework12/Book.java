package Homework12;

public class Book {
    private String bookName;
    private int publishYear;

    public Book(String bookName,int publishYear) {
        this.bookName = bookName;
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
}
