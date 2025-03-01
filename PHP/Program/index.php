<?php
require_once('PetShop.php');
require_once('Aksesoris.php');
require_once('Baju.php');

// Function to display products in a table
function displayProducts($products, $title) {
    echo "<h3>$title</h3>";
    echo "<table border='1'>
            <tr>
                <th>ID</th>
                <th>Nama Produk</th>
                <th>Stok Produk</th>
                <th>Harga Produk</th>
                <th>Foto Produk</th>
                <th>Jenis</th>
                <th>Bahan</th>
                <th>Warna</th>
                <th>Untuk</th>
                <th>Size</th>
                <th>Merk</th>
            </tr>";
    
    foreach ($products as $product) {
        echo "<tr>
                <td>" . $product->getId() . "</td>
                <td>" . $product->getNama_produk() . "</td>
                <td>" . $product->getStok_produk() . "</td>
                <td>" . $product->getHarga_produk() . "</td>
                <td><img src='" . $product->getFoto_produk() . "' width='100'></td>
                <td>" . $product->getJenis() . "</td>
                <td>" . $product->getBahan() . "</td>
                <td>" . $product->getWarna() . "</td>
                <td>" . $product->getUntuk() . "</td>
                <td>" . $product->getSize() . "</td>
                <td>" . $product->getMerk() . "</td>
            </tr>";
    }
    echo "</table>";
    echo "<hr>";
}

// Array to store products
$products = array();

// Page Header
echo "<h1>Petshop milik SERN</h1>";

// Initial state
echo "<h2>Initial State</h2>";
if (empty($products)) {
    echo "<p>Belum ada produk tersedia.</p>";
}
echo "<hr>";

// Adding hardcoded products from main.java
echo "<h2>Adding Initial Products</h2>";

// First 5 products that are hardcoded
$products[] = new Baju("1", "Baju Ryan Gosling", "10", 10000, "foto1.jpg", "Gigachad", "Kain", "Putih", "Manusia", "XXL", "Adidas");
$products[] = new Baju("2", "Baju Hidetaka Miyazaki", "11", 10000, "foto2.jpg", "Sigma", "Kain", "Putih", "Manusia", "XXL", "Nikke");
$products[] = new Baju("3", "Baju Takehiro Sakurai", "12", 10000, "foto3.jpg", "Thundercock", "Kain", "Putih", "Manusia", "XXL", "Panther");
$products[] = new Baju("4", "Baju Ryan Reynolds", "15", 10000, "foto4.jpg", "Masco", "Kain", "Putih", "Manusia", "XXL", "Balenciaga");
$products[] = new Baju("5", "Baju Brad Pitt", "69", 10000, "foto5.jpg", "Fubar", "Kain", "Putih", "Manusia", "XXL", "Puma");

// Display initial products
displayProducts($products, "After Adding Initial Products");
echo "<h3> kalo teliti pasti tau ada foto yang salah disini </h3>";
echo "<hr>";

// Adding more products from input
echo "<h2>Adding More Products</h2>";
echo "<p>Adding 5 more products...</p>";

// Add the products from the provided input
$products[] = new Baju("6", "Kemeja_Formal", "25", 150000, "foto6.jpg", "Formal", "Katun", "Biru", "Pria", "L", "Uniqlo");
$products[] = new Baju("7", "Dress_Casual", "18", 249000, "foto6.jpg", "Casual", "Sutra", "Merah", "Wanita", "M", "Zara");
$products[] = new Baju("8", "Jaket_Bomber", "30", 350000, "foto6.jpg", "Outerwear", "Denim", "Hitam", "Unisex", "XL", "Levis");
$products[] = new Baju("9", "Kaos_Grafis", "40", 89000, "foto6.jpg", "Casual", "Polyester", "Kuning", "Anak", "S", "HnM");
$products[] = new Baju("10", "Hoodie_Premium", "15", 299000, "foto6.jpg", "Sporty", "Fleece", "Abu-abu", "Remaja", "M", "Nike");

// Display all products
displayProducts($products, "All Products");

echo "<h2> El Psy Congroo </h2>";
?>

<!-- CSS styling -->
<style>
    table {
        border-collapse: collapse;
        width: 100%;
        margin: 20px 0;
    }
    th, td {
        padding: 10px;
        text-align: left;
        border: 1px solid #ddd;
    }
    th {
        background-color: #f2f2f2;
    }
    tr:nth-child(even) {
        background-color: #f9f9f9;
    }
    hr {
        margin: 20px 0;
        border: 1px solid #ccc;
    }
    h1, h2, h3 {
        color: #333;
    }
    img {
        max-width: 100px;
        height: auto;
    }
</style>