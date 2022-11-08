import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        double sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        sonuc = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;

        if (sonuc>=60){
            System.out.println("Sınıfı geçtiniz. Ortalamanız : "+sonuc);
        }else
            System.out.println("Sınıfta kaldınız! Ortalamanız : "+sonuc);
    }
}