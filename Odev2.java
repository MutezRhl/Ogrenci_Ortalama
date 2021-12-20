/* klavyeden 20 öğrenciye ait ad,soyad,vize ve final notu bilgileri giriliyor.
ortalaması sınıfın ortalamasından yüsek olan öğrencinin bilgilerini geri dödüren metot ve java programı
*/ 

package odev2;
import java.util.Scanner;
public class Odev2 {
public static String[] ort(String[] ad,String[] soyad,int[] vize,int[] finaal){
    int sayac=0,ort=0;
    double genelOrt=0;
    String[] gecenOgr=new String[20]; 
    for(int i=0;i<ad.length;i++){
        ort+=(vize[i]+finaal[i])/2;
        sayac++;
        }
    if(sayac>0){
       genelOrt=ort/sayac;
    }
    for(int i=0;i<ad.length;i++){
        if((vize[i]+finaal[i])/2>=genelOrt){
            String vize1;
            vize1=Integer.toString(vize[i]);
            String final1;
            final1=Integer.toString(finaal[i]);
            gecenOgr[i]=ad[i]+" "+soyad[i]+": Vize notu= "+vize1+"   final notu= "+final1+"  Oğrencinin ortalaması= "+((vize[i]+finaal[i])/2)+" Geçti";
        }else{
            String vize1;
            vize1=Integer.toString(vize[i]);
            String final1;
            final1=Integer.toString(finaal[i]);
            gecenOgr[i]=ad[i]+" "+soyad[i]+": Vize notu= "+vize1+"   final notu= "+final1+"  Oğrencinin ortalaması= "+((vize[i]+finaal[i])/2)+" Geçmedi";
        }
    }
    return gecenOgr;
}
    
    public static void main(String[] args) {

        Scanner k=new Scanner (System.in);
        String[] ad1=new String[20];
        String[] soyad1=new String[20];
        int[] vize1=new int[20];
        int[] finall=new int[20];
        
        for(int i=0;i<ad1.length;i++){
            System.out.println((i+1)+".inci oğrencinin ismini giriniz");
            ad1[i]=k.next();
            System.out.println((i+1)+".inci oğrencinin soyadını giriniz");
            soyad1[i]=k.next();
            System.out.println((i+1)+".inci oğrencinin vize notunu giriniz");
            vize1[i]=k.nextInt();
            System.out.println((i+1)+".inci oğrencinin final notunu giriniz");
            finall[i]=k.nextInt();
        }
            String[] sonuc=new String[20];
            sonuc  = ort(ad1,soyad1,vize1,finall);
                for(int i=0;i<ad1.length;i++){
                    System.out.println(sonuc[i]);
                }
    }
    
}
