import java.util.Objects;

public class Actor extends Person {

    int height;

    enum gender {
        MALE,
        FEMALE;
    }

    public Actor(String name, String surname, int height) {
        super(name, surname);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{"
                + "Имя = " + name + ","
                + "Фамилия = " + surname + ", "
                + "Рост = " + "(" + height + ")" + "}";
    }

     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                (height == actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
