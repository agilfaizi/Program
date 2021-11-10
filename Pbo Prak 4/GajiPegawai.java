import java.util.*;

public class GajiPegawai {

public static void main(String[] args) {
   int i = 1;
    while(i < 5){
    Scanner input = new Scanner(System.in);
        System.out.println("Input nama Pegawai : ");
        String nama_pegawai = input.nextLine();
        System.out.println("Jumlah Kehadiran : ");
        int jumlah_kehadiran = input.nextInt();
        int gaji = jumlah_kehadiran * 50000;
        
        if(jumlah_kehadiran < 20){
         int potongan = gaji*10/100;
         int total_gaji = gaji-potongan;
         
         System.out.println("\n");
         System.out.println("---- Gaji Pegawai ke -"+i+" ----");
         System.out.println("Nama = " + nama_pegawai);
         System.out.println("Jumlah Kehadiran = " + jumlah_kehadiran);
         System.out.println("Jumlah Gaji : " + gaji);         
         System.out.println("Potongan : " + potongan);
         System.out.println("Gaji yang di Terima : " + total_gaji);         
         System.out.println("\n");
         
         } else{
         System.out.println("\n");
         System.out.println("---- Gaji Pegawai ke -"+i+" ----");
         System.out.println("Nama = " + nama_pegawai);
         System.out.println("Jumlah Kehadiran = " + jumlah_kehadiran);
         System.out.println("Jumlah Gaji : " + gaji);         
         System.out.println("Potongan : 0");
         System.out.println("Gaji yang di Terima : " + gaji);         
         System.out.println("\n");
         }
        
i++;
}

}
}