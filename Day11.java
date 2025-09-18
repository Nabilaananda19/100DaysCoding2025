package day11java;
import java.util.Scanner;

public class Day11java {
    public static void main(String[] args) {
        //membuat scanner
       Scanner input = new Scanner(System.in);
       
        System.out.println("Masukkan nama : ");
        String nama = input.nextLine();
        
        System.out.println("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();
        
        System.out.println("Masukkan umur : ");
        int umur = input.nextInt();
        
        //output akan meminta memasukkan nama,berat badan,umur
        System.out.println("nama," + nama + "nabila");
        System.out.println("berat," + berat + "kg");
        System.out.println("umur," + umur + "tahun");
    }
    
}
