#pragma once
#include <bits/stdc++.h>
using namespace std;

class PetShop{
    // Attributes
    private:
        string id;
        string nama_produk;
        string stok_produk;
        int harga_produk;
    //constructors
    public:
    // Default constructor
        PetShop(){
            this->id = "";
            this->nama_produk = "";
            this->stok_produk = "";
            this->harga_produk = 0;
        }

        PetShop(string id, string nama_produk, string stok_produk, int harga_produk){
            this->id = id;
            this->nama_produk = nama_produk;
            this->stok_produk = stok_produk;
            this->harga_produk = harga_produk;
        }

        // Getter and Setter
        string getId(){
            return this->id;
        }

        string getNama_produk(){
            return this->nama_produk;
        }

        string getStok_produk(){
            return this->stok_produk;
        }

        int getHarga_produk(){
            return this->harga_produk;
        }

        void setId(string id){
            this->id = id;
        }

        void setNama_produk(string nama_produk){
            this->nama_produk = nama_produk;
        }

        void setStok_produk(string stok_produk){
            this->stok_produk = stok_produk;
        }

        void setHarga_produk(int harga_produk){
            this->harga_produk = harga_produk;
        }

        //destructor
        ~PetShop(){
        }

};
