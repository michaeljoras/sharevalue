package net.joras.shares.calc;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.joras.shares.Client;

public class YieldRiskCalculator {

	private static final Logger logger = LogManager.getLogger(YieldRiskCalculator.class);
	
	public YieldRiskCalculator() {}
	
	public double geoPAK(double currentPrice, List<Double> entryPrice, int period) {
		
		double exp = 1d / period;
		logger.debug("Zeitperiode: " + period + " Exponent: " + exp);
		
		// Einstandskurs berechnen
		double sumEntryPrice = 0;
		for (int i = 0; i < entryPrice.size(); i++) {
			sumEntryPrice+=entryPrice.get(i).doubleValue();						
		}
		sumEntryPrice = sumEntryPrice / entryPrice.size();
		
		logger.debug("Einstandskurs: " + sumEntryPrice);		
		logger.debug("Aktueller Kurs: " + currentPrice);
		
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
			logger.debug("Schleifengröße: " + prices.size());
			Double yield = 0d;		// Rendite
			Double priceI = 0d;		// Preis Zeitpunkt I
			Double priceIbef = 0d;	// 	preis Zeitpunkt I - 1
			Double orgValue = 100d;	// Ursprünglicher Depotwert
			Double currentValue = 0d;
			
			// Innere Schleife Rendite pro Spalte berechnen
			for(int i = 0; i < prices.size(); i++) {
				logger.debug("I: " + i);
				priceI = prices.get(i); 
				
				if (i == 0) {
					// Depotwert übertragen
					currentValue = orgValue;
					logger.debug("Depotwert: " + currentValue);
					
				} else {
					// Preis I-1 berechnen
					priceIbef = prices.get(i-1);
					logger.debug("Preis I-1: " + priceIbef);
					logger.debug("Preis I  : " + priceI);
					// Kursdifferenz berechnen
					Double diffPercent = (priceI * 100 / priceIbef) - 100;
					logger.debug("Prozentuale Kursdifferenz: " + diffPercent);
					// Depotwert neu berechnen
					currentValue += currentValue * diffPercent / 100d;
					logger.debug("Depotwert: " + currentValue);
					
					// Rendite berechnen (= Gewinn / eingesetztes Kapital)				
					yield = (currentValue - orgValue) / orgValue * 100d;
					logger.debug("Rendite: " + yield);
				
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
		logger.debug("Count: " + count);
		logger.debug("positive: " + positive);
		
		Double gk = (new Double(positive) / new Double(count)) * 100d;
		logger.debug("GK: " + gk);
				
		return gk.doubleValue();
	}
	
	/**
	 * PA-Gewinn
	 * @param geopak
	 * @param gk
	 * @return
	 */
	public double payield(double geopak, double gk) {
		
		if (geopak >= 0) { // PA-Gewinn bei positiver Rendite rechnen	
			return geopak * gk / 100d;
		} else {// PA-Gewinn bei positiver Rendite rechnen
			return geopak / gk * 100d;
		}
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
					logger.debug("PreisI-1: " + priceIbef + " PreisI: " + priceI);
					negative++;
				}
				count++;
			}
		}
			
		
		logger.debug("Count: " + count);
		logger.debug("Negative: " + negative);
		
		Double vw = new Double(negative) / new Double(count) * 100d;
		logger.debug("Verlustwahrscheinlichkeit: " + vw);
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
					logger.debug("PreisI-1: " + priceIbef + " PreisI: " + priceI);					
					Double ploss = (priceI * 100d / priceIbef) - 100d;
					logger.debug("Verlust: " + ploss + " I: " + i);
					loss += Math.abs(ploss / 100d * i);
					logger.debug("Verlust aufsummiert gewichtet: " + loss + " I: " + i);
					// Nenner hochzählen 
					months += i;
					
				}
			}
		}
			
		
		logger.debug("Zähler: " + loss);
		logger.debug("Nenner: " + months);
		
		Double gDV = loss / months * 100d;
		logger.debug("gewichter Durchschnittsverlust: " + gDV);
		return gDV.doubleValue();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		YieldRiskCalculator yrc = new YieldRiskCalculator();
		
		List<Double> einstand = new ArrayList<Double>();
		einstand.add(60d );
		
		logger.debug(yrc.geoPAK(150, einstand, 10));
		
		/* ********************* */
		
		List<Double> prices = new ArrayList<>();
		prices.add(100d);
		prices.add(105d);
		prices.add(110.25d);
		prices.add(115.7625d);
		prices.add(86.821875d);
		prices.add(43.4109375d);
		
		
		logger.debug("GK: " + yrc.gk(prices));
		
		logger.debug("VW: " + yrc.vw(prices));
		
		logger.debug("gDV: " + yrc.gDV(prices));
		
		
	}
	
	
}
