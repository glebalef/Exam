
import java.util.*;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        // инфорамция для проверки
        List<User> list = new ArrayList<User>();

        User vasya = new User("vasya", 20);
        User petya = new User("petya", 71);
        User sveta = new User("sveta", 18);
        User sveta2 = new User("sveta", 18);
        User vladimir = new User("vladimir", 55);

        list.add(vasya);
        list.add(petya);
        list.add(sveta2);
        list.add(sveta);
        list.add(vladimir);

        findOldestUser(list);

        System.out.println(findOldestUser(list));
    }

    // сам метод задачи
    public static User findOldestUser (Collection<User> users) {

        return users.stream()
                .sorted(Comparator.comparing(User::getAge).thenComparing(User::getName))
                .distinct()
                .max(Comparator.comparing(User::getAge))
                .orElse(null);
    }

}