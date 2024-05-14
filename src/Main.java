import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку чисел через запятую");
        String lineNumber = scanner.nextLine();
        Set<Integer> numbersSet = new HashSet<>();
        String[] numbersArray = lineNumber.split(",\\s*");

        for (String numberStr : numbersArray) {
            int number = Integer.parseInt(numberStr);
            numbersSet.add(number);
        }

        System.out.println("Результат:");
        for (int num : numbersSet) {
            System.out.print(num + " ");
        }
    }
}