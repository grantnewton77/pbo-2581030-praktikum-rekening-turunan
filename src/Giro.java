
public class Giro extends Rekening {

    // Atribut khusus Giro
    private int batasOverdraft;

    // Constructor
    public Giro(
            String nomor,
            String pemilik,
            int saldo,
            int batasOverdraft
    ) {
        super(nomor, pemilik, saldo);

        this.batasOverdraft = batasOverdraft;
    }

    // Override method tarik
    @Override
    public boolean tarik(int jumlah) {

        if (jumlah <= 0) {
            return false;
        }

        if (saldo - jumlah < -batasOverdraft) {
            return false;
        }

        saldo -= jumlah;

        return true;
    }

    // Override method cetakInfo
    @Override
    public void cetakInfo() {

        super.cetakInfo();

        System.out.println(
                "     Giro, batas overdraft "
                        + formatRupiah(batasOverdraft)
        );
    }

    /*
     * Percobaan akses nomor:
     * System.out.println(nomor);
     *
     * Error:
     * nomor has private access in Rekening
     *
     * Baris percobaan dihapus karena nomor
     * merupakan atribut private pada Rekening.
     */
}
