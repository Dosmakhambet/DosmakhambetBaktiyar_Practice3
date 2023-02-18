package main.java.creational.builder;

public class OnePieceBook extends BookBuilder{
    @Override
    public void buildName() {
        book.setName("One Piece");
    }

    @Override
    public void buildAuthor() {
        book.setAuthor("Oda Eiichiro");
    }

    @Override
    public void buildPrice() {
        book.setPrice(200);
    }

    @Override
    public void buildYear() {
        book.setYear("1995");
    }
}
