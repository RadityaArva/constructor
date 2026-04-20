import base.produk;

public class main {
    public static void main(String[] args) {
        produk p = new produk("indomie goreng", 3500, 100, "makanan");

        System.out.println(p.stok);
        System.out.println(p.harga);
        System.out.println(p.nama);
        System.out.println(p.kategori);

        p.tampilkanInfo();
    }
}