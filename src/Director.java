public class Director extends Person {

    int numberOfShows;

    enum gender {
        MALE,
        FEMALE;
    }

    public Director(String name, String surname, int numberOfShows) {
        super(name, surname);
        this.numberOfShows = numberOfShows;
    }


    @Override
    public String toString() {
        return "Director{"
                + "name ='" + name + ","
                + "surname ='" + surname + "} ";


    }
}
