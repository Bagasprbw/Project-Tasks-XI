package operator;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args)
    {
        int nilai1, nilai2, nilai3;
        
        Scanner key = new Scanner(System.in);
        System.out.println("masukan Nilai 1 :");
        nilai1 = key.nextInt();
        System.out.println("masukan Nilai 2 :");
        nilai2 = key.nextInt();
        System.out.println("masukan Nilai 3 :");
        nilai3 = key.nextInt();
        
       int tambah = nilai1 + nilai2;
       int kali = nilai2 * nilai3;
       System.out.println("Nilai 1 + nilai 2 =" + tambah);
       System.out.println("Nilai 2 * nilai 3 =" + kali);
        if(nilai1 > nilai2)
        { System.out.println("Nilai 1 lebih besar dari nilai 2");}
        if(nilai1 > nilai3)
        { System.out.println("Nilai 1 lebih besar dari nilai 3");}
        if(nilai2 > nilai3)
        { System.out.println("Nilai 2 lebih besar dari nilai 3");}
        else
        { System.out.println("Nilai 1 lebih kecil dari Nilai 2 dan 3");}
            
        
        
    }
    
}