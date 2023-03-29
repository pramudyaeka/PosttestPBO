package posttest4pbo;

public class Gitar 
{    
    protected String nama, kategori;
    protected int stok, harga;
    
    public Gitar(String nama, int stok, int harga) 
    {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }


    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    void display()
    {
        System.out.println("============================================");
        System.out.println(">>>> || Nama Barang     : "+ this.nama);
        System.out.println(">>>> || Stok Barang     : "+ this.stok);
        System.out.println(">>>> || Harga Barang    : Rp. "+ this.harga);
        System.out.println("=============================================");
    }

    

}
