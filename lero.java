import java.util.ArrayList;
import java.util.Scanner;
public class lero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Array = new ArrayList<>();
        for (int i=0;i<5;i++) {
            System.out.println("Tuliskan To-do list anda :");
            String input = scanner.nextLine();
            Array.add(input);
        }
        for ( int i=0;i< Array.size();i++) {
            System.out.println(i+"."+Array.get(i));
        }
        scanner.close();
    }
}
