import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        //DEĞİŞKEN OLUŞTUR.
        int mat, fizik, kimya, turkce, tarih, muzik;


        //Scanner sınıfı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz:");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz:");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik );
        double sonuc = toplam / 6.0;
        System.out.println(" Ortalamanız : " + sonuc);
        System.out.print(sonuc>=60? "Geçtiniz":"Kaldınız" );







    }
}