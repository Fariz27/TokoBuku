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
        String namaKasir, namaBarang, codeBarang, ulang=" ";
        int hargaBarang, jmlh, diskon=0;
        Scanner txt = new Scanner(System.in);
        System.out.println("Fariz Akbar Ade Rian / XRPL6 / 23");
        System.out.println("Selamat datang di toko");
        do{
        System.out.println(" ");
        System.out.println("Masukan nama kasir");
        namaKasir=txt.nextLine();
        System.out.println(" ");        
        System.out.println("Masukan nama barang");
        namaBarang=txt.nextLine();
        System.out.println("Masukan kode barang");
        codeBarang=txt.nextLine();
        System.out.print("Masukan harga barang satuan \nRp.");
        hargaBarang=txt.nextInt();
        System.out.println("Masukan jumlah barang");
        jmlh=txt.nextInt();
        hargaBarang*=jmlh;
        if(hargaBarang>=100000){
            if(hargaBarang>=200000){
                if(hargaBarang>=500000){
                    diskon=50;
                }else{diskon=20;   
                }
            }else{diskon=10;
            }
        }
        System.out.println("Total harga Adalah Rp."+hargaBarang);
        System.out.println("\\");
        System.out.println("\\");
        int hargaAkhir=hitung(hargaBarang, diskon);
        tampilAkhir(namaKasir, namaBarang, codeBarang, hargaAkhir, jmlh, diskon);
        System.out.println("Ingin Transaksi lagi??[ya/tidak]");
        ulang=txt.next();
        }while(ulang.equalsIgnoreCase("ya"));
        if(ulang.equalsIgnoreCase("tidak")){
            System.out.println("Terimakasih atas kunjunganya.");
        }
        }
    
    public static int hitung(int nBrg,int diskon){
        int harga=nBrg,hargaAkhir=0,harga2,harga3;
        if(harga>=100000){
            if(harga>=200000){
                if(harga>=500000){
                    harga2=harga/100;
                    harga3=harga2*diskon;
                    hargaAkhir=harga-harga3;
                }else{
                 harga2=harga/100;
                 harga3=harga2*diskon;
                 hargaAkhir=harga-harga3;   
                }
            }else{
                harga2=harga/100;
                harga3=harga2*diskon;
                hargaAkhir=harga-harga3;
            }
        }
        System.out.println("Harga yang harus dibayar adalah Rp."+hargaAkhir);
        return hargaAkhir;
    }
    public static void tampilAkhir(String nama,String barang, String kode, int harga,int jmlh,int diskon){
        System.out.println("    --------    ");
        System.out.println("        |       ");
        System.out.println("        |       ");
        System.out.println("    --------    ");
        System.out.println("Nama Kasir \t: "+ nama);
        System.out.println("Nama Barang \t: "+ barang);
        System.out.println("Jumlah Barang \t: "+ jmlh);
        System.out.println("Diskon \t\t: "+diskon+"%");
        System.out.println("Kode Barang \t: "+ kode);
        System.out.println("Harga Total \t: Rp."+ harga);
    }
}
