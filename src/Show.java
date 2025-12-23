import java.util.ArrayList;

public class Show {
    String title; // название
    int duration; // длительность в минутах
    String director;
    ArrayList<Actor> listOfActors; // список актеров

    public Show(String title, int duration, String director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public boolean addActor(Actor actor) {
        if (actor == null) {
            System.out.println("Некорректный актер");
            return false;
        }
        if (listOfActors.contains(actor)) {
            System.out.println("Актер " + actor.name + " " + actor.surname + " уже добавлен в спектакль");
            return false;
        }
        listOfActors.add(actor);
        System.out.println("Актер добавлен");
        return true;
    }

    public boolean replaceActor(Actor newActor, Actor oldActor) {
        if (newActor == null || oldActor == null) {
            return false;
        }

        int index = listOfActors.indexOf(oldActor);

        if (index == -1) {
            System.out.println("Актер " + oldActor.name + " " + oldActor.surname + " не найден в спектакле");
            return false;
        }

        if (listOfActors.contains(newActor) && newActor != oldActor) {
            System.out.println("Актер " + newActor.name + " " + newActor.surname + " уже есть в спектакле");
            return false;
        }

        listOfActors.set(index, newActor);
        System.out.println("Актер " + oldActor.name + " " + oldActor.surname +
                " заменен на " + newActor.name + " " + newActor.surname);
        return true;
    }

}