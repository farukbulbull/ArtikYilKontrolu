import java.util.Scanner;

public class ArtikYilKontrolu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir yıl girin: ");
        int yil = scanner.nextInt();
        
        if (artikYilMi(yil)) {
            System.out.println(yil + " yılı bir artık yıldır.");
        } else {
            System.out.println(yil + " yılı bir artık yıl değildir.");
        }
        
        scanner.close();
    }

    public static boolean artikYilMi(int yil) {
        // Artık yıl hesaplama kuralları
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    return true; // 400'e tam bölünüyorsa artık yıldır
                } else {
                    return false; // 100'e tam bölünüp 400'e bölünmüyorsa artık yıl değildir
                }
            } else {
                return true; // 4'e tam bölünüyorsa artık yıldır
            }
        }
        return false; // 4'e tam bölünmüyorsa artık yıl değildir
    }
}
