import java.util.Scanner; 
public class leri {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Operator yang anda inginkan +,-,*,/");
        String Input = scanner.nextLine();
        if (Input.equals("+")) {
            System.out.println("Anda memilih operasi penjumlahan silahkan masukan angka!!");
            System.out.println("Masukan angka pertama anda :");
            int angkaPertama = scanner.nextInt();
            System.out.println("Masukan angka kedua anda :");
            int angkaKedua = scanner.nextInt();
            int hasil = angkaPertama + angkaKedua;
            System.out.println("hasil dari operasi anda adalah :"+hasil);
        } else if (Input.equals("-")) {
            System.out.println("Anda memilih operasi penjumlahan silahkan masukan angka!!");
            System.out.println("Masukan angka pertama anda :");
            int angkaPertama = scanner.nextInt();
            System.out.println("Masukan angka kedua anda :");
            int angkaKedua = scanner.nextInt();
            int hasil = angkaPertama - angkaKedua;
            System.out.println("hasil dari operasi anda adalah :"+hasil);
        } else if (Input.equals("*")) {
            System.out.println("Anda memilih operasi penjumlahan silahkan masukan angka!!");
            System.out.println("Masukan angka pertama anda :");
            int angkaPertama = scanner.nextInt();
            System.out.println("Masukan angka kedua anda :");
            int angkaKedua = scanner.nextInt();
            int hasil = angkaPertama * angkaKedua;
            System.out.println("hasil dari operasi anda adalah :"+hasil);
        } else if (Input.equals("/")) {
            System.out.println("Anda memilih operasi penjumlahan silahkan masukan angka!!");
            System.out.println("Masukan angka pertama anda :");
            int angkaPertama = scanner.nextInt();
            System.out.println("Masukan angka kedua anda :");
            int angkaKedua = scanner.nextInt();
            int hasil = angkaPertama / angkaKedua;
            System.out.println("hasil dari operasi anda adalah :"+hasil);
        } else {
            System.out.println("Maaf operator yang anda minta tidak ada!!");
        }
        scanner.close();
    }
}
