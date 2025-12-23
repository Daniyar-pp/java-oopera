public class Person {
    String name;
    String surname;

    enum gender {
        MALE,
        FEMALE;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }
}

