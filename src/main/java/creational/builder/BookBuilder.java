package main.java.creational.builder;

public abstract class BookBuilder {

    Book book;

    public void writeBook(){
        book = new Book();
    }

    public abstract void buildName();
    public abstract void buildAuthor();
    public abstract void buildPrice();
    public abstract void buildYear();

    public Book getBook(){
        return book;
    }
}
