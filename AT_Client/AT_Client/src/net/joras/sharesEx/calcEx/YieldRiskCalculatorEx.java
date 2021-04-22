package net.joras.sharesEx.calcEx;

import java.util.ArrayList;
import java.util.List;

public class YieldRiskCalculatorEx {

	public YieldRiskCalculatorEx() {}
	
	public double geoPAK(double currentPrice, List<Double> entryPrice, int period) {
		
		double exp = 1d / period;
		System.out.println("Zeitperiode: " + period + " Exponent: " + exp);
		
		// Einstandskurs berechnen
		double sumEntryPrice = 0;
		for (int i = 0; i < entryPrice.size(); i++) {
			sumEntryPrice+=entryPrice.get(i).doubleValue();						
		}
		sumEntryPrice = sumEntryPrice / entryPrice.size();
		
		System.out.println("Einstandskurs: " + sumEntryPrice);		
		System.out.println("Aktueller Kurs: " + currentPrice);
		
		return ((Math.pow(currentPrice / sumEntryPrice , exp)) -1d) * 100d;
		
	}
	
	/**
	 * Gewinnkonstanz
	 * I = 0 damaliger kurs
	 * I = N heutiger kurs
	 * 
	 * @return gewinnkonstanz
	 */
	public double gk(List<Double> prices) {
		
		int count = 0; // Renditesenario
		int positive = 0; // positives Szenario
		
		prices = new ArrayList<>(prices); // ArrayList kopieren, da diese verändert wird
		
		// Äußere Schleife Spalten verrücken und I-1 rechnen
		while(prices.size() >= 2) {
			System.out.println("Schleifengröße: " + prices.size());
			Double yield = 0d;		// Rendite
			Double priceI = 0d;		// Preis Zeitpunkt I
			Double priceIbef = 0d;	// 	preis Zeitpunkt I - 1
			Double orgValue = 100d;	// Ursprünglicher Depotwert
			Double currentValue = 0d;
			
			// Innere Schleife Rendite pro Spalte berechnen
			for(int i = 0; i < prices.size(); i++) {
				System.out.println("I: " + i);
				priceI = prices.get(i); 
				
				if (i == 0) {
					// Depotwert übertragen
					currentValue = orgValue;
					System.out.println("Depotwert: " + currentValue);
					
				} else {
					// Preis I-1 berechnen
					priceIbef = prices.get(i-1);
					System.out.println("Preis I-1: " + priceIbef);
					System.out.println("Preis I  : " + priceI);
					// Kursdifferenz berechnen
					Double diffPercent = (priceI * 100 / priceIbef) - 100;
					System.out.println("Prozentuale Kursdifferenz: " + diffPercent);
					// Depotwert neu berechnen
					currentValue += currentValue * diffPercent / 100d;
					System.out.println("Depotwert: " + currentValue);
					
					// Rendite berechnen (= Gewinn / eingesetztes Kapital)				
					yield = (currentValue - orgValue) / orgValue * 100d;
					System.out.println("Rendite: " + yield);
				
					// Count hochsetzen, da Rendite-Szenario
					count++;
					// positive hochsetzen, fall Rendite positiv
					if (yield >= 0d) { 
						positive++;
					}
						
				}
			}
			// nachbearbeitung : ersten Wert aus Liste entfernen und vorgang wiederholen
			prices.remove(0);
			
		}
		System.out.println("Count: " + count);
		System.out.println("positive: " + positive);
		
		Double gk = (new Double(positive) / new Double(count)) * 100d;
		System.out.println("GK: " + gk);
				
		return gk.doubleValue();
	}
	
	
	/**
	 * Verlustwahrscheinlichkeit
	 * I = 0 damaliger kurs
	 * I = N heutiger kurs
	 * 
	 * @return Verlustwahrscheinlichkeit
	 */
	public double vw(List<Double> prices) {
		
		int count = 0; // Renditesenario
		int negative = 0; // positives Szenario
		
		for(int i = 0; i < prices.size(); i++) {
			if (i == 0) {
				// nichts zu tun	
			} else {
				Double priceI = prices.get(i);		// Preis Zeitpunkt I
				Double priceIbef = prices.get(i-1);	// 	preis Zeitpunkt I - 1
				
				if (priceIbef > priceI) {
					System.out.println("PreisI-1: " + priceIbef + " PreisI: " + priceI);
					negative++;
				}
				count++;
			}
		}
			
		
		System.out.println("Count: " + count);
		System.out.println("Negative: " + negative);
		
		Double vw = new Double(negative) / new Double(count) * 100d;
		System.out.println("Verlustwahrscheinlichkeit: " + vw);
		return vw.doubleValue();
	}
	
	
	
	/**
	 * gewichteter Durchschnittsverlust
	 * I = 0 damaliger kurs
	 * I = N heutiger kurs
	 * 
	 * @return gewichteter Durchschnittsverlust
	 */
	public double gDV(List<Double> prices) {
		
		Double loss = 0d;
		Double months = 0d;
		
		
		for(int i = 0; i < prices.size(); i++) {
			if (i == 0) {
				// nichts zu tun	
			} else {
				Double priceI = prices.get(i);		// Preis Zeitpunkt I
				Double priceIbef = prices.get(i-1);	// 	preis Zeitpunkt I - 1
				
				if (priceIbef > priceI) {
					//Zähler berechnen
					System.out.println("PreisI-1: " + priceIbef + " PreisI: " + priceI);					
					Double ploss = (priceI * 100d / priceIbef) - 100d;
					System.out.println("Verlust: " + ploss + " I: " + i);
					loss += Math.abs(ploss / 100d * i);
					System.out.println("Verlust aufsummiert gewichtet: " + loss + " I: " + i);
					// Nenner hochzählen 
					months += i;
					
				}
			}
		}
			
		
		System.out.println("Zähler: " + loss);
		System.out.println("Nenner: " + months);
		
		Double gDV = loss / months * 100d;
		System.out.println("gewichter Durchschnittsverlust: " + gDV);
		return gDV.doubleValue();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		YieldRiskCalculatorEx yrc = new YieldRiskCalculatorEx();
		
		List<Double> einstand = new ArrayList<Double>();
		einstand.add(60d );
		
		System.out.println(yrc.geoPAK(150, einstand, 10));
		
		/* ********************* */
		
		List<Double> prices = new ArrayList<>();
		prices.add(100d);
		prices.add(105d);
		prices.add(110.25d);
		prices.add(115.7625d);
		prices.add(86.821875d);
		prices.add(43.4109375d);
		
		
		System.out.println("GK: " + yrc.gk(prices));
		
		System.out.println("VW: " + yrc.vw(prices));
		
		System.out.println("gDV: " + yrc.gDV(prices));
		
		
	}
	
	
}
