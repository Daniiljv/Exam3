package secondTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Put the first line - ");
        String firstLine = scanner.nextLine();

        System.out.print("Put the second line - ");
        String secondLine = scanner.nextLine();

        String[] line1 = firstLine.split(" ");
        String[] line2 = secondLine.split(" ");

        HashSet<String> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(line1));
        numbers.addAll(Arrays.asList(line2));

        System.out.println(numbers);



    }
}
