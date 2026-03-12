package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VistaMenú extends VistaGeneral {
	private String titulo;
	private List<String> opciones;

	public VistaMenú(String titulo, String[] opciones) {
		this.titulo = titulo;
		this.opciones = new ArrayList<>(Arrays.asList(opciones));
	}

	public void mostrarTitulo() {
		System.out.println(titulo);
		for (int i = 0; i < titulo.length(); i++) {
			System.out.print("_");
		}
		System.out.println();
	}

	public void mostrarOpciones() {
		mostrarTitulo();
		for (int i = 0; i < opciones.size(); i++) {
			System.out.print((i + 1) + ") ");
			System.out.print(opciones.get(i));
			System.out.println();
		}
		System.out.println("0) Salir");
	}

	public int pedirOpción() {
		return pedirNumero("Elija una opción");
	}

	public String mostrarTexto(String texto) {
		System.out.println(texto);
		return texto;
	}
}