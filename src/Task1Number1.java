import java.util.Scanner;
public class Task1Number1 {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner (System.in);
        System.out.println("������� ���� ���:");
        String userInputName = userInputScanner.nextLine();
        System.out.print("������, " + userInputName + "!");
    }
}
