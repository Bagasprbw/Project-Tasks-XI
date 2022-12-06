package switchcase;
import java.util.Scanner;

    public class ProgramLatihanSwitch
    {
     public static void main(String args[])
        {
         Scanner input = new Scanner(System.in);
        int pesan,pilih;
        System.out.print("WARUNG GAUL!\nPilihan:\n 1. Nasi Goreng(Rp.12.000.00)\n 2. steak(Rp.15.000.00)\n 3. mie ayam(Rp.7.000.00)\n 4. Bakso(Rp.8.000.00)\n");
        System.out.print("Masukkan Pilihan :");
        pilih = input.nextInt();
        System.out.print("Jumlah Pesan : ");
        pesan = input.nextInt();
        System.out.println("================");
        switch(pilih){
            case 1:
              
                System.out.println("Pesanan : Nasi Goreng");
                System.out.println("Harga : 12.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan * 12000);
            break;
            case 2:
             
                System.out.println("Pesanan : steak");
                System.out.println("Harga : 15.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan * 15000);
            break;
            case 3:
                
                System.out.println("Pesanan : mie ayam");
                System.out.println("Harga : 7.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan * 7000);
            break;
             case 4:
                
                System.out.println("Pesanan : Bakso");
                System.out.println("Harga : 8.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan * 8000);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        
        
    }
  }
}     