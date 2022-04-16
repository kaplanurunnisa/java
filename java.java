import java.util.Scanner;

public class java {
    public static void main(String[] args) {

        System.out.println("Ortalamanızı Hesaplamak İstiyorsanız Aşağıdaki sorlara cevap veriniz:)");
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        double mat=input.nextDouble();
        System.out.print("Fizik notunuzu giriniz: ");
        double fiz=input.nextDouble();
        System.out.print("Kimya notunuzu giriniz: ");
        double kim=input.nextDouble();
        System.out.print("Türkçe notunuzu giriniz: ");
        double tr=input.nextDouble();
        System.out.print("Tarih notunuzu giriniz: ");
        double tar=input.nextDouble();
        System.out.print("Müzik notunuzu giriniz: ");
        double muz=input.nextDouble();

        double ortalama=(mat+fiz+kim+tr+tar+muz)/6;
        System.out.println("Ortalamanız: "+Math.round(ortalama));


    }
}
