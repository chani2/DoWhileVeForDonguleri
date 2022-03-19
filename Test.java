 import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur

        Scanner input = new Scanner(System.in);
        int sayi;

        /*for (boolean run = true; run;){
            System.out.println("Sayi Giriniz : ");
            sayi = input.nextInt();
            if (sayi < 0){
                run = false;
            }
        }
        */

        /*do {
            System.out.println(" SAyi giriniz :");
            sayi = input.nextInt();
        }while (sayi > 0);
        */

        /* for ( i = 0; i < 10; i++){
            System.out.println(i);
        } */

        /*int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }*/

        /*for (int i = 0; i <= 10; i++){  // 5 degerine gelince dur.
            if (i == 5){
                System.out.println("i degeri 5 :");
                break;
            }
            System.out.println(i);
        }*/

        for (int i = 0; i <= 10; i++){  // 5 degerini yazdirmadik.
            if (i == 5){

                continue;
            }
            System.out.println(i);
        }


    }
}