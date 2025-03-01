<?php

require_once('PetShop.php');

class Aksesoris extends PetShop {
    // Attributes
    private $jenis;
    private $bahan;
    private $warna;

    // Default constructor
    public function __construct($id = "", $nama_produk = "", $stok_produk = "", $harga_produk = 0, $foto_produk = "", $jenis = "", $bahan = "", $warna = "") {
        // Call parent constructor (similar to super method in java)
        parent::__construct($id, $nama_produk, $stok_produk, $harga_produk, $foto_produk);
        
        // Initialize additional attributes
        $this->jenis = $jenis;
        $this->bahan = $bahan;
        $this->warna = $warna;
    }

    // Setter and Getter
    public function setJenis($jenis) {
        $this->jenis = $jenis;
    }

    public function setBahan($bahan) {
        $this->bahan = $bahan;
    }

    public function setWarna($warna) {
        $this->warna = $warna;
    }

    // Getters
    public function getJenis() {
        return $this->jenis;
    }

    public function getBahan() {
        return $this->bahan;
    }

    public function getWarna() {
        return $this->warna;
    }
}

?>