/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Scanner;
/**
 *
 * @author Fariz
 */
public class TugasTokoBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaKasir, namaBarang, codeBarang, diskon;
        int hargaBarang;
        Scanner txt = new Scanner(System.in);
        System.out.println("Fariz Akbar Ade Rian / XRPL6 / 23");
        System.out.println("Selamat datang di toko");
        System.out.println(" ");
        System.out.println("Masukan nama kasir");
        namaKasir=txt.nextLine();
        System.out.println(" ");
        System.out.println("Masukan nama barang");
        namaBarang=txt.nextLine();
        System.out.println("Masukan kode barang");
        codeBarang=txt.nextLine();
        System.out.print("Masukan harga barang \nRp.");
        hargaBarang=txt.nextInt();
        System.out.println("\\");
        System.out.println("\\");
        hitung(hargaBarang);
    }
    
    public static void hitung(int nBrg){
        int harga=nBrg,hargaAkhir=0,harga2,harga3;
        if(harga>=100000){
            if(harga>=200000){
                if(harga>=500000){
                    harga2=harga/100;
                    harga3=harga2*50;
                    hargaAkhir=harga-harga3;
                }else{
                 harga2=harga/100;
                 harga3=harga2*20;
                 hargaAkhir=harga-harga3;   
                }
            }else{
                harga2=harga/100;
                harga3=harga2*10;
                hargaAkhir=harga-harga3;
            }
        }
        System.out.println("Harga yang harus dibayar adalah Rp."+hargaAkhir);
    } 
}
