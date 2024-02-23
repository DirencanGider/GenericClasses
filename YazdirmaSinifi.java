public class YazdirmaSinifi<E> {  //  Mantık: Bu class'a farklı veri tipleri gönderdiğimizde E olan heryere bu veri tiplerini yazacak.  //  6

    public void yazdir(E[] dizi) {  //  Generic metodumuzu yazdık.  //  7

        for (E e : dizi) {  //  Dizilerimizi yazdırmak için foreach döngüsü kullandık.  //  8

            System.out.println(e);

        }

    }

}
