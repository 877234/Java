import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Asisten1 {

    public static void main(String[] args) {
        try (Scanner scanner1 = new Scanner(System.in)) {
            System.out.println("Haii Selamat datang di virtual Asisten Miki :)");
            while (true) {
                System.out.println("Silahkan pilih kembali :\n1)Kalkulator\n2)To-do list\n3)Kalkulator Suhu\n4)Kalkulator BMI\n5)Tebak Angka\n6)Kertas batu gunting");
                String user = scanner1.nextLine();
                if (user.equals("1")) {
                    System.out.println("Selamat datang di kalkulator Miki:) Masukan Operator yang anda inginkan +,-,*,/:");
                    String user1 = scanner1.nextLine();
                    if (user1.equals("+")) {
                        System.out.println("Silahkan masukan angka pertama anda :");
                        int angka1 = scanner1.nextInt();
                        System.out.println("Silahkan masukan angka kedua anda :");
                        int angka2 = scanner1.nextInt();
                        int hasil = angka1 + angka2;
                        System.out.println("hasilnya adalah :" + hasil);
                        System.out.println("Terimakasih sudah menggunakan kalkulator Miki :)");
                    } else if (user1.equals("-")) {
                        System.out.println("Silahkan masukan angka pertama anda :");
                        int angka1 = scanner1.nextInt();
                        System.out.println("Silahkan masukan angka kedua anda :");
                        int angka2 = scanner1.nextInt();
                        int hasil = angka1 - angka2;
                        System.out.println("hasilnya adalah :" + hasil);
                        System.out.println("Terimakasih sudah menggunakan kalkulator Miki :)");
                    } else if (user1.equals("*")) {
                        System.out.println("Silahkan masukan angka pertama anda :");
                        int angka1 = scanner1.nextInt();
                        System.out.println("Silahkan masukan angka kedua anda :");
                        int angka2 = scanner1.nextInt();
                        int hasil = angka1 * angka2;
                        System.out.println("hasilnya adalah :" + hasil);
                        System.out.println("Terimakasih sudah menggunakan kalkulator Miki :)");
                    } else if (user1.equals("/")) {
                        System.out.println("Silahkan masukan angka pertama anda :");
                        int angka1 = scanner1.nextInt();
                        System.out.println("Silahkan masukan angka kedua anda :");
                        int angka2 = scanner1.nextInt();
                        int hasil = angka1 / angka2;
                        System.out.println("hasilnya adalah :" + hasil);
                        System.out.println("Terimakasih sudah menggunakan kalkulator Miki :)");
                    } else {
                        System.out.println("Terimakasih sudah menggunakan kalkulator Miki :)");
                    }
                } else if (user.equals("2")) {
                    System.out.println("Selamat datang di To-do list Miki :) silahkan apa saja yang ingin kamu catat :");
                    ArrayList<String> Array1 = new ArrayList<>();
                    for (int i = 0; i < 6; i++) {
                        String input = scanner1.nextLine();
                        Array1.add(input);
                    }
                    for (int i = 1; i < Array1.size(); i++) {
                        System.out.println(i + "." + Array1.get(i));
                    }
                } else if (user.equals("3")) {
                    System.out.println("Selamat datang di kalkulator suhu Miki :) Silahkan Pilih opsi mu :\n1)Celcius\n2)Fahreinhet"); 
                    String user1 = scanner1.nextLine();
                    if (user1.equals("1")) {
                        System.out.println("Selamat datang di kalkulator Celcius masukan suhumu!!:");
                        double suhu = scanner1.nextInt();
                        double fahre = (suhu * 9/5 ) + 32;
                        System.out.println("Suhu mu jika di fahreinhet adalah :"+fahre);
                    }else if (user1.equals("2")) {
                        System.out.println("Selamat datang di kalkulator Fahreinhet masukan suhumu!!:");
                        double fahre = scanner1.nextInt();
                        double suhu = 9/5 * (fahre - 32);
                        System.out.println("Suhu jika di celcius adalah :"+suhu);
                    }
                }else if (user.equals("4")) {
                    System.out.println("Selamat datang di kalkulator BMI Miki *harus centimeter yaaa:) ");
                    System.out.println("Silahkan masukann tinggi badanmu :");
                    double tinggi = scanner1.nextDouble();
                    System.out.println("Silahkan masukan berat badan mu :");
                    double berat = scanner1.nextDouble();
                    double hasil = berat /  tinggi;
                    System.out.println("BMI kamu adalah :"+hasil);
                }else if (user.equals("5")) {
                    while (true) {
                        Random angka = new Random();
                    System.out.println("Haii selamat datang di game tebak angka  silahkan masukan angka mu!! :");
                    int tabek = scanner1.nextInt();
                    int tebaki = angka.nextInt(10);
                    if (tabek == tebaki  ) {
                        System.out.println("Angka anda benar selamaat!!!");
                        break;
                    }else if (tabek > tebaki) {
                        System.out.println("angka anda terlalu besar");
                    }else if (tabek < tebaki ) {
                        System.out.println("angka anda terlalu kecil");
                    }
                    }
                }else if (user.equals("6")) {
                    System.out.println("Selamat datang di permainan kertas batu gunting :");
                    while (true) {
                        Random tebakan = new Random();
                        System.out.println("Masukan tebakan mu :1)gunting 2)kertas 3)batu 0)keluar dari program");
                        String pilihan = scanner1.nextLine();
                        if (pilihan.equals("0")) {
                            System.out.println("Program berhenti!!");
                            break;
                        }
                        int userChoice = Integer.parseInt(pilihan);
                        int komputer = tebakan.nextInt(3) + 1;
                        System.out.println("Pilihan komputer:"+komputer);
                        if (userChoice == komputer) {
                            System.out.println("Hasil seri");
                        }else if ((userChoice == 1 && komputer == 2 ) ||
                        (userChoice == 2 && komputer == 3) ||
                        (userChoice == 3 && komputer == 1)) {
                            System.out.println("ANDA MENANG!!!");
                        }else {System.out.println("Anda kalahq");}
                    }
                }
            }
        }
    }
}