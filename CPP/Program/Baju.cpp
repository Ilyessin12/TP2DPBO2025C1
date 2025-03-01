#pragma once
#include <bits/stdc++.h>
#include "Aksesoris.cpp"
using namespace std;

class Baju : public Aksesoris {
    // Attributes
    private:
        string untuk;
        string size;
        string merk;

    // Constructor
    public:
        // Default constructor
        Baju() {
            this->untuk = "";
            this->size = "";
            this->merk = "";
        }

        // Parameterized constructor
        Baju(string id, string nama_produk, string stok_produk, int harga_produk, string jenis, string bahan, string warna, string untuk, string size, string merk) : Aksesoris(id, nama_produk, stok_produk, harga_produk, jenis, bahan, warna) {
            this->untuk = untuk;
            this->size = size;
            this->merk = merk;
        }

        // Getters
        string getUntuk() {
            return this->untuk;
        }

        string getSize() {
            return this->size;
        }

        string getMerk() {
            return this->merk;
        }

        // Setters
        void setUntuk(string untuk) {
            this->untuk = untuk;
        }

        void setSize(string size) {
            this->size = size;
        }

        void setMerk(string merk) {
            this->merk = merk;
        }

        // Destructor
        ~Baju() {
        }
};