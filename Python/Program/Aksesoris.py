from PetShop import PetShop

class Aksesoris(PetShop):
    # Constructor, nyobain ga pake variabel di awal cok
    def __init__(self, id="", nama_produk="", stok_produk="", harga_produk=0, jenis="", bahan="", warna=""):
        super().__init__(id, nama_produk, stok_produk, harga_produk)
        self.jenis = jenis
        self.bahan = bahan
        self.warna = warna
    
    # Setters
    def set_jenis(self, jenis):
        self.jenis = jenis
    
    def set_bahan(self, bahan):
        self.bahan = bahan
    
    def set_warna(self, warna):
        self.warna = warna
    
    # Getters
    def get_jenis(self):
        return self.jenis
    
    def get_bahan(self):
        return self.bahan
    
    def get_warna(self):
        return self.warna
