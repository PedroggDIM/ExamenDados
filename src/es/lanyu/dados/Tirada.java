package es.lanyu.dados;

import java.util.Arrays;
import java.util.Iterator;

public class Tirada {

	private int[] carasVistas;

	public int[] getCarasVistas() {
		return carasVistas;
	}

	protected void setCarasVistas(int[] carasVistas) {
		this.carasVistas = carasVistas;
	}
	
	// hacer tirada
	
	public int[] hacerTirada(String tipoTirada) { 
		String[] tirada = tipoTirada.split("");
		int numeroLanzamientos = Integer.parseInt(tirada[0]);
		int numeroCaras = Integer.parseInt(tirada[tirada.length -1]);
		Dado dado = new Dado(numeroCaras);
		int[] carasVistas = new int [numeroLanzamientos];
		for (int i = 0; i < numeroLanzamientos; i++) {
			dado.lanzar();
			carasVistas[i] = dado.getCaraVista();
		}		
		this.carasVistas = carasVistas;
		return carasVistas;
	}
	
	public int[] hacerTirada(Dado dado, int numeroLanzamientos) {
		int[] carasVistas = new int [numeroLanzamientos];
		for (int i = 0; i < numeroLanzamientos; i++) {
			dado.lanzar();
			carasVistas[i] = dado.getCaraVista();
		}		
		this.carasVistas = carasVistas;
		return carasVistas;
	}

	@Override
	public String toString() {
		return "Tirada: " + Arrays.toString(getCarasVistas());
				
	}

	public int sumaTirada() {
		 int sumaTirada = 0;
		for (int i = 0; i < getCarasVistas().length; i++) {
			sumaTirada += getCarasVistas()[i];
		}
		return sumaTirada;
	}
	
	
	
	
}
