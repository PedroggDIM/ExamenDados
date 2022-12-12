package es.lanyu.dados;

import java.util.Random;


public class Dado implements Comparable<Dado>{

	private int[] caras;
	private int caraVista;
	private int numeroCaras;

	public int[] getCaras() {
		return caras;
	}

	public int getCaraVista() {
		return caraVista;
	}

	public int getNumeroCaras() {
		return numeroCaras;
	}

	protected void setCaras(int[] caras) {
		this.caras = caras;
	}

	protected void setCaraVista(int caraVista) {
		this.caraVista = caraVista;
	}

	protected void setNumeroCaras(int numeroCaras) {
		this.numeroCaras = numeroCaras;
	}

	public Dado(int numeroCaras) {
		setNumeroCaras(numeroCaras);
		this.caras = new int[numeroCaras];
		for(int i =0; i<numeroCaras;i++) {
			caras[i] = i+1;
		}
	}

	public Dado() {
      this(6);
	}
	
	public void lanzar() {		
		int minimo = getCaras()[0];
		int maximo= getCaras()[getNumeroCaras() - 1];
		int caraVista = (int) (Math.random() * (maximo - minimo + 1) + minimo);
		setCaraVista(caraVista);
	}

	@Override
	public String toString() {
		return getCaraVista() + " (" + getCaras()[0] + " . " +  getCaras()[getNumeroCaras() - 1] + " )";
			
	}

	@Override
	public int compareTo(Dado otroDado) {		
		return -Integer.compare(getCaraVista(), otroDado.getCaraVista());		
	}
	
	
	

}
