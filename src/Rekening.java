
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Rekening {

    // Atribut
    private String nomor;
    private String pemilik;
    protected int saldo;

    // Constructor
    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    // Getter
    public String getNomor() {
        return nomor;
    }

    public String getPemilik() {
        return pemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    // Method setor
    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }

        saldo += jumlah;
        return true;
    }

    // Method tarik
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }

        saldo -= jumlah;
        return true;
    }

    // Method format Rupiah
    protected static String formatRupiah(int jumlah) {
        DecimalFormatSymbols simbol =
                new DecimalFormatSymbols();

        simbol.setGroupingSeparator('.');

        DecimalFormat format =
                new DecimalFormat("#,##0", simbol);

        return "Rp" + format.format(jumlah);
    }

    // Method cetak informasi
    public void cetakInfo() {
        System.out.println(
                nomor + " | " + pemilik + " | "
                        + formatRupiah(saldo)
        );
    }
}
