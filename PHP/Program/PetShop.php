<?php

class PetShop {
    // Attributes
    private $id;
    private $nama_produk;
    private $stok_produk;
    private $harga_produk;
    private $foto_produk; // untuk nyimpen foto produk

    // Default constructor
    public function __construct($id = "", $nama_produk = "", $stok_produk = "", $harga_produk = 0, $foto_produk = "") {
        $this->id = $id;
        $this->nama_produk = $nama_produk;
        $this->stok_produk = $stok_produk;
        $this->harga_produk = $harga_produk;
        $this->foto_produk = $foto_produk;
    }

    // Setter and Getter
    public function setId($id) {
        $this->id = $id;
    }

    public function setNama_produk($nama_produk) {
        $this->nama_produk = $nama_produk;
    }

    public function setStok_produk($stok_produk) {
        $this->stok_produk = $stok_produk;
    }

    public function setHarga_produk($harga_produk) {
        $this->harga_produk = $harga_produk;
    }

    public function setFoto_produk($foto_produk) {
        $this->foto_produk = $foto_produk;
    }

    // Getters
    public function getId() {
        return $this->id;
    }

    public function getNama_produk() {
        return $this->nama_produk;
    }

    public function getStok_produk() {
        return $this->stok_produk;
    }

    public function getHarga_produk() {
        return $this->harga_produk;
    }

    public function getFoto_produk() {
        return $this->foto_produk;
    }
}

?>