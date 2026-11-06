
public class BankTurunan {

    public static void main(String[] args) {

        // Membuat objek Tabungan
        Tabungan tabungan = new Tabungan(
                "101",
                "Ani",
                1000000,
                2.5
        );

        // Membuat objek Giro
        Giro giro = new Giro(
                "201",
                "Budi",
                200000,
                500000
        );

        // Menampilkan rekening awal
        System.out.println("========== REKENING AWAL ==========");

        tabungan.cetakInfo();

        System.out.println();

        giro.cetakInfo();

        System.out.println();

        // Menjalankan transaksi
        System.out.println("============ TRANSAKSI ============");

        // Transaksi 1: Tabungan tarik 1.500.000
        boolean transaksi1 = tabungan.tarik(1500000);

        System.out.println(
                "Tabungan tarik 1.500.000 : "
                        + (transaksi1 ? "Berhasil" : "Ditolak")
        );

        // Transaksi 2: Giro tarik 500.000
        boolean transaksi2 = giro.tarik(500000);

        System.out.println(
                "Giro tarik 500.000       : "
                        + (transaksi2 ? "Berhasil" : "Ditolak")
        );

        // Transaksi 3: Giro tarik 300.000
        boolean transaksi3 = giro.tarik(300000);

        System.out.println(
                "Giro tarik 300.000       : "
                        + (transaksi3 ? "Berhasil" : "Ditolak")
        );

        // Transaksi 4: Giro setor 100.000
        boolean transaksi4 = giro.setor(100000);

        System.out.println(
                "Giro setor 100.000       : "
                        + (transaksi4 ? "Berhasil" : "Ditolak")
        );

        // Transaksi 5: Menambahkan bunga Tabungan
        int bunga = tabungan.tambahBunga();

        System.out.println(
                "Bunga tabungan           : "
                        + Rekening.formatRupiah(bunga)
        );

        System.out.println();

        // Menampilkan rekening akhir
        System.out.println("========== REKENING AKHIR ==========");

        tabungan.cetakInfo();

        System.out.println();

        giro.cetakInfo();
    }
}

