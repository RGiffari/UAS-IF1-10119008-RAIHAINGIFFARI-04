package UAS.soal04;

/*
 *
 * @author
 * NAMA         : Raihan Giffari
 * KELAS        : IF-1
 * NIM          : 10119008
 *
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aplikasi Pendataan Wisatawan");
        System.out.println("=====================");
        Wisatawan wisatawan = new Wisatawan();
        System.out.println("Nama : ");
        wisatawan.setNama(scanner.nextLine());

        System.out.println("Kewarganegaraan : ");
        wisatawan.setKewarganegaraan(scanner.nextLine());

        System.out.println("Tujuan Wisata : ");
        wisatawan.setTujuanWisata(scanner.nextLine());

        System.out.println();
        System.out.println("Hasil Data Aplikasi Pendataan Wisatawan");
        System.out.println("=====================");
        System.out.println("Nama            : " + wisatawan.getNama());
        System.out.println("Kewarganegaraan : " + wisatawan.getKewarganegaraan());
        System.out.println("Tujuan Wisata   : " + wisatawan.getTujuanWisata());
    }
}
