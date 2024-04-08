public class Book {
    String name;
    String author_name;
    int published_year;
    String genre;
    int price;
    Book(String name,String author_name,int published_year,String genre){
        this.name=name;
        this.author_name=author_name;
        this.published_year=published_year;
        this.genre=genre;

    }
    public void bookInfo(){
        System.out.println("My favourite book is "+name);
        System.out.println("Its author name is "+author_name);
        System.out.println("Its published in "+published_year);
        System.out.println("and genre is  "+genre);
        System.out.println("and price "+price );
    }
    public static void main (String[] args)
    {
        Book book = new Book("Good to great","Jim Collins",2023,"Non fiction");
        book.bookInfo();
        Book book2 = new Book("Harry Porter","James peter",1999,"Fiction");
        book2.bookInfo();
        Book book3 = new Book("Dark red","Jimmy ", 1980,"Fiction");
        book3.bookInfo();

    }


}
