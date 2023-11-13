import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Konversi Suhu");
        System.out.print("Masukkan jenis suhu yang akan dikonversi (F untuk Fahrenheit, R untuk Reamur): ");
        char temperatureType = scanner.next().charAt(0);

        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();

        double result = 0;

        switch (temperatureType) {
            case 'F':
            case 'f':
                result = celsiusToFahrenheit(celsius);
                break;
            case 'R':
            case 'r':
                result = celsiusToReamur(celsius);
                break;
            default:
                System.out.println("Jenis suhu tidak valid. Program berhenti.");
                System.exit(0);
        }

        System.out.println("Hasil konversi: " + result);

        // Validasi kelipatan 2 dan 5
        if (isValid(result)) {
            System.out.println("Hasil konversi adalah kelipatan 2 dan 5.");
        } else {
            System.out.println("Hasil konversi bukan kelipatan 2 dan 5.");
        }

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double celsiusToReamur(double celsius) {
        return celsius * 4 / 5;
    }

    private static boolean isValid(double result) {
        return result % 2 == 0 && result % 5 == 0;
    }
}