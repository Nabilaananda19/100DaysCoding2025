package day12java;
import java.util.Scanner;

public class Day12java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nama");
        String namaPanggilan = input.nextLine();
        
        System.out.println("Masukkan umur");
        int umur = input.nextInt();
        
        System.out.println("Masukkan ukuran baju");
        double ukuranBaju = input.nextDouble();
        
        System.out.println("Masukkan tinggi badan (cm) ");
        float tinggi = input.nextFloat();
        
        System.out.println("Mahasiswa");
        boolean mahasiswa = input.nextBoolean();
        
        System.out.println("Masukkan ukuran sepatu");
        short ukuranSepatu = input.nextShort();
        
        System.out.println("Masukkan jarak kost ke kampus");
        long jarakKostkeKampus = input.nextLong();
        
        System.out.println("Masukkan nilai ujian");
        byte nilaiUjian = input.nextByte();
        
        System.out.println("Masukkan kelas");
        char kelas = input.next().charAt(0);
        
        System.out.println("nama: " + namaPanggilan);
        System.out.println("umur: " + umur);
        System.out.println("ukuran baju: " + ukuranBaju);
        System.out.println("tinggi badan: " + tinggi +"cm");
        System.out.println("mahasiswa " + mahasiswa);
        System.out.println("ukuran sepatu: " + ukuranSepatu);
        System.out.println("jarak kost ke kampus: " + jarakKostkeKampus);
        System.out.println("nilai ujian: " + nilaiUjian);
        System.out.println("kelas: " + kelas);
    }
    
}
