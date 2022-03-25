package Giris;
import java.util.Scanner;
public class notOrtalamasi {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,resim;
        double ort;

        Scanner input=new Scanner(System.in);

        System.out.println("Matematik notu: ");
        mat=input.nextInt();

        System.out.println("Fizik notu: ");
        fizik=input.nextInt();

        System.out.println("Kimya notu: ");
        kimya=input.nextInt();

        System.out.println("Türkçe notu: ");
        turkce=input.nextInt();

        System.out.println("Tarih notu: ");
        tarih=input.nextInt();

        System.out.println("Türkçe notu: ");
        resim=input.nextInt();


        ort=(mat+fizik+kimya+turkce50+tarih+resim)/6.0;
        System.out.println("Bu dört dersinizin ortalaması: "+ort);

        String str= ort>=50 ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";
        System.out.println(str);



    }
}