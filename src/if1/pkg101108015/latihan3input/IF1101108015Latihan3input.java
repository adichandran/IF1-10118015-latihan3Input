/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg101108015.latihan3input;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program memasukan inputan dari
 *                        keyboard untuk ditampilkn kembali
 */
public class IF1101108015Latihan3input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Masukkan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.nextLine();
        System.out.println("Nama Anda Adalah : " + nama);
    }
    
}
