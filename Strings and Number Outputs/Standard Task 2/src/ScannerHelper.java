import java.util.Scanner;

public class ScannerHelper {
    static String getUserResponse(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
