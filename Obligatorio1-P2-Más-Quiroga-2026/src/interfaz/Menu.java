package interfaz;

import java.util.Scanner;

public class Menu {

    public static void mostrarMenuPrincipal() {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("*----------------------------------------------*");
            System.out.println("|                Menú principal                |");
            System.out.println("*----------------------------------------------*");
            System.out.println("|   0) Terminar.                               |");
            System.out.println("|   1) Información de autores del obligatorio. |");
            System.out.println("|   2) Registrar diseñador.                    |");
            System.out.println("|   3) Registrar ficha.                        |");
            System.out.println("|   4) Creación de mural.                      |");
            System.out.println("|   5) Modificar mural.                        |");
            System.out.println("|   6) Visualizar mural.                       |");
            System.out.println("|   7) Listado de diseñadores.                 |");
            System.out.println("|   8) Comparar similitud de murales.          |");
            System.out.println("|   9) Visualizar todas las fichas.            |");
            System.out.println("*----------------------------------------------*");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    continuar = false;
                    break;

                case 1:
                    System.out.println("*---------------------------------------*");
                    System.out.println("|               Créditos                |");
                    System.out.println("*---------------------------------------*");
                    System.out.println("| Ignacio Nicolás Quiroga Lema (385781) |");
                    System.out.println("| Mateo Romualdo Más Lukinskas (375845) |");
                    System.out.println("*---------------------------------------*");
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Opción en desarrollo.");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Opción en desarrollo.");
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Opción en desarrollo.");
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Opción en desarrollo.");
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("Opción en desarrollo.");
                    System.out.println("");
                    break;

                case 7:
                    System.out.println("Opción en desarrollo.");
                    System.out.println("");
                    break;

                case 8:
                    System.out.println("Opción en desarrollo.");
                    System.out.println("");
                    break;

                case 9:
                    System.out.println("Opción en desarrollo.");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción inválida, elija otra.");
                    System.out.println("");
                    break;
            }
        }
    }
}
