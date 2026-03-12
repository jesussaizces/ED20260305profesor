package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

public class TablaMultiplicar {

	private int numero;
	private List<String> listaTextos;

	public TablaMultiplicar(int numero) {
		this.numero = numero;
		this.listaTextos = new ArrayList<>();
		generarTabla();
	}

	public int getNumero() {
		return numero;
	}

	public void generarTabla() {
		listaTextos.clear();
		for (int i = 0; i <= 10; i++) {
			listaTextos.add(numero + " x " + i + " = " + (numero * i));
		}
	}

	public List<String> toListaExportacion() {
		return new ArrayList<>(listaTextos);
	}

	public List<String> toListaPantalla() {
		return listaTextos;
	}

	@Override
	public String toString() {
		return "Tabla de multiplicar del " + numero;
	}
}