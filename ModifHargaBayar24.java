import java.util.Scanner;
public class ModifHargaBayar24 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int harga, jumlah;
        int jmlHalbuku = 150;
        double dis, total, bayar, jmlDis;
        String merkBuku = "BigBoss";
        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan besaran diskon ");
        dis = input.nextDouble();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Merk buku adalah " + merkBuku);
        System.out.println("Jumlah halaman buku adalah " + jmlHalbuku);
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}