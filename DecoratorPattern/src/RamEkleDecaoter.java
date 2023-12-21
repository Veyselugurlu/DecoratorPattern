public class RamEkleDecaoter extends BilgisayarDecorator{
    private int ramBoyutu;
    
    public RamEkleDecaoter(Bilgisayar bilgisayar,int ram)
    {
        super(bilgisayar);
        this.ramBoyutu=ram;
    }

    @Override
    public double fiyat() 
    {
      if(ramBoyutu == 8)
        {
            return super.fiyat() + 2500;
        }
        else if (ramBoyutu == 32){
            return super.fiyat() + 5000;
        }
        else{
            return super.fiyat();
        }
    }
    @Override
    public String aciklama() {
        return super.aciklama()+this.ramBoyutu+" Gb Ram eklendi ";
    }
    

    

}
