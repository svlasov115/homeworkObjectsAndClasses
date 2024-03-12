public class Main {
    public static void main(String[] args) {

        Author rowling = new Author("Джоан", "Роулинг");
        Author dostoevsky = new Author("Фёдор", "Достоевский");

        Book harryPotterAndTheGobletOfFire = new Book("Гарри Поттер и Кубок огня", rowling, 2003);
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevsky, 1866);

        print(harryPotterAndTheGobletOfFire);
        print(crimeAndPunishment);

        crimeAndPunishment.setPublishingYear(2024);
        print(crimeAndPunishment);
    }

    private static void print(Book book) {
        System.out.println(
                "Автор: " + book.getAuthor().getName() + " " + book.getAuthor().getSurname() +
                        ", название: " + book.getTitle() +", год публикации: " + book.getPublishingYear()
        );
    }

}