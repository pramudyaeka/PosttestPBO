package posttest6pbo;
public class GitarAkustik extends Gitar 
{
    private String kode;
    protected String jenis_kayu;
    
    public GitarAkustik (String nama, int stok, int harga, String kode, String jenis_kayu)
    {
        super(nama,stok, harga);
        this.kode = kode;
        this.jenis_kayu = jenis_kayu;
    }

    public String getJenis_kayu() {
        return jenis_kayu;
    }

    public void setJenis_kayu(String jenis_kayu) {
        this.jenis_kayu = jenis_kayu;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
//    Override
    @Override
    public void display()
    {
        super.display();
        System.out.println(">>>> || Jenis Kayu      : "+ jenis_kayu);
        System.out.println("=============================================");
    }
}
