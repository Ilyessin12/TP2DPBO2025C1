public class Baju extends Aksesoris {
    //Attributes
    private String untuk;
    private String size;
    private String merk;

    //Default constructor
    public Baju() {
        this.untuk = "";
        this.size = "";
        this.merk = "";
    }

    //Constructor
    public Baju(String id, String nama_produk, String stok_produk, int harga_produk, String jenis, String bahan, String warna, String untuk, String size, String merk) {
        super(id, nama_produk, stok_produk, harga_produk, jenis, bahan, warna);
        this.untuk = untuk;
        this.size = size;
        this.merk = merk;
    }

    //Setter and Getter
    public void setUntuk(String untuk) {
        this.untuk = untuk;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    //Getters

    public String getUntuk() {
        return this.untuk;
    }

    public String getSize() {
        return this.size;
    }

    public String getMerk() {
        return this.merk;
    }

}
