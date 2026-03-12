package jcolonia.daw2025.tablasmvc;
import java.util.Scanner;
import java.util.List;

public class VistaGeneral {
    private static Scanner sc = new Scanner(System.in);
    public static int pedirNumero(String texto) {
        System.out.print(texto + ": ");
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }
    public static void mostrarAviso(String texto) {
        System.out.println("!!! " + texto);
    }
    public static void mostrarLista(List<String> lista) {
        for (String elemento : lista) {
            System.out.println(" * " + elemento);
        }
    }
}