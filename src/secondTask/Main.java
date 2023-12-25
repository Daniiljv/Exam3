package secondTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Put the first line - ");
        String firstLine = scanner.nextLine();

        System.out.print("Put the second line - ");
        String secondLine = scanner.nextLine();

        ArrayList<Integer> numbersOfFirstLine = new ArrayList<>();
        for (String s : firstLine.split("\\s")) {
            numbersOfFirstLine.add(Integer.parseInt(s));
        }

        ArrayList<Integer> numbersOfSecondLine = new ArrayList<>();
        for (String s : secondLine.split("\\s")) {
            numbersOfSecondLine.add(Integer.parseInt(s));
        }

        System.out.println(numbersOfFirstLine);
        System.out.println(numbersOfSecondLine);
    }
}
