import java.util.Scanner;
public class fungsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di kalkulator silahkan pilih operasi mu:+,-,/*");
        String user = scanner.nextLine();
        if (user.equals("+")) {
            penjumlahan11.ma11();
        } else if (user.equals("-")) {
            pengurangan11.mi11();
        }else if (user.equals("/")) {
            pembagian11.mu11();
        }else if (user.equals("*")) {
            perkalian11.me11();
        }

        scanner.close();
    }
    public class penjumlahan11 {
        public static void ma11() {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Masukan angka pertama mu :");
            Integer angka1 = scanner1.nextInt();
            System.out.println("Masukan angka kedua anda :");
            Integer angka2 = scanner1.nextInt();
            Integer hasil = angka1 + angka2;
            System.out.println(hasil);
            scanner1.close();
        }
    }
    public class pengurangan11 {
        public static void mi11() {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Masukan angka pertama mu :");
            Integer angka1 = scanner1.nextInt();
            System.out.println("Masukan angka kedua anda :");
            Integer angka2 = scanner1.nextInt();
            Integer hasil = angka1 - angka2;
            System.out.println(hasil);
            scanner1.close();
        }
    }
    public class pembagian11 {
        public static void mu11() {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Masukan angka pertama mu :");
            Integer angka1 = scanner1.nextInt();
            System.out.println("Masukan angka kedua anda :");
            Integer angka2 = scanner1.nextInt();
            Integer hasil = angka1 / angka2;
            System.out.println(hasil);
            scanner1.close();
        }
    }
    public class perkalian11 {
        public static void me11() {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Masukan angka pertama mu :");
            Integer angka1 = scanner1.nextInt();
            System.out.println("Masukan angka kedua anda :");
            Integer angka2 = scanner1.nextInt();
            Integer hasil = angka1 * angka2;
            System.out.println(hasil);
            scanner1.close();
        }
    }
}