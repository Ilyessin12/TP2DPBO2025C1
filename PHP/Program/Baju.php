<?php

require_once('Aksesoris.php');

class Baju extends Aksesoris {
    // Attributes
    private $untuk;
    private $size;
    private $merk;

    // Default constructor
    public function __construct($id = "", $nama_produk = "", $stok_produk = "", $harga_produk = 0, $foto_produk = "", $jenis = "", $bahan = "", $warna = "",$untuk = "", $size = "", $merk = "") {
        // Call parent constructor (similar to super method in java) 
        parent::__construct($id, $nama_produk, $stok_produk, $harga_produk, $foto_produk, $jenis, $bahan, $warna);
        
        // Initialize additional attributes
        $this->untuk = $untuk;
        $this->size = $size;
        $this->merk = $merk;
    }

    // Setter and Getter
    public function setUntuk($untuk) {
        $this->untuk = $untuk;
    }

    public function setSize($size) {
        $this->size = $size;
    }

    public function setMerk($merk) {
        $this->merk = $merk;
    }

    // Getters
    public function getUntuk() {
        return $this->untuk;
    }

    public function getSize() {
        return $this->size;
    }

    public function getMerk() {
        return $this->merk;
    }
}

?>