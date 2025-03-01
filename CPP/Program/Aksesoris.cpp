#pragma once
#include <bits/stdc++.h>
#include "PetShop.cpp"
using namespace std;

class Aksesoris : public PetShop{
    // Attributes
    private:
        string jenis;
        string bahan;
        string warna;

    //constructors
    public:

        // Default constructor
        Aksesoris(){
            this->jenis = "";
            this->bahan = "";
            this->warna = "";
        }
        
        Aksesoris(string id, string nama_produk, string stok_produk, int harga_produk, string jenis, string bahan, string warna) : PetShop(id, nama_produk, stok_produk, harga_produk){
            this->jenis = jenis;
            this->bahan = bahan;
            this->warna = warna;
        }

        // Getter and Setter
        string getJenis(){
            return this->jenis;
        }

        string getBahan(){
            return this->bahan;
        }

        string getWarna(){
            return this->warna;
        }

        void setJenis(string jenis){
            this->jenis = jenis;
        }

        void setBahan(string bahan){
            this->bahan = bahan;
        }

        void setWarna(string warna){
            this->warna = warna;
        }

        //destructor
        ~Aksesoris(){
        }

};