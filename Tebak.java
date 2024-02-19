import java.util.Scanner;
import java.util.Random;
public class Tebak {
    public static void main(String[] args) {
        try (Scanner scanner5 = new Scanner(System.in)){
            while(true) {
                System.out.println("Selamat datang di Game tebak angka!!");
                Random random = new Random();
                int randoNumber = random.nextInt(10);
                System.out.println("Silahkan masukan tabakan angkamu :");
                String tebakan = scanner5.nextLine();
                int angka = Integer.parseInt(tebakan);
                if ( angka == randoNumber) {
                    System.out.println("Angka yang anda masukan benar!!!!");
                    break;
                }else if ( angka < randoNumber ){
                    System.out.println("Angka yang anda masukan kurang");
                }else if (angka > randoNumber) {
                    System.out.println("Angka yang anda masukan lebih ");
                }
            }
        }
    } 
}
