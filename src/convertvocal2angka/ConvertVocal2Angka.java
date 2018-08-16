package convertvocal2angka;
import java.util.Scanner;
import java.util.Locale;
public class ConvertVocal2Angka {

    private static void tampilJudul (String identitas){
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
        
        
        
        String Identitas = "Amalina Zakiyah Salsabila Aribowo / XRPL 2 / 04";
        
        tampilJudul (Identitas);
        
        
        
    }
            private static String tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
    String kalimat = tampilInput();

}
