package Homework12;

public class Main {
    public static void main(String[] args) {
        Author garrison = new Author("Гарри", "Гаррисон");
        Book deathWorld = new Book("Мир Смерти", garrison, 1960);
        System.out.println(deathWorld);
        Author sheckley = new Author("Роберт", "Шекли");
        Book theOdorOfThought = new Book("Запах Мысли", sheckley, 1953);
        System.out.println(theOdorOfThought);
        theOdorOfThought.setPublishYear(1955);
        System.out.println(theOdorOfThought);
        Author zahn = new Author("Тимоти", "Зан");
        Book theBlackCollar = new Book("Чёрный Спецназ", zahn, 1983);
        System.out.println(theBlackCollar);
        Book theBlackCollar1 = new Book("Чёрный Спецназ", zahn, 1983);
        System.out.println(theBlackCollar1.equals(theBlackCollar));
        System.out.println(theBlackCollar1.equals(theOdorOfThought));
        System.out.println(theBlackCollar.hashCode());
    }

}
