public class Aksesoris extends PetShop {
    // Attributes
    private String jenis;
    private String bahan;
    private String warna;

    // Default constructor
    public Aksesoris() {
        this.jenis = "";
        this.bahan = "";
        this.warna = "";
    }

    // Constructor
    public Aksesoris(String id, String nama_produk, String stok_produk, int harga_produk, String jenis, String bahan, String warna) {
        super(id, nama_produk, stok_produk, harga_produk);
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    // Setter and Getter
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getters
    public String getJenis() {
        return this.jenis;
    }

    public String getBahan() {
        return this.bahan;
    }

    public String getWarna() {
        return this.warna;
    }

}