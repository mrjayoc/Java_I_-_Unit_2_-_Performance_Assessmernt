public class Task {
  public static void main(String[] args) {
    System.out.println("Welcome to the room area calculator. Please give me your room's length and width");
    String lengthAsString = ScannerHelper.getUserResponse("Length: ");
    String widthAsString = ScannerHelper.getUserResponse("Width:");
  }
}