/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1_InventarisObat;

/**
 *
 * @author Putri
 */
public class mainObat {

    public static void main(String[] args) {

        Obat obat1 = new Obat(
                "OB001",
                "Paracetamol",
                "Tablet",
                5000,
                100);

        Obat obat2 = new Obat(
                "OB002",
                "Amoxicillin",
                "Kapsul",
                12000,
                50);

        System.out.println("=== DATA OBAT ===");

        obat1.tampilkanInfo();
        obat2.tampilkanInfo();

    }
}


