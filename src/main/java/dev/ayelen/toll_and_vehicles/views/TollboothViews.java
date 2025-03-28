package dev.ayelen.toll_and_vehicles.views;

import java.util.Scanner;

public class TollboothViews {
    Scanner scanner = new Scanner(System.in);

    public void index() {
        System.out.println("======================================="); 
        System.out.println(" Estación de Peaje: \"Peaje Central\""); 
        System.out.println(" Ciudad: Llanera, Asturias");   
    }

    public void options() {
        System.out.println("=======================================");
        System.out.println("1. Realizar cobros");
        System.out.println("2. Cierre del día");
        System.out.println("3. Salir");

        int option = scanner.nextInt();
    }

}
