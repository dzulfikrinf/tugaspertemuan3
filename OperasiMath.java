package operasimath;
import java.util.Scanner;

public class OperasiMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tiga bilangan bulat negatif: ");
        int bil1 = input.nextInt();
        int bil2 = input.nextInt();
        int bil3 = input.nextInt();
        
        int jumlah = bil1 + bil2 + bil3;
        int kurang = bil1 - bil2 - bil3;
        int kali = bil1 * bil2 * bil3;
        float bagi = (float) bil1 / bil2 / bil3;
        
        System.out.println("Hasil penjumlahan: " + jumlah);
        System.out.println("Hasil pengurangan: " + kurang);
        System.out.println("Hasil perkalian: " + kali);
        System.out.println("Hasil pembagian: " + bagi);
    }
}
