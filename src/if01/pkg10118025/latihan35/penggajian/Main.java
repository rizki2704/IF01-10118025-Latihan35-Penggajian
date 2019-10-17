/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan35.penggajian;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Penggajian gaji = new Penggajian();
        
        System.out.println("=====Program Tunjangan=====");
        System.out.print("Berapa Gaji Pokok Anda per Bulan? : Rp. ");
        gaji.gajiPokok = scan.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        gaji.status = scan.next();
        
        gaji.hasilHitung(gaji.status, gaji.gajiPokok);
        
    }
    
}
