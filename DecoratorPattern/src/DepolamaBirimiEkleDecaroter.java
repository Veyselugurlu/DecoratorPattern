public class DepolamaBirimiEkleDecaroter extends BilgisayarDecorator{
    private int diskBoyutu;
    public DepolamaBirimiEkleDecaroter(Bilgisayar bilgisayar,int Boyut) {
        super(bilgisayar);
        this.diskBoyutu=Boyut;
    }

    @Override
    public double fiyat() {
        if(diskBoyutu == 512)
        {
            return super.fiyat()+ 5999;
        }
        else if (diskBoyutu == 1){
            return super.fiyat()+ 6999;       
        }
        else{
            return super.fiyat();
        }
    }

    @Override
    public String aciklama() {
        return super.aciklama()+ this.diskBoyutu + " GB SSD Disk eklendi.";
    }

  
}
