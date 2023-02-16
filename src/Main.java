import javax.print.PrintService;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Sarah", 23, 234),
                new Person("Djon", 22, 255),
                new Person("Luda", 27, 259),
                new Person("Anton", 45, 245),
                new Person("Maks", 18, 2343),
                new Person("Goga", 12, 23124),

        };

        Customer[] customers = {
                new Customer("Sarah", 23, 234, 345345345),
                new Customer("Djon", 22, 255, 345345),
                new Customer("Luda", 27, 259, 345345345),
                new Customer("Anton", 45, 245, 345345345),
        };
        Gamers [] gamers = {
                new Gamers("Goga", 12, 23124,"PS"),
                new Gamers("Maks", 18, 2343, "PS")
        };

        PrintServis printServis = new PrintServis();
        printServis.print(people);
        printServis.print(customers);
        printServis.print(gamers);

    }
}