public class Gitar 
{    
    String nama_barang, kategori_barang, kode_barang;
    int stok_barang, harga_barang;
    
    public Gitar(String nama, String kategori, String kode, int stok, int harga) 
    {
        this.nama_barang = nama;
        this.kategori_barang = kategori;
        this.stok_barang = stok;
        this.kode_barang = kode;
        this.harga_barang = harga;
    }

    void display()
    {
        System.out.println("============================================");
        System.out.println(">>>> || Nama Barang     : "+ this.nama_barang);
        System.out.println(">>>> || Kategori Barang : "+ this.kategori_barang);
        System.out.println(">>>> || Stok Barang     : "+ this.stok_barang);
        System.out.println(">>>> || Kode Barang     : "+ this.kode_barang);
        System.out.println(">>>> || Harga Barang    : "+ this.harga_barang);
        System.out.println("=============================================");
    }

    public void setNama( String namaBarang)
    {
        this.nama_barang = namaBarang;
    }
    public void setKategori( String kategoriBarang)
    {
        this.kategori_barang = kategoriBarang;
    }
    public void setStok( Integer stokBarang)
    {
        this.stok_barang = stokBarang;
    }
    public void setKode( String kodeBarang)
    {
        this.kode_barang = kodeBarang;
    }
    public void setHarga( Integer hargaBarang)
    {
        this.harga_barang = hargaBarang;
    }
    
}
