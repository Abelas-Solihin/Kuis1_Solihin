import java.util.Scanner;
    public class Kuis1_Solihin{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int BiayaPembangunan; 
            int PanjangDinding;
            int TinggiDinding;
            double biayamaterial = 200000, total;
            double biayatenagakerja = 120000, jumlah;

            System.out.println("biayayangdibutuhkan");
            BiayaPembangunan = sc.nextInt();
            System.out.println("panjang");
            PanjangDinding = sc.nextInt();
            System.out.println("tinggi");
            TinggiDinding = sc.nextInt();
            System.out.println("material");
            biayamaterial = sc.nextDouble();
            System.out.println("tenaga kerja");
            biayatenagakerja = sc.nextDouble();

            System.out.println("total biaya yang harus di bayar");
            




        }

    // input: biaya pembangunan
    /*
     * luas dinding dalam meter persegi
     * total biaya material dan tenga kerja
     * output:total biaya yang harus bayar
     */
    