public class Main {

    public static void main(String[] args) {
        Book books = new Book("It", 2015);
        System.out.println("books =" + books.name);
        System.out.println("books =" + books.year);


        Author author = new Author("Vadim Bakumets");
        System.out.println("author =" + author.nameAuthor);

    }

}