package Homework12;

public class Main {
    public static void main(String[] args) {
        Author garrison = new Author("Гарри", "Гаррисон");
        Book deathWorld = new Book("Мир Смерти", garrison, 1960);
        System.out.println(deathWorld.getBookName() + ", " + garrison.getName() + " " + garrison.getSurname() + ", " + deathWorld.getPublishYear());
        Author sheckley = new Author("Роберт", "Шекли");
        Book theOdorOfThought = new Book("Запах Мысли", sheckley, 1953);
        System.out.println(theOdorOfThought.getBookName() + ", " + sheckley.getName() + " " + sheckley.getSurname() + ", " + theOdorOfThought.getPublishYear());
        theOdorOfThought.setPublishYear(1955);
        System.out.println(theOdorOfThought.getBookName() + ", " + sheckley.getName() + " " + sheckley.getSurname() + ", " + theOdorOfThought.getPublishYear());
        Author zahn = new Author("Тимоти", "Зан");
        Book theBlackCollar = new Book("Чёрный Спецназ", zahn, 1983);
        System.out.println(theBlackCollar.getBookName() + ", " + zahn.getName() + " " + zahn.getSurname() + ", " + theBlackCollar.getPublishYear());
    }
}
