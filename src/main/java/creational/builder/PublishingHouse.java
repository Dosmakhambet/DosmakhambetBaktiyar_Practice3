package main.java.creational.builder;

public class PublishingHouse {
    private BookBuilder builder;

    public void setBuilder(BookBuilder builder){
        this.builder = builder;
    }

     public Book createBook(){
        builder.writeBook();
        builder.buildName();
        builder.buildAuthor();
        builder.buildYear();
        builder.buildPrice();

        return  builder.getBook();
    }
}
