public class Gitar 
{    
    private String nama_barang, kategori_barang, kode_barang;
    private int stok_barang, harga_barang;
    
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

    // Setter
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

    // Getter
    public String getNama()
    {
        return nama_barang;
    }

    public String getKategori()
    {
        return kategori_barang;
    }

    public int getStok()
    {
        return stok_barang;
    }

    public String getKode()
    {
        return kode_barang;
    }

    public int getHarga()
    {
        return harga_barang;
    }
    
}
