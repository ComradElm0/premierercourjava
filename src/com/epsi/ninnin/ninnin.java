package com.epsi.ninnin;

import java.util.Scanner;

public class ninnin {
	public static void main(String[] args) {
		System.out.println("rentreunevaleurbatard");
		String valeur = new Scanner(System.in).nextLine();
		int nombre = Integer.parseInt(valeur);
		double square = Math.pow(nombre, 2);
		System.out.printf("le carré de %s résultat est %f%n", nombre, square);
	}
}