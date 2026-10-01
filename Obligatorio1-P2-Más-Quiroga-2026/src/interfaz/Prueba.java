package interfaz;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Prueba {

    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
        Menu.mostrarMenuPrincipal();

    }

}
