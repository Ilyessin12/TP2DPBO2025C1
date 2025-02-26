import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        ArrayList<Baju> products = new ArrayList<Baju>();


        //variables for storing the input values of the products
        String id, nama_produk, stok_produk, jenis, bahan, warna, untuk, size, merk;
        int harga_produk;

        //first 5 products that are hardcoded
        Baju product1 = new Baju("1", "Baju Ryan Gosling", "10", 10000, "Gigachad", "Kain", "Putih", "Manusia", "XXL", "Adidas");
        
        //add the products to the arraylist
        products.add(product1);

        //initialize the scanner
        Scanner input = new Scanner(System.in);
        int n = 0;
        input.nextInt();
        //loop
        for(int i = 0; i < n; i++){
            id = input.next();
            nama_produk = input.next();
            stok_produk = input.next();
            harga_produk = input.nextInt();
            jenis = input.next();
            bahan = input.next();
            warna = input.next();
            untuk = input.next();
            size = input.next();
            merk = input.next();

            Baju product = new Baju(id, nama_produk, stok_produk, harga_produk, jenis, bahan, warna, untuk, size, merk);
            products.add(product);
        }

    }
}
