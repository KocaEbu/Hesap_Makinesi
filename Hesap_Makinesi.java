import java.util.Scanner;
public class Hesap_Makinesi {

    public static void main(String[] args) {
        double n1, n2;
        int select;
        Scanner input= new Scanner(System.in);

        System.out.println("Islem yapmak istediginiz ilk sayinizi (n1) giriniz: ");
        n1= input.nextDouble();

        System.out.println("Islem yapmak istediginiz ikinci sayinizi (n2) giriniz: ");
        n2= input.nextDouble();

        System.out.println("Sayilarinizi girdiniz, simdi yapmak istediginiz islemin numarasini giriniz : ");
        System.out.println("1:Topla(n1+n2)\n2:Cikart(n1-n2)\n3:Carp(n1*n2)\n4:Bol(n1/n2)");
        select= input.nextInt();

        switch (select){

            case 1 :
                System.out.println(n1+n2);
                break;
            case 2 :
                System.out.println(n1 - n2);
                break;
            case 3 :
                System.out.println(n1*n2);
                break;
            case 4 :
                System.out.println(n1/n2);
                break;

            default:
                System.out.println("Girdiginiz islem degerini kontrol ediniz...");

        }



    }
}
