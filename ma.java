import java.util.Scanner;
public class ma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan indentitas anda :");
        String InputText=scanner.nextLine();
        if (InputText.equals("Rizki")) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("apakah kabar mu baik?? "+InputText);
            String Ma = scanner2.nextLine();
            if ( Ma.equals("Baik")) {
                System.out.println("senang mendengarnya!!!");
            } else {
                System.out.println("yahh semoga kamu baik baik saja");
            }
            scanner.close();
        } else if ( InputText.equals("rizki")) {
            for ( int i=0;i<10;i++) {
                System.out.println("Haii "+InputText);
            }
        } else {
            System.out.println("anda siapa??");
        }
        scanner.close();
    }
}
