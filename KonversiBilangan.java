//Aulia Permata Kumala
//235150701111001

/*
Membuat Program Java untuk setiap konversi bilangan :
- Biner ke Desimal
- Desimal ke Biner
- Biner ke Hexa
- Hexa ke Biner
- Desimal ke Hexa
- Hexa ke Desimal
*/

import java.util.Scanner;

public class KonversiBilangan {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int konversiBilangan;
        do {
            System.out.println("\nMENU :");
            System.out.println("0. KELUAR");
            System.out.println("1. Konversi Bilangan Biner ke Desimal");
            System.out.println("2. Konversi Bilangan Desimal ke Biner");
            System.out.println("3. Konversi Bilangan Biner ke Hexa");
            System.out.println("4. Konversi Bilangan Hexa ke Biner");
            System.out.println("5. Konversi Bilangan Desimal ke Hexa");
            System.out.println("6. Konversi Bilangan Hexa ke Desimal");
            System.out.print("   MASUKKAN PILIHAN ANDA : ");

            konversiBilangan = input.nextInt();
            input.nextLine();

            switch (konversiBilangan) {
            case 0 :
                System.out.println("\nKeluar Dari Program");
                break;
            case 1 :
                System.out.print("\nMasukkan bilangan biner: ");
                String biner = input.next();
                int desimal = Integer.parseInt(biner, 2);
                System.out.println("Hasil konversi: " + desimal);
                break;
            case 2 :
                System.out.print("\nMasukkan bilangan desimal: ");
                int desimalInput = input.nextInt();
                String binerOutput = Integer.toBinaryString(desimalInput);
                System.out.println("Hasil konversi: " + binerOutput);
                break;
            case 3 :
                System.out.print("\nMasukkan bilangan biner: ");
                String binerInput = input.next();
                int desimalOutput = Integer.parseInt(binerInput, 2);
                String hexaOutput = Integer.toHexString(desimalOutput);
                System.out.println("Hasil konversi: " + hexaOutput);
                break;
            case 4 :
                System.out.print("\nMasukkan bilangan hexadesimal: ");
                String hexaInput = input.next();
                int desimalFromHexa = Integer.parseInt(hexaInput, 16);
                String binerFromHexa = Integer.toBinaryString(desimalFromHexa);
                System.out.println("Hasil konversi: " + binerFromHexa);
                break;
            case 5 :
                System.out.print("\nMasukkan bilangan desimal: ");
                int desimalToHexa = input.nextInt();
                String hexaOutputFromDesimal = Integer.toHexString(desimalToHexa);
                System.out.println("Hasil konversi: " + hexaOutputFromDesimal);
                break;
            case 6:
                System.out.print("\nMasukkan bilangan hexadesimal: ");
                String hexaToDesimal = input.next();
                int desimalFromHexaInput = Integer.parseInt(hexaToDesimal, 16);
                System.out.println("Hasil konversi: " + desimalFromHexaInput);
                break;
            default :
            System.out.println("\nPilihan tidak valid.");
            }  
        }while (konversiBilangan!=0);

        input.close();
    }
}