package miegacoan;
import java.util.Scanner;

public class MieGacoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah uang yang Anda punya: ");
        int uang = input.nextInt();
        
        System.out.print("Apakah tidak ada kelas kuliah? (true/false): ");
        boolean tidakAdaKelasKuliah = input.nextBoolean();
        
        if((uang > 10000) && tidakAdaKelasKuliah){
            System.out.println("Ayoo beli Gacoan!");
        } else {
            System.out.println("Ga bisa beli Gacoan");
        }
        
    }
}



