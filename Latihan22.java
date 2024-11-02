
package Pertemuan5;

import java.util.Scanner;

public class Latihan22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        double diameter = 0;

        System.out.println("======Perhitungan Lingkaran=====");

        while (!isValid) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String inputDiameter = input.nextLine();

            try {
                diameter = Double.parseDouble(inputDiameter);
                if (diameter <= 0) {
                    System.out.println("Nilai Diameter Tidak Sesuai\n");
                } else {
                    isValid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
            }
        }

        double jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = Math.PI * diameter;

        System.out.println("\n======Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran = %.0f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);
    }
}


