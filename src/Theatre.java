import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        // System.out.println("Поехали!");
        ArrayList<Actor> actors = new ArrayList<>();

        Actor Brad = new Actor("Брэд", "Питт", 180);
        Actor Leo = new Actor("Леонардо", "Ди Каприо", 185);
        Actor Tom = new Actor("Том", "Круз", 170);

        Director Kris = new Director("Кристофер", "Нолан", 10);
        Director Nikita = new Director("Никита", "Михалков", 15);

        Person musicAuthor = new Person("Людовико","Эйнауди");
        Person choreographer = new Person("Иван", "Иванов");

        Show classic = new Show("Классический", 60, "Барабанов", new ArrayList<>());
        Opera opera = new Opera("Опера", 100, "Петров", new ArrayList<>(), musicAuthor,
                "Текст либретто", 20);

        Ballet ballet = new Ballet("Балет", 120, "Жуков", new ArrayList<>(), musicAuthor,
                "Текст либретто балет", choreographer);

        System.out.println("----------------");

        System.out.println("Добавление актеров в спектакли");

        classic.addActor(Brad);
        classic.addActor(Leo);
        opera.addActor(Leo);
        opera.addActor(Brad);
        ballet.addActor(Tom);
        ballet.addActor(Brad);

        System.out.println("----------------");

        System.out.println("Вывести список актеров");

        System.out.println("Классический");
        classic.printActors();
        System.out.println("Опера");
        opera.printActors();
        System.out.println("Балет");
        ballet.printActors();

        System.out.println("----------------");

        System.out.println("Вывод замены актера");


        System.out.println("Заменяем Брэда Питта на Тома Круза в классическом спектакле:");
        classic.replaceActor(Tom, Brad);
        classic.printActors();

        System.out.println("----------------");

        System.out.println("Замена несуществующего актера");
        Actor fakeActor = new Actor("Несуществующий", "Актёр", 160);
        opera.replaceActor(Leo, fakeActor);

        System.out.println("----------------");

        System.out.println("Вывод Либретто Опера + балет");
        ballet.getLibrettoText();
        opera.getLibrettoText();
    }
}
