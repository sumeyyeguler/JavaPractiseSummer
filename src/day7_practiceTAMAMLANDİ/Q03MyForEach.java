package day7_practiceTAMAMLANDİ;

public class Q03MyForEach {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int arr[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};

        ciftToplaYaz(arr);

    }

    private static void ciftToplaYaz(int[][] arr) {
        int toplam = 0;
        for (int[] each1 : arr) {
            for (int each2 : each1
            ) {
                if (each2 % 2 == 0) {
                    toplam += each2;
                }

            }

        }
        System.out.println("çift sayilar toplami : " + toplam);
    }
}
