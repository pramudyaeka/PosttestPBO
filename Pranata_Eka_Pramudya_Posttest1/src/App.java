import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String nama, kategori, kode ;
        int stok, pilihan, harga;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<Gitar> gtr = new ArrayList<>();

        while (true)
        {
            System.out.println("=======================================");
            System.out.println(">>>> || DISTORTION GUITAR STORE || <<<<");
            System.out.println(">>>> ||  WELCOME TO OUR SOCIETY || <<<<");
            System.out.println("=======================================");
            System.out.println(">>>> || < 1 > Tambah Barang     || <<<<");
            System.out.println(">>>> || < 2 > Lihat Barang      || <<<<");
            System.out.println(">>>> || < 3 > Ubah Barang       || <<<<");
            System.out.println(">>>> || < 4 > Hapus Barang      || <<<<");
            System.out.println(">>>> || < 5 > Keluar            || <<<<");
            System.out.println("=======================================");

            System.out.print(">>>> || Masukkan Pilihan Anda : ");
            pilihan = Integer.parseInt(br.readLine());

            switch(pilihan)
            {
                // Tambah Data
                case 1: 
                System.out.println("=============================");
                System.out.println(">>>> || Tambah Barang || <<<<");
                System.out.println("=============================");
                System.out.print(">>>> || Nama Barang : ");
                nama = br.readLine();

                System.out.print(">>>> || Kategori Barang : ");
                kategori = br.readLine();

                System.out.print(">>>> || Stok : ");
                stok = Integer.parseInt(br.readLine());

                System.out.print(">>>> || Kode Barang : ");
                kode = br.readLine();

                System.out.print(">>>> || Harga Barang : ");
                harga = Integer.parseInt(br.readLine());

                Gitar dataBarang = new Gitar(nama, kategori,kode, stok, harga);
                gtr.add(dataBarang);
                System.out.println( " >>> Data Berhasil Ditambahkan <<<");
                break;

                // Lihat Data
                case 2 :
                System.out.println(">>>> || Lihat Data || <<<<");
                for (int i = 0; i < gtr.size(); i += 1)
                {
                    gtr.get(i).display();
                }
                break;

                // Ubah Data
                case 3 : 
                System.out.println("===========================");
                System.out.println(">>>> || Ubah Barang || <<<<");
                System.out.println("===========================");

                System.out.print("Masukkan Kode Barang : ");
                String code_barang = br.readLine();

                for (Gitar gitar : gtr)
                {
                    if (gitar.kode_barang.equals(code_barang))
                    {
                        System.out.print(">>>> || Nama Barang :  ");
                        gitar.setNama(br.readLine());
                        System.out.print(">>>> || Kategori Barang :  ");
                        gitar.setKategori(br.readLine());
                        System.out.print(">>>> || Stok Barang :  ");
                        gitar.setStok(Integer.parseInt(br.readLine()));
                        System.out.print(">>>> || Kode Barang :  ");
                        gitar.setKode(br.readLine());
                        System.out.print(">>>> || Harga Barang :  ");
                        gitar.setHarga(Integer.parseInt(br.readLine()));
                    }
                }
                break;


                // Hapus Data
                case 4 :
                System.out.println("===========================");
                System.out.println(">>>> || Hapus Barang || <<<<");
                System.out.println("===========================");

                System.out.print("Masukkan Kode Barang : ");
                String kodebarang = br.readLine();

                for (int i = 0; i < gtr.size(); i++)
                {
                    if(gtr.get(i).kode_barang.equals(kodebarang))
                    {
                        gtr.remove(i);
                        break;
                    }
                }

                // Keluar Program
                case 5 :
                System.exit(0);
                break;

            }
        }
    }
}
