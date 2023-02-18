package main.java.creational.builder;

public class HarryPotterBook extends BookBuilder{
    @Override
    public void buildName() {
        book.setName("HarryPotter");
    }

    @Override
    public void buildAuthor() {
        book.setAuthor("Joanne Rowling");
    }

    @Override
    public void buildPrice() {
        book.setPrice(100);
    }

    @Override
    public void buildYear() {
        book.setYear("2000");
    }
}
