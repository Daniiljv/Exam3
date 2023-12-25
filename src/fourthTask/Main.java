package fourthTask;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String,String> dictionary = new HashMap<>();

        dictionary.put("Table", "Стул");
        dictionary.put("House", "Дом");
        dictionary.put("Mouse", "Мышь");
        dictionary.put("Horse", "Лошадь");
        dictionary.put("Tennis", "Теннис");

        System.out.println("Put the word in english - ");
        String word = scanner.nextLine();

        if(dictionary.containsKey(word)){
            System.out.println(dictionary.containsValue(word));
        }
        else{
            System.out.println("There is no word like this");
        }
        }
    }

