public class PrintServis {
    public void print(Person[] people) {
        System.out.println("Размер списка" + people.length);
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя " + person.getName() + "; Возраст " + person.getAge() + "; Телефон " + person.getPhone());
        }
        System.out.println();
    }

    public void print(Customer[] customers) {
        System.out.println("Списк покупателей крупы " + customers.length);
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println("Имя " + customer.getName()
                    + "; Возраст " + customer.getAge()
                    + "; Телефон " + customer.getPhone()
                    + "; Номер карты " + customer.getCardNumber());
        }
        System.out.println();
    }

    public void print(Gamers[] gamers) {
        System.out.println("Список геймеров " + gamers.length);
        for (int i = 0; i < gamers.length; i++) {
            Gamers gamer = gamers[i];
            System.out.println("Имя " + gamer.getName()
                    + "; Возраст " + gamer.getAge()
                    + "; Телефон " + gamer.getPhone()
                    + "; Номер карты " + gamer.getPlatform());
        }
        System.out.println();
    }
}