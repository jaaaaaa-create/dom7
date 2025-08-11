//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author authorBuratino = new Author("Алексей", "Толстой");
        Book buratino = new Book("Буратино", authorBuratino.getNameAuthor()+" "+authorBuratino.getSurnameAuthor(), 2021);
        System.out.println("Название книги - "+buratino.getTitle()+ ", автор книги - "+ buratino.getAuthor()+ ", год выпуска - "+ buratino.getYearOfPublication());
        Author authorDubrovskiy = new Author("Алесандр", "Пушкин");
        Book dubrovskiy = new Book("Дубровский", authorDubrovskiy.getNameAuthor()+" "+authorDubrovskiy.getSurnameAuthor(), 1833);
        System.out.println("Название книги - "+dubrovskiy.getTitle()+ ", автор книги - "+ dubrovskiy.getAuthor()+ ", год выпуска - "+ dubrovskiy.getYearOfPublication());
    }
}