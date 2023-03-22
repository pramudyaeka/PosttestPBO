package posttest3pbo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
public class Posttest3PBO {

    public static void main(String[] args) throws IOException {
        int pilihan;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<GitarAkustik> gtrAcc = new ArrayList<>();
        ArrayList<GitarElektrik> gtrElec = new ArrayList<>();

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
                System.out.println(">>>> || < 1 > Gitar Akustik  || <<<<");
                System.out.println(">>>> || < 2 > Gitar Elektrik || <<<<");
                System.out.print(">>>> Masukkan Pilihan Anda : ");
                Integer pilihtambah = Integer.parseInt(br.readLine());
                
                if(pilihtambah == 1)
                {
                    System.out.print(">>>> || Nama Barang : ");
                String nama = br.readLine();

                System.out.print(">>>> || Stok : ");
                int stok = Integer.parseInt(br.readLine());

                System.out.print(">>>> || Harga Barang : ");
                int harga = Integer.parseInt(br.readLine());

                System.out.print(">>>> || Kode Barang : ");
                String kode = br.readLine();
                
                System.out.print(">>>> || Jenis Kayu : ");
                String jenis_kayu = br.readLine();
                
                GitarAkustik dataBarang = new GitarAkustik(nama, stok, harga,kode, jenis_kayu);
                gtrAcc.add(dataBarang);
                System.out.println(">>> ========================== <<<");
                System.out.println( ">>> Data Berhasil Ditambahkan <<<");
                break;
                }
                
                else if(pilihtambah == 2)
                
                {
                    System.out.print(">>>> || Nama Barang : ");
                String nama = br.readLine();

                System.out.print(">>>> || Stok : ");
                int stok = Integer.parseInt(br.readLine());

                System.out.print(">>>> || Harga Barang : ");
                int harga = Integer.parseInt(br.readLine());
                
                System.out.print(">>>> || Kode Barang : ");
                String kodeElec = br.readLine();
                
                System.out.print(">>>> || jenis Pickup : ");
                String pickup = br.readLine();

                GitarElektrik dataBarangElec = new GitarElektrik(nama, stok, harga, kodeElec, pickup);
                gtrElec.add(dataBarangElec);
                
                System.out.println(">>> ========================== <<<");
                System.out.println( ">>> Data Berhasil Ditambahkan <<<");
                break;
                }
                

                // Lihat Data
                case 2 :
                System.out.println("=====================================");
                System.out.println(">>>> ||      Lihat Barang     || <<<<");
                System.out.println("=====================================");
                System.out.println(">>>> || < 1 > Gitar Akustik  || <<<<");
                System.out.println(">>>> || < 2 > Gitar Elektrik || <<<<");
                System.out.print(">>>> Masukkan Pilihan Anda : ");
                Integer pilihBaca = Integer.parseInt(br.readLine());
                
                if(pilihBaca == 1)
                {
                        for (int i = 0; i < gtrAcc.size(); i += 1)
                    {
                        System.out.println("============================================");
                        System.out.println(">>>> || Nama Barang     : "+ gtrAcc.get(i).getNama());
                        System.out.println(">>>> || Stok Barang     : "+ gtrAcc.get(i).getStok());
                        System.out.println(">>>> || Harga Barang    : "+ gtrAcc.get(i).getHarga());
                        System.out.println(">>>> || Kode Barang     : "+ gtrAcc.get(i).getKode());
                        System.out.println(">>>> || Jenis Kayu      : "+ gtrAcc.get(i).getJenis_kayu());
                        System.out.println("=============================================");
                    }
                }
                else if (pilihBaca == 2)
                {
                    for (int i = 0; i < gtrElec.size(); i += 1)
                    {
                        System.out.println("============================================");
                        System.out.println(">>>> || Nama Barang     : "+ gtrElec.get(i).getNama());
                        System.out.println(">>>> || Stok Barang     : "+ gtrElec.get(i).getStok());
                        System.out.println(">>>> || Harga Barang    : "+ gtrElec.get(i).getHarga());
                        System.out.println(">>>> || Kode Barang     : "+ gtrElec.get(i).getKodeElec());
                        System.out.println(">>>> || Jenis Pickup    : "+ gtrElec.get(i).getPickup());
                        System.out.println("=============================================");
                    }
                }
                
                break;

                // Ubah Data
                case 3 : 
                System.out.println("====================================");
                System.out.println(">>>> ||     Ubah  Barang     || <<<<");
                System.out.println("====================================");
                System.out.println(">>>> || < 1 > Gitar Akustik  || <<<<");
                System.out.println(">>>> || < 2 > Gitar Elektrik || <<<<");
                System.out.print(">>>> Masukkan Pilihan Anda : ");
                Integer pilihUbah = Integer.parseInt(br.readLine());
                
                if(pilihUbah == 1)
                {
                    System.out.print("Masukkan Kode Barang : ");
                String code_barang = br.readLine();

                    for (GitarAkustik acc : gtrAcc)
                    {
                        if (acc.getKode().equals(code_barang))
                        {
                            System.out.print(">>>> || Nama Barang :  ");
                            acc.setNama(br.readLine());
                            System.out.print(">>>> || Stok Barang :  ");
                            acc.setStok(Integer.parseInt(br.readLine()));
                            System.out.print(">>>> || Kode Barang :  ");
                            acc.setKode(br.readLine());
                            System.out.print(">>>> || Harga Barang :  ");
                            acc.setHarga(Integer.parseInt(br.readLine()));
                            System.out.print(">>>> || jenis Kayu :  ");
                            acc.setJenis_kayu(br.readLine());

                        }
                    }
                }
                
                else if(pilihUbah == 2)
                {
                    System.out.print("Masukkan Kode Barang : ");
                    String code_barang = br.readLine();
                    for (GitarElektrik elec : gtrElec)
                    {
                        if (elec.getKodeElec().equals(code_barang))
                        {
                            System.out.print(">>>> || Nama Barang :  ");
                            elec.setNama(br.readLine());
                            System.out.print(">>>> || Stok Barang :  ");
                            elec.setStok(Integer.parseInt(br.readLine()));
                            System.out.print(">>>> || Kode Barang :  ");
                            elec.setKodeElec(br.readLine());
                            System.out.print(">>>> || Harga Barang :  ");
                            elec.setHarga(Integer.parseInt(br.readLine()));
                            System.out.print(">>>> || jenis Kayu :  ");
                            elec.setPickup(br.readLine());

                        }
                    }
                }
                
                break;


                // Hapus Data
                case 4 :
                    System.out.println("====================================");
                    System.out.println(">>>> ||     Ubah  Barang     || <<<<");
                    System.out.println("====================================");
                    System.out.println(">>>> || < 1 > Gitar Akustik  || <<<<");
                    System.out.println(">>>> || < 2 > Gitar Elektrik || <<<<");
                    System.out.print(">>>> Masukkan Pilihan Anda : ");
                    Integer pilihHapus = Integer.parseInt(br.readLine());
                    
                    if (pilihHapus == 1)
                    {
                        System.out.print("Masukkan Kode Barang : ");
                    String kodebarang = br.readLine();

                        for (int i = 0; i < gtrAcc.size(); i++)
                        {
                            if(gtrAcc.get(i).getKode().equals(kodebarang))
                            {
                                gtrAcc.remove(i);
                            }
                        }
                    }
                
                else if (pilihHapus == 2)
                {
                    System.out.print("Masukkan Kode Barang : ");
                    String kodebarang = br.readLine();

                    for (int i = 0; i < gtrElec.size(); i++)
                    {
                        if(gtrElec.get(i).getKodeElec().equals(kodebarang))
                        {
                            gtrElec.remove(i);
                        }
                    }
                }
                break;

                // Keluar Program
                case 5 :
                System.exit(0);
                break;

            }
        }
        
    }

}
