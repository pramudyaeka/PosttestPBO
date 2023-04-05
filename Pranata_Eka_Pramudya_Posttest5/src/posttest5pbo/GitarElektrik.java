package posttest5pbo;
public class GitarElektrik extends Gitar 
{
    private String kodeElec;
    protected String pickup;
    
    public GitarElektrik (String nama, int stok, int harga, String kodeElec, String pickup)
    {
        super(nama, stok, harga);
        this.kodeElec = kodeElec;
        this.pickup = pickup;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getKodeElec() {
        return kodeElec;
    }

    public void setKodeElec(String kodeElec) {
        this.kodeElec = kodeElec;
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.println(">>>> || Jenis Pickup      : "+ this.pickup);
        System.out.println("=============================================");
    }
}
