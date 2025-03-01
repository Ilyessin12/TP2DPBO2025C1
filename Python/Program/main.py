from Baju import Baju

def tampilkan(string_length, products):
    # Find the size of the string of the products
    for product in products:
        if len(product.get_id()) > string_length[0]:
            string_length[0] = len(product.get_id())
        if len(product.get_nama_produk()) > string_length[1]:
            string_length[1] = len(product.get_nama_produk())
        if len(product.get_stok_produk()) > string_length[2]:
            string_length[2] = len(product.get_stok_produk())
        if len(str(product.get_harga_produk())) > string_length[3]:
            string_length[3] = len(str(product.get_harga_produk()))
        if len(product.get_jenis()) > string_length[4]:
            string_length[4] = len(product.get_jenis())
        if len(product.get_bahan()) > string_length[5]:
            string_length[5] = len(product.get_bahan())
        if len(product.get_warna()) > string_length[6]:
            string_length[6] = len(product.get_warna())
        if len(product.get_untuk()) > string_length[7]:
            string_length[7] = len(product.get_untuk())
        if len(product.get_size()) > string_length[8]:
            string_length[8] = len(product.get_size())
        if len(product.get_merk()) > string_length[9]:
            string_length[9] = len(product.get_merk())
    
    # Print the table header
    print("+", end="")
    for i in range(len(string_length)):
        for j in range(string_length[i] + 1):
            print("=", end="")
        print("+", end="")
    print()
    
    # Print the column headers
    print("|", end="")
    print("ID", end="")
    for i in range(string_length[0] - 2 + 1):
        print(" ", end="")
    print("|", end="")
    
    print("Nama Produk", end="")
    for i in range(string_length[1] - 11 + 1):
        print(" ", end="")
    print("|", end="")
    
    print("Stok Produk", end="")
    for i in range(string_length[2] - 11 + 1):
        print(" ", end="")
    print("|", end="")
    
    print("Harga Produk", end="")
    for i in range(string_length[3] - 12 + 1):
        print(" ", end="")
    print("|", end="")
    
    print("Jenis", end="")
    for i in range(string_length[4] - 5 + 1):
        print(" ", end="")
    print("|", end="")
    
    print("Bahan", end="")
    for i in range(string_length[5] - 5 + 1):
        print(" ", end="")
    print("|", end="")
    
    print("Warna", end="")
    for i in range(string_length[6] - 5 + 1):
        print(" ", end="")
    print("|", end="")
    
    print("Untuk", end="")
    for i in range(string_length[7] - 5 + 1):
        print(" ", end="")
    print("|", end="")
    
    print("Size", end="")
    for i in range(string_length[8] - 4 + 1):
        print(" ", end="")
    print("|", end="")
    
    print("Merk", end="")
    for i in range(string_length[9] - 4 + 1):
        print(" ", end="")
    print("|")
    
    # Print separator
    print("+", end="")
    for i in range(len(string_length)):
        for j in range(string_length[i] + 1):
            print("=", end="")
        print("+", end="")
    print()
    
    # Print the products data
    for product in products:
        print("|", end="")
        print(product.get_id(), end="")
        for j in range(string_length[0] - len(product.get_id()) + 1):
            print(" ", end="")
        print("|", end="")
        
        print(product.get_nama_produk(), end="")
        for j in range(string_length[1] - len(product.get_nama_produk()) + 1):
            print(" ", end="")
        print("|", end="")
        
        print(product.get_stok_produk(), end="")
        for j in range(string_length[2] - len(product.get_stok_produk()) + 1):
            print(" ", end="")
        print("|", end="")
        
        print(product.get_harga_produk(), end="")
        for j in range(string_length[3] - len(str(product.get_harga_produk())) + 1):
            print(" ", end="")
        print("|", end="")
        
        print(product.get_jenis(), end="")
        for j in range(string_length[4] - len(product.get_jenis()) + 1):
            print(" ", end="")
        print("|", end="")
        
        print(product.get_bahan(), end="")
        for j in range(string_length[5] - len(product.get_bahan()) + 1):
            print(" ", end="")
        print("|", end="")
        
        print(product.get_warna(), end="")
        for j in range(string_length[6] - len(product.get_warna()) + 1):
            print(" ", end="")
        print("|", end="")
        
        print(product.get_untuk(), end="")
        for j in range(string_length[7] - len(product.get_untuk()) + 1):
            print(" ", end="")
        print("|", end="")
        
        print(product.get_size(), end="")
        for j in range(string_length[8] - len(product.get_size()) + 1):
            print(" ", end="")
        print("|", end="")
        
        print(product.get_merk(), end="")
        for j in range(string_length[9] - len(product.get_merk()) + 1):
            print(" ", end="")
        print("|")
    
    # Print final separator
    print("+", end="")
    for i in range(len(string_length)):
        for j in range(string_length[i] + 1):
            print("=", end="")
        print("+", end="")
    print()

def main():
    products = []
    
    # First 5 products that are hardcoded
    product1 = Baju("1", "Baju Ryan Gosling", "10", 10000, "Gigachad", "Kain", "Putih", "Manusia", "XXL", "Adidas")
    product2 = Baju("2", "Baju Hidetaka Miyazaki", "11", 10000, "Sigma", "Kain", "Putih", "Manusia", "XXL", "Nikke")
    product3 = Baju("3", "Baju Takehiro Sakurai", "12", 10000, "Thundercock", "Kain", "Putih", "Manusia", "XXL", "Panther")
    product4 = Baju("4", "Baju Ryan Reynolds", "15", 10000, "Masco", "Kain", "Putih", "Manusia", "XXL", "Balenciaga")
    product5 = Baju("5", "Baju Brad Pitt", "69", 10000, "Fubar", "Kain", "Putih", "Manusia", "XXL", "Puma")
    
    # Add the products to the list
    products.append(product1)
    products.append(product2)
    products.append(product3)
    products.append(product4)
    products.append(product5)
    
    # Store an array length of string length for dynamic table
    # ID = 2, Nama Produk = 11, Stok Produk = 11, Harga Produk = 12, Jenis = 5, Bahan = 5, Warna = 5, Untuk = 5, Size = 4, Merk = 4
    string_length = [2, 11, 11, 12, 5, 5, 5, 5, 4, 4]
    
    # Show initial display
    tampilkan(string_length, products)
    
    # Get user input
    n = int(input("Masukkan jumlah produk: "))
    for i in range(n):
        id = input("Masukkan id produk: ")
        nama_produk = input("Masukkan nama produk: ")
        stok_produk = input("Masukkan stok produk: ")
        harga_produk = int(input("Masukkan harga produk: "))
        jenis = input("Masukkan jenis: ")
        bahan = input("Masukkan bahan: ")
        warna = input("Masukkan warna: ")
        untuk = input("Masukkan untuk: ")
        size = input("Masukkan size: ")
        merk = input("Masukkan merk: ")
        
        product = Baju(id, nama_produk, stok_produk, harga_produk, jenis, bahan, warna, untuk, size, merk)
        products.append(product)
    
    # Update display with new products
    tampilkan(string_length, products)
1
if __name__ == "__main__":
    main()
