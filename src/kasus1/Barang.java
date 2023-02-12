package kasus1;

/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class Barang {
    String kode_barang;
    String nama_barang;

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok += stok;
    }
    int stok;
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}
