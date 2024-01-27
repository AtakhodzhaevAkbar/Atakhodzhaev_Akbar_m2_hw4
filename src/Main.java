import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }
        System.out.println("Список A:");
        for (String element : listA) {
            System.out.println(element);
        }
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);
        }
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }
        System.out.println("Список C:");
        for (String element : listC) {
            System.out.println(element);
        }
        Collections.sort(listC, Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список C:");
        for (String element : listC) {
            System.out.println(element);
        }
    }
}
