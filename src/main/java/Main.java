import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        // napisz swój program tutaj. Do wczytywania danych użyj przekazanego w parametrze scannera
        List<Integer> numberList = new ArrayList<>();
        readNumbers(scanner, numberList);
        if (numberList.size() > 0) {
            printReversedList(numberList);
            printSum(numberList);
            printMinNumber(numberList);
            printMaxNumber(numberList);
        }
    }

    private void printMaxNumber(List<Integer> numberList) {
        int minNumber = numberList.get(0);
        for (Integer integer : numberList) {
            if (integer < minNumber) {
                minNumber = integer;
            }
        }
        System.out.print("Najmniejsza liczba w liście to ");
        System.out.println(minNumber);
    }

    private void printMinNumber(List<Integer> numberList) {
        int maxNumber = numberList.get(0);
        for (Integer integer : numberList) {
            if (integer > maxNumber) {
                maxNumber = integer;
            }
        }
        System.out.print("Największa liczba w liście to ");
        System.out.println(maxNumber);
    }

    private void printSum(List<Integer> numberList) {
        int sum = 0;
        for (int i = 0; i < numberList.size(); i++) {
            sum = sum + numberList.get(i);
            System.out.print(numberList.get(i));
            if (i < numberList.size() - 1) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + sum);
        System.out.println();
    }

    private void printReversedList(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void readNumbers(Scanner scanner, List<Integer> numberList) {
        int input;
        do {
            input = scanner.nextInt();
            if (input >= 0) {
                numberList.add(input);
            }
        } while (input >= 0);
    }
}
