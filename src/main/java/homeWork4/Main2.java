package homeWork4;

public class Main2 {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "89213333333");
        phoneBook.add("Petrov", "89214444444");
        phoneBook.add("Sidorov", "89215555555");
        phoneBook.add("Petrov", "89216666666");
        phoneBook.add("Fedorov", "89217777777");

        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Ivanov"));
    }
}
