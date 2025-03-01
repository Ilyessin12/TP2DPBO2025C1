import java.util.Scanner;
import java.util.ArrayList;


public class main {

    public static void tampilkan(int[] stringLength, ArrayList<Baju> products){

        //find the size of the string of the products
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getId().length() > stringLength[0]){
                stringLength[0] = products.get(i).getId().length();
            }
            if(products.get(i).getNama_produk().length() > stringLength[1]){
                stringLength[1] = products.get(i).getNama_produk().length();
            }
            if(products.get(i).getStok_produk().length() > stringLength[2]){
                stringLength[2] = products.get(i).getStok_produk().length();
            }
            if(String.valueOf(products.get(i).getHarga_produk()).length() > stringLength[3]){
                stringLength[3] = String.valueOf(products.get(i).getHarga_produk()).length();
            }
            if(products.get(i).getJenis().length() > stringLength[4]){
                stringLength[4] = products.get(i).getJenis().length();
            }
            if(products.get(i).getBahan().length() > stringLength[5]){
                stringLength[5] = products.get(i).getBahan().length();
            }
            if(products.get(i).getWarna().length() > stringLength[6]){
                stringLength[6] = products.get(i).getWarna().length();
            }
            if(products.get(i).getUntuk().length() > stringLength[7]){
                stringLength[7] = products.get(i).getUntuk().length();
            }
            if(products.get(i).getSize().length() > stringLength[8]){
                stringLength[8] = products.get(i).getSize().length();
            }
            if(products.get(i).getMerk().length() > stringLength[9]){
                stringLength[9] = products.get(i).getMerk().length();
            }
        }

        //print the table
        //first print the header
        //print the "===================== dynamicaly"
        System.out.print("+");
        for(int i = 0; i < stringLength.length; i++){
            for(int j = 0; j < stringLength[i] + 1; j++){
                System.out.print("=");
            }
            System.out.print("+");
        }
        System.out.println();
        //print the "ID" with the space
        System.out.print("|");
        System.out.print("ID");
        for(int i = 0; i < stringLength[0] - 2 + 1; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        //print the "Nama Produk" with the space
        System.out.print("Nama Produk");
        for(int i = 0; i < stringLength[1] - 11 + 1; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        //print the "Stok Produk" with the space
        System.out.print("Stok Produk");
        for(int i = 0; i < stringLength[2] - 11 + 1; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        //print the "Harga Produk" with the space
        System.out.print("Harga Produk");
        for(int i = 0; i < stringLength[3] - 12 + 1; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        //print the "Jenis" with the space
        System.out.print("Jenis");
        for(int i = 0; i < stringLength[4] - 5 + 1; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        //print the "Bahan" with the space
        System.out.print("Bahan");
        for(int i = 0; i < stringLength[5] - 5 + 1; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        //print the "Warna" with the space
        System.out.print("Warna");
        for(int i = 0; i < stringLength[6] - 5 + 1; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        //print the "Untuk" with the space
        System.out.print("Untuk");
        for(int i = 0; i < stringLength[7] - 5 + 1; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        //print the "Size" with the space
        System.out.print("Size");
        for(int i = 0; i < stringLength[8] - 4 + 1; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        //print the "Merk" with the space
        System.out.print("Merk");
        for(int i = 0; i < stringLength[9] - 4 + 1; i++){
            System.out.print(" ");
        }
        System.out.println("|");

        //print the "===================== dynamicaly"
        System.out.print("+");
        for(int i = 0; i < stringLength.length; i++){
            for(int j = 0; j < stringLength[i] + 1; j++){
                System.out.print("=");
            }
            System.out.print("+");
        }
        System.out.println();

        //print the products
        for(int i = 0; i < products.size(); i++){
            //print the "ID" with the space
            System.out.print("|");
            System.out.print(products.get(i).getId());
            for(int j = 0; j < stringLength[0] - products.get(i).getId().length() + 1; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            //print the "Nama Produk" with the space
            System.out.print(products.get(i).getNama_produk());
            for(int j = 0; j < stringLength[1] - products.get(i).getNama_produk().length() + 1; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            //print the "Stok Produk" with the space
            System.out.print(products.get(i).getStok_produk());
            for(int j = 0; j < stringLength[2] - products.get(i).getStok_produk().length() + 1; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            //print the "Harga Produk" with the space
            System.out.print(products.get(i).getHarga_produk());
            for(int j = 0; j < stringLength[3] - String.valueOf(products.get(i).getHarga_produk()).length() + 1; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            //print the "Jenis" with the space
            System.out.print(products.get(i).getJenis());
            for(int j = 0; j < stringLength[4] - products.get(i).getJenis().length() + 1; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            //print the "Bahan" with the space
            System.out.print(products.get(i).getBahan());
            for(int j = 0; j < stringLength[5] - products.get(i).getBahan().length() + 1; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            //print the "Warna" with the space
            System.out.print(products.get(i).getWarna());
            for(int j = 0; j < stringLength[6] - products.get(i).getWarna().length() + 1; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            //print the "Untuk" with the space
            System.out.print(products.get(i).getUntuk());
            for(int j = 0; j < stringLength[7] - products.get(i).getUntuk().length() + 1; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            //print the "Size" with the space
            System.out.print(products.get(i).getSize());
            for(int j = 0; j < stringLength[8] - products.get(i).getSize().length() + 1; j++){
                System.out.print(" ");
            }
            System.out.print("|");
            //print the "Merk" with the space
            System.out.print(products.get(i).getMerk());
            for(int j = 0; j < stringLength[9] - products.get(i).getMerk().length() + 1; j++){
                System.out.print(" ");
            }
            System.out.println("|");
        }

        //print the "===================== dynamicaly"
        System.out.print("+");
        for(int i = 0; i < stringLength.length; i++){
            for(int j = 0; j < stringLength[i] + 1; j++){
                System.out.print("=");
            }
            System.out.print("+");
        }
        System.out.println();
    }

    public static void main(String[] args){
        ArrayList<Baju> products = new ArrayList<Baju>();

        //variables for storing the input values of the products
        String id, nama_produk, stok_produk, jenis, bahan, warna, untuk, size, merk;
        int harga_produk;

        //first 5 products that are hardcoded
        Baju product1 = new Baju("1", "Baju Ryan Gosling", "10", 10000, "Gigachad", "Kain", "Putih", "Manusia", "XXL", "Adidas");
        Baju product2 = new Baju("2", "Baju Hidetaka Miyazaki", "11", 10000, "Sigma", "Kain", "Putih", "Manusia", "XXL", "Nikke");
        Baju product3 = new Baju("3", "Baju Takehiro Sakurai", "12", 10000, "Thundercock", "Kain", "Putih", "Manusia", "XXL", "Panther");
        Baju product4 = new Baju("4", "Baju Ryan Reynolds", "15", 10000, "Masco", "Kain", "Putih", "Manusia", "XXL", "Balenciaga");
        Baju product5 = new Baju("5", "Baju Brad Pitt", "69", 10000, "Fubar", "Kain", "Putih", "Manusia", "XXL", "Puma");


        
        //add the products to the arraylist
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        //store an array length of string length for dynamic table
        //ID = 3, Nama Produk = 11, Stok Produk = 11, Harga Produk = 12, Jenis = 5, Bahan = 5, Warna = 5, Untuk = 5, Size = 4, Merk = 4
        int[] stringLength = {2, 11, 11, 12, 5, 5, 5, 5, 4, 4};
        //check the length of the string of all the products, check if their sizes are bigger or not, if bigger then replace it if not then continue
        
        //tampilan awal
        tampilkan(stringLength, products);

        //initialize the scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah produk: ");
        int n = input.nextInt();  // Store the input in n
        //loop
        for(int i = 0; i < n; i++){
            System.out.print("Masukkan id produk: ");
            id = input.next();
            System.out.print("Masukkan nama produk: ");
            nama_produk = input.next();
            System.out.print("Masukkan stok produk: ");
            stok_produk = input.next();
            System.out.print("Masukkan harga produk: ");    
            harga_produk = input.nextInt();
            System.out.print("Masukkan jenis: ");
            jenis = input.next();
            System.out.print("Masukkan bahan: ");
            bahan = input.next();
            System.out.print("Masukkan warna: ");
            warna = input.next();
            System.out.print("Masukkan untuk: ");
            untuk = input.next();
            System.out.print("Masukkan size: ");
            size = input.next();
            System.out.print("Masukkan merk: ");
            merk = input.next();

            Baju product = new Baju(id, nama_produk, stok_produk, harga_produk, jenis, bahan, warna, untuk, size, merk);
            products.add(product);
        }

        //update string length
        tampilkan(stringLength, products);

        input.close();
    }
}
