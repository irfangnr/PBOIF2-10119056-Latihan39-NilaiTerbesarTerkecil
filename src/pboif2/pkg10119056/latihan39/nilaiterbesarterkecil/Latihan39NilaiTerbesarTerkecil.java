/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan39.nilaiterbesarterkecil;
import java.util.Scanner;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan menentukan nilai tebersar terkecil
 */

public class Latihan39NilaiTerbesarTerkecil {
    public static void main(String[] args) {
        Nilai baru=new Nilai();
        Scanner masukan=new Scanner(System.in);
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa====");
        System.out.print("Masukan Nama Petugas : ");
        String nama=masukan.next();
        baru.nilaiMahasiswa();
        System.out.println("====Hasil Nilai Mahasiswa====");
        System.out.print("\nNilai Terbesar adalah "+baru.max);
        System.out.print("\nNilai Terkecil adalah "+baru.min);

    }
}
