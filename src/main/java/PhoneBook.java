import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }
        phoneBook.get(surname).add(number);
    }

    public List<String> get(String surname) {
        List<String> numbers = phoneBook.get(surname);
        if (numbers == null || numbers.isEmpty()) {
            System.out.println("Человека с такой фамилией нет в телефонной книге");
            return Collections.emptyList();
        }
        return numbers;
    }
}
