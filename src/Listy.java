import java.util.Arrays;
import java.util.List;

public class Listy {
    public static void main(String... args) {
        List<String> imiona = imiona();

        System.out.println(" >>> Wyświetl tu listę imion za pomocą pętli for <<< ");
    }

    private static List<Integer> liczby() {
        return Arrays.asList(1, 2, 3, 10, 5, 6, 12, 23, 99, 20);
    }

    private static List<String> imiona() {
        return Arrays.asList("Grzegorz", "Anna", "Vladimir", "Donald", "Zenon", "Hiacynta");
    }
}
