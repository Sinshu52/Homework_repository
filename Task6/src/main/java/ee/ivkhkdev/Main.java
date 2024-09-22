package ee.ivkhkdev;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Alex z");
        Author author2 = new Author("Andrey Asd");
        Author author3 = new Author("Oleg Nik");
        Author author4 = new Author("Lena Asqq");
        Author author5 = new Author("Dmitry Qwe");

        Book book1 = new Book("Book 1", new Author[]{author1, author2});
        Book book2 = new Book("Book 2", new Author[]{author3});
        Book book3 = new Book("Book 3", new Author[]{author4, author5});
        Book book4 = new Book("Book 4", new Author[]{author1, author3, author5});
        Book book5 = new Book("Book 5", new Author[]{author2, author4});

        Book[] books = new Book[]{book1, book2, book3, book4, book5};

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
