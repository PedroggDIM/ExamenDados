package com.dados;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import es.lanyu.dados.Dado;
import es.lanyu.dados.Tirada;

public class Partida {	
	
	public static void main(String[] args) {
		
		
		Dado dado7 = new Dado(7);
		
		dado7.lanzar();
		System.out.println(dado7);
		
		Dado dado= new Dado();
		dado.lanzar();
		Dado dado2= new Dado();
		dado2.lanzar();
		Dado dado3= new Dado();
		dado3.lanzar();
		
		Collection<Dado> coleccionDados = new ArrayList<Dado>();
		coleccionDados.add(dado);
		coleccionDados.add(dado2);
		coleccionDados.add(dado3);
		
		List<Dado> listaDados = new ArrayList<Dado>(coleccionDados);
		System.out.println("**Lista dados sin ordenar**");
		System.out.println(listaDados);
		listaDados.sort(null);
		System.out.println("**Lista dados ordenada***");
		System.out.println(listaDados);
		
		Tirada tirada1= new Tirada();
		tirada1.hacerTirada("2d8");
		Tirada tirada2= new Tirada();
		tirada2.hacerTirada("2d8");
		Tirada tirada3= new Tirada();
		tirada3.hacerTirada("2d8");
		
		Collection<Tirada> coleccionTiradas = new ArrayList<Tirada>();
		coleccionTiradas.add(tirada1);
		coleccionTiradas.add(tirada2);
		coleccionTiradas.add(tirada3);
		System.out.println("**Imprimo las tiradas sin ordenar**");
		System.out.println(coleccionTiradas);
	
		List<Tirada> listaTiradas = new ArrayList<Tirada>(coleccionTiradas);
			
		Comparator<Tirada> comparadorTiradas = new Comparator<Tirada>(){
			@Override
			public int compare(Tirada tirada1, Tirada tirada2) {
            int comparador = -Integer.compare(tirada1.sumaTirada(), tirada2.sumaTirada());
            if(comparador == 0) {
            	comparador = -Integer.compare(tirada1.getCarasVistas()[tirada1.getCarasVistas().length - 1],
            	             tirada2.getCarasVistas()[tirada1.getCarasVistas().length - 1]);
				
			}
			return comparador;
		}
	}; 
	System.out.println("**Imprimo las tiradas ordenadas**");

	  listaTiradas.sort(comparadorTiradas);
	  System.out.println(listaTiradas);
			
	}

}
