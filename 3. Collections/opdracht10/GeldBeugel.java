package opdracht10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GeldBeugel {

	public static void main(String[] args) {
		// integer declareren om later het totaal
		// aantal munten te berekenen
		int totaal = 0;

		// Hashmap sorteert keyvalues van laag naar hoog
		// Map<Integer, Enum<Coin>> beugel = new HashMap<>();

		// LinkedHashMap behoudt de volgorde waarin ze zijn toegevoegd
		// Bij de output krijg je dus exact hetzelfde als regel 21->28
		Map<Integer, Enum<Coin>> beugel = new LinkedHashMap<>();

		beugel.put(5, Coin.EENCENT);
		beugel.put(10, Coin.TWEECENT);
		beugel.put(2, Coin.VIJFCENT);
		beugel.put(3, Coin.TIENCENT);
		beugel.put(7, Coin.TWINTIGCENT);
		beugel.put(4, Coin.VIJFTIGCENT);
		beugel.put(9, Coin.EENEURO);
		beugel.put(12, Coin.TWEEEURO);

		// Met een foreach en lambda expressie de keys en
		// bijhorende values afdrukken
		beugel.forEach((k, v) -> System.out.println("Ik heb " + k + " muntstukken van " + v));

		// Alle keys optellen om het totaal aantal munten te berekenen
		for (Integer s : beugel.keySet()) {
			totaal += s;
		}

		// Totaal aantal munten afdrukken
		System.out.println("\nIk heb " + totaal + " muntstukken in het totaal");

	}

}
