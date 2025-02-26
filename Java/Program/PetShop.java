public class PetShop {
    // Attributes
    private String id;
    private String nama_produk;
    private String stok_produk;
    private int harga_produk;

    // Default constructor
    public PetShop() {
        this.id = "";
        this.nama_produk = "";
        this.stok_produk = "";
        this.harga_produk = 0;
    }
    
    // Constructor
    public PetShop(String id, String nama_produk, String stok_produk, int harga_produk) {
        this.id = id;
        this.nama_produk = nama_produk;
        this.stok_produk = stok_produk;
        this.harga_produk = harga_produk;
    }

    // Setter and Getter
    public void setId(String id) {
        this.id = id;
    }

    public void setnama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public void setstok_produk(String stok_produk) {
        this.stok_produk = stok_produk;
    }

    public void setharga_produk(int harga_produk) {
        this.harga_produk = harga_produk;
    }


    // Getters
    public String getId() {
        return this.id;
    }

    public String getnama_produk() {
        return this.nama_produk;
    }

    public String getstok_produk() {
        return this.stok_produk;
    }

    public int getharga_produk() {
        return this.harga_produk;
    }


}
