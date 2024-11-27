public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Федор", "Достоевский");

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println("Книга 1: " + book1.getTitle() + ", автор: " + book1.getAuthor().getFullName() + ", год: " + book1.getYear());
        System.out.println("Книга 2: " + book2.getTitle() + ", автор: " + book2.getAuthor().getFullName() + ", год: " + book2.getYear());

        book1.setYear(1873);

        System.out.println("Обновленный год публикации книги 1: " + book1.getYear());

        System.out.println("Книга 1 в строковом формате: " + book1);
        System.out.println("Книга 2 в строковом формате: " + book2);

        System.out.println("Авторы равны? " + author1.equals(author2));
        System.out.println("Книги равны? " + book1.equals(book2));

        System.out.println("Хэш-код автора 1: " + author1.hashCode());
        System.out.println("Хэш-код автора 2: " + author2.hashCode());
        System.out.println("Хэш-код книги 1: " + book1.hashCode());
        System.out.println("Хэш-код книги 2: " + book2.hashCode());
    }
}