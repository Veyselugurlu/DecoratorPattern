public class Main {
    public static void main(String[] args) {

        Bilgisayar temelBilgisayar = new TemelBilgisayar();
        System.out.println("Fiyat: "+temelBilgisayar.fiyat()+ "TL" );
        System.out.println("Açıklma: " + temelBilgisayar.aciklama());

        //Ram eklenmiş

        Bilgisayar ramBilgisayar = new RamEkleDecaoter(new TemelBilgisayar(),32);
        System.out.println("Fiyat: "+ramBilgisayar.fiyat()+ " TL");
        System.out.println("Açıklama: " + ramBilgisayar.aciklama());

        //depolama birimi ve ram eklenen

        Bilgisayar depolomaRamliBilgisayar = new DepolamaBirimiEkleDecaroter(new RamEkleDecaoter(new TemelBilgisayar(),32),1);
        System.out.println("Fiyat: "+depolomaRamliBilgisayar.fiyat()+ " TL");
        System.out.println("Açıklama: "+depolomaRamliBilgisayar.aciklama());

        //sadece depolama

        Bilgisayar depolamaBilgisayar = new DepolamaBirimiEkleDecaroter(new TemelBilgisayar(),512);
        System.out.println("Fiyat: "+depolamaBilgisayar.fiyat()+ " TL");
        System.out.println("Açıklama: " +depolamaBilgisayar.aciklama());

      
    }
}