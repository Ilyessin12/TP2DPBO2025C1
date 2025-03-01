#include <bits/stdc++.h>
#include "Baju.cpp"
using namespace std;

void tampilkan(int stringLength[], vector<Baju> products) {
    // find the size of the string of the products
    for(int i = 0; i < products.size(); i++) {
        if(products[i].getId().length() > stringLength[0]) {
            stringLength[0] = products[i].getId().length();
        }
        if(products[i].getNama_produk().length() > stringLength[1]) {
            stringLength[1] = products[i].getNama_produk().length();
        }
        if(products[i].getStok_produk().length() > stringLength[2]) {
            stringLength[2] = products[i].getStok_produk().length();
        }
        if(to_string(products[i].getHarga_produk()).length() > stringLength[3]) {
            stringLength[3] = to_string(products[i].getHarga_produk()).length();
        }
        if(products[i].getJenis().length() > stringLength[4]) {
            stringLength[4] = products[i].getJenis().length();
        }
        if(products[i].getBahan().length() > stringLength[5]) {
            stringLength[5] = products[i].getBahan().length();
        }
        if(products[i].getWarna().length() > stringLength[6]) {
            stringLength[6] = products[i].getWarna().length();
        }
        if(products[i].getUntuk().length() > stringLength[7]) {
            stringLength[7] = products[i].getUntuk().length();
        }
        if(products[i].getSize().length() > stringLength[8]) {
            stringLength[8] = products[i].getSize().length();
        }
        if(products[i].getMerk().length() > stringLength[9]) {
            stringLength[9] = products[i].getMerk().length();
        }
    }

    // print the table
    // first print the header
    // print the "===================== dynamicaly"
    cout << "+";
    for(int i = 0; i < 10; i++) {
        for(int j = 0; j < stringLength[i] + 1; j++) {
            cout << "=";
        }
        cout << "+";
    }
    cout << endl;
    
    // print the "ID" with the space
    cout << "|";
    cout << "ID";
    for(int i = 0; i < stringLength[0] - 2 + 1; i++) {
        cout << " ";
    }
    cout << "|";
    
    // print the "Nama Produk" with the space
    cout << "Nama Produk";
    for(int i = 0; i < stringLength[1] - 11 + 1; i++) {
        cout << " ";
    }
    cout << "|";
    
    // print the "Stok Produk" with the space
    cout << "Stok Produk";
    for(int i = 0; i < stringLength[2] - 11 + 1; i++) {
        cout << " ";
    }
    cout << "|";
    
    // print the "Harga Produk" with the space
    cout << "Harga Produk";
    for(int i = 0; i < stringLength[3] - 12 + 1; i++) {
        cout << " ";
    }
    cout << "|";
    
    // print the "Jenis" with the space
    cout << "Jenis";
    for(int i = 0; i < stringLength[4] - 5 + 1; i++) {
        cout << " ";
    }
    cout << "|";
    
    // print the "Bahan" with the space
    cout << "Bahan";
    for(int i = 0; i < stringLength[5] - 5 + 1; i++) {
        cout << " ";
    }
    cout << "|";
    
    // print the "Warna" with the space
    cout << "Warna";
    for(int i = 0; i < stringLength[6] - 5 + 1; i++) {
        cout << " ";
    }
    cout << "|";
    
    // print the "Untuk" with the space
    cout << "Untuk";
    for(int i = 0; i < stringLength[7] - 5 + 1; i++) {
        cout << " ";
    }
    cout << "|";
    
    // print the "Size" with the space
    cout << "Size";
    for(int i = 0; i < stringLength[8] - 4 + 1; i++) {
        cout << " ";
    }
    cout << "|";
    
    // print the "Merk" with the space
    cout << "Merk";
    for(int i = 0; i < stringLength[9] - 4 + 1; i++) {
        cout << " ";
    }
    cout << "|" << endl;

    // print the "===================== dynamicaly"
    cout << "+";
    for(int i = 0; i < 10; i++) {
        for(int j = 0; j < stringLength[i] + 1; j++) {
            cout << "=";
        }
        cout << "+";
    }
    cout << endl;

    // print the products
    for(int i = 0; i < products.size(); i++) {
        // print the "ID" with the space
        cout << "|";
        cout << products[i].getId();
        for(int j = 0; j < stringLength[0] - products[i].getId().length() + 1; j++) {
            cout << " ";
        }
        cout << "|";
        
        // print the "Nama Produk" with the space
        cout << products[i].getNama_produk();
        for(int j = 0; j < stringLength[1] - products[i].getNama_produk().length() + 1; j++) {
            cout << " ";
        }
        cout << "|";
        
        // print the "Stok Produk" with the space
        cout << products[i].getStok_produk();
        for(int j = 0; j < stringLength[2] - products[i].getStok_produk().length() + 1; j++) {
            cout << " ";
        }
        cout << "|";
        
        // print the "Harga Produk" with the space
        cout << products[i].getHarga_produk();
        for(int j = 0; j < stringLength[3] - to_string(products[i].getHarga_produk()).length() + 1; j++) {
            cout << " ";
        }
        cout << "|";
        
        // print the "Jenis" with the space
        cout << products[i].getJenis();
        for(int j = 0; j < stringLength[4] - products[i].getJenis().length() + 1; j++) {
            cout << " ";
        }
        cout << "|";
        
        // print the "Bahan" with the space
        cout << products[i].getBahan();
        for(int j = 0; j < stringLength[5] - products[i].getBahan().length() + 1; j++) {
            cout << " ";
        }
        cout << "|";
        
        // print the "Warna" with the space
        cout << products[i].getWarna();
        for(int j = 0; j < stringLength[6] - products[i].getWarna().length() + 1; j++) {
            cout << " ";
        }
        cout << "|";
        
        // print the "Untuk" with the space
        cout << products[i].getUntuk();
        for(int j = 0; j < stringLength[7] - products[i].getUntuk().length() + 1; j++) {
            cout << " ";
        }
        cout << "|";
        
        // print the "Size" with the space
        cout << products[i].getSize();
        for(int j = 0; j < stringLength[8] - products[i].getSize().length() + 1; j++) {
            cout << " ";
        }
        cout << "|";
        
        // print the "Merk" with the space
        cout << products[i].getMerk();
        for(int j = 0; j < stringLength[9] - products[i].getMerk().length() + 1; j++) {
            cout << " ";
        }
        cout << "|" << endl;
    }

    // print the "===================== dynamicaly"
    cout << "+";
    for(int i = 0; i < 10; i++) {
        for(int j = 0; j < stringLength[i] + 1; j++) {
            cout << "=";
        }
        cout << "+";
    }
    cout << endl;
}

