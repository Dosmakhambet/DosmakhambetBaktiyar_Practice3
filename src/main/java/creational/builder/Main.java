package main.java.creational.builder;

public class Main {
    public static void main(String args[]){
        PublishingHouse publishingHouse = new PublishingHouse();

        publishingHouse.setBuilder(new OnePieceBook());

        Book book = publishingHouse.createBook();

        System.out.print(book);
    }
}
