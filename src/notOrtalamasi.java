package Giris;
import java.util.Scanner;
public class notOrtalamasi {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce;
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


        ort=(mat+fizik+kimya+turkce)/4.0;
        System.out.println("Bu dört dersinizin ortalaması: "+ort);

        String str= ort>=60 ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";
        System.out.println(str);



    }
}