int main() {
    vector<Baju> products;

    // variables for storing the input values of the products
    string id, nama_produk, stok_produk, jenis, bahan, warna, untuk, size, merk;
    int harga_produk;

    // first 5 products that are hardcoded
    Baju product1("1", "Baju Ryan Gosling", "10", 10000, "Gigachad", "Kain", "Putih", "Manusia", "XXL", "Adidas");
    Baju product2("2", "Baju Hidetaka Miyazaki", "11", 10000, "Sigma", "Kain", "Putih", "Manusia", "XXL", "Nikke");
    Baju product3("3", "Baju Takehiro Sakurai", "12", 10000, "Thundercock", "Kain", "Putih", "Manusia", "XXL", "Panther");
    Baju product4("4", "Baju Ryan Reynolds", "15", 10000, "Masco", "Kain", "Putih", "Manusia", "XXL", "Balenciaga");
    Baju product5("5", "Baju Brad Pitt", "69", 10000, "Fubar", "Kain", "Putih", "Manusia", "XXL", "Puma");

    // add the products to the vector
    products.push_back(product1);
    products.push_back(product2);
    products.push_back(product3);
    products.push_back(product4);
    products.push_back(product5);

    // store an array length of string length for dynamic table
    // ID = 3, Nama Produk = 11, Stok Produk = 11, Harga Produk = 12, Jenis = 5, Bahan = 5, Warna = 5, Untuk = 5, Size = 4, Merk = 4
    int stringLength[10] = {2, 11, 11, 12, 5, 5, 5, 5, 4, 4};
    
    // tampilan awal
    tampilkan(stringLength, products);

    // initialize the input
    int n;
    cout << "Masukkan jumlah produk: ";
    cin >> n;
    
    // loop
    for(int i = 0; i < n; i++) {
        cout << "Masukkan id produk: ";
        cin >> id;
        cout << "Masukkan nama produk: ";
        cin >> nama_produk;
        cout << "Masukkan stok produk: ";
        cin >> stok_produk;
        cout << "Masukkan harga produk: ";    
        cin >> harga_produk;
        cout << "Masukkan jenis: ";
        cin >> jenis;
        cout << "Masukkan bahan: ";
        cin >> bahan;
        cout << "Masukkan warna: ";
        cin >> warna;
        cout << "Masukkan untuk: ";
        cin >> untuk;
        cout << "Masukkan size: ";
        cin >> size;
        cout << "Masukkan merk: ";
        cin >> merk;

        Baju product(id, nama_produk, stok_produk, harga_produk, jenis, bahan, warna, untuk, size, merk);
        products.push_back(product);
    }

    // update string length
    tampilkan(stringLength, products);

    return 0;
}