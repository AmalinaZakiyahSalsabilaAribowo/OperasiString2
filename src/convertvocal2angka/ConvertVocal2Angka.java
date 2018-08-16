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




private static String vocal2Angka(String kalimat){
    char [][] arConvert =
    {{'a','4'},{'1','1'},{'u','2'},{'e','3'},{'o','0'}};
                
    kalimat = kalimat.toLowerCase();
    for(int i=0;i<arConvert.length;i++)
        kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
                
    return kalimat;    
}
}