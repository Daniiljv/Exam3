package thirdTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Daniil", 18);
        User user2 = new User("Altai", 17);
        User user3 = new User("Azim", 16);
        User user4 = new User("Tima", 19);
        User user5 = new User("Uluk", 20);

        ArrayList<User>  listOfUsers = new ArrayList<>();

        listOfUsers.add(user1);
        listOfUsers.add(user2);
        listOfUsers.add(user3);
        listOfUsers.add(user4);
        listOfUsers.add(user5);

        TreeSet<String> names = new TreeSet<>();
        TreeSet<Integer> ages = new TreeSet<>();


    for(User u : listOfUsers){
            names.add(u.getName());
            ages.add(u.getAge());
        }

        System.out.println(names);
        System.out.println(ages);





    }
}
