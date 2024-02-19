package kodeascii;

public class KodeAscii {
        public static void main(String[] args) {
            
        char char1 = '4';  
        char char2 = '6';  
        
        int nilaiascii1 = char1;  
        int nilaiascii2 = char2;  
        int jml = nilaiascii1 + nilaiascii2;
        
        System.out.println("Nilai ASCII dari angka " + char1 + " adalah: " + nilaiascii1);  
        System.out.println("Nilai ASCII dari angka " + char2 + " adalah: " + nilaiascii2);
        System.out.println("Jumlah Nilai ASCII dari kedua angka adalah " + jml);
    }
}
