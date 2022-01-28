package homeWork4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    HashMap<String, ArrayList<String>> numbers = new HashMap<>();

    public PhoneBook() {
    }

    public void add(String surname, String number) {
        if (!numbers.containsKey(surname)) {
            ArrayList<String> listOfNumbers = new ArrayList<>();
            listOfNumbers.add(number);
            numbers.put(surname, listOfNumbers);
        } else {
            numbers.get(surname).add(number);
        }
    }

    public ArrayList<String> get(String surname) {
        return numbers.get(surname);
    }
}
