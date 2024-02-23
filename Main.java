import java.sql.SQLOutput;
import java.util.ArrayList;

/*

Şuana kadar yazmış olduğumuz metodlar sadece tek bir tür için çalışıyordu.

Örneğin, Bir toplama fonksiyonu yazdığımızda fonksiyon içerisindeki parametreler "int toplama (int a, int b, int c);" gibi
int değerler bekliyordu. Parantez içerisine String bir değer yazarsak hata alıyorduk.

Generic sınıflar içerisinde yazılmış metodlarda ise veri tipini istediğimiz şekilde belirleyebiliyoruz.

Yani classları ve metodları türden bağımsız olarak kullanabiliyoruz.

Örneğin; bir ArrayList oluştururken köşeli parantez içerisine String class veya da Wrapper Classlardan birini yazarsak/gönderirsek onunla
işlem yapabiliyoruz. ArrayList<String> arraylist = {"Direncan", "Gider"} gibi. ArrayList üzerine Ctrl + Click yaparak gittiğimizde
köşeli parantez içlerinin <E> şeklinde olduğunu görüyoruz. <E> tanımlanmış heryer tanımladığımız Class'ın veri tipine göre değişiyor.
String verirsek E olan heryer String oluyor. Integer verirsek yine aynı şekilde heryer Integer oluyor. Bu <E> kısmına oluşturmuş
olduğumuz farklı bir class'ı da gönderebiliriz.

Derste biz de bu ArrayList class'ının içerisindeki metoda benzer bir metod oluşturacağız ve sonra bu generic metodu kullanacağız.

 */
public class Main {

    public static void main(String[] args) {

        ArrayList<String> arraylist1 = new ArrayList<String>();  //  1

            ArrayList<Integer> arraylist2 = new ArrayList<Integer>();  //  2

        // Ctrl basılı iken ArrayList üzerine tıkladık ve class'ına gittik. Nasıl yazıldığını inceledik.  //  3

        // Şimdi de 4 adet farklı veri tipinde arrayler/diziler oluşturalım.  //  4

        Character[] char_dizi = {'J','A','V','A'};

        Integer[] integer_dizi = {1,2,3,4,5,6};

        String[] string_dizi = {"Java", "Python", "C++", "Php"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Direncan"), new Ogrenci("Mustafa"), new Ogrenci("Mehmet")};
        /* Bu öğrenci dizisi oluşturma satırı hata verdi. Çünkü Ogrenci class'ı yoktu. Hemen aşağıda main metodu dışında
           Ogrenci class'ı oluşturdum. İçerisine "public String isim;" özelliği ekledim. Sonrasında da altına Generate diyerek
            toString() metodunu override ettim. Bunu daha öncesind ehiç kullanmamıştık. Bu */  //  10

        //  Şimdi YazdirmaSinifi adında bir Generic sınıf oluşturalım ve kullanmaya çalışalım.  //  5


        // YazdirmaSinifi'ndan 4 tane obje oluşturacağız.  //  9

        YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();  //  15
        YazdirmaSinifi<Integer> yazdir_integer = new YazdirmaSinifi<Integer>();  //  16
        YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();  //  17
        YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();  //  18


        System.out.println("*****************************");

        yazdir_char.yazdir(char_dizi);  //  19

        System.out.println("*****************************");

        yazdir_integer.yazdir(integer_dizi);  //  20

        System.out.println("*****************************");

        yazdir_string.yazdir(string_dizi);  //  21

        System.out.println("*****************************");

        yazdir_ogrenci.yazdir(ogrenci_dizi);  //  22





    }
    public static class Ogrenci {  //  11

        public String isim;  //  12

        public Ogrenci(String isim) {  //  13
            this.isim = isim;
        }

        @Override
        public String toString() {  /* Daha önce bu metodu kullanmamıştık. Bu metod, Object class'ının bir metodu. Sağ tıklayıp
                                       Generate dediğimiz de diğer Object metodlarını da gözlemleyebiliriz. bu toString()
                                       metodunu tanımladığımızda*/ //  14
            return "Ogrenci{" +
                    "isim='" + isim + '\'' +
                    '}';
        }
    }

    /* İşin özeti; 4 dizi oluşturduk ve bu 4 dizi için ayrı ayrı classlar oluşturmak yerine tek bir YazdirmaSinifi adlı
       generic class oluşturup bunları yazdırdık. 4 dizi değil 20 dizi de olsaydı, aynı rahatlıkta yazdırabilirdik. Fakat 20 dizi
       için, generic sınıf yerine normal yoldan gitmiş olsaydık 20 farklı class oluşturmamız gerekecekti. */  //  23


}
