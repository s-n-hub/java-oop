/**
 * Übung: Auto-Klasse
 * Erstellt: November 2024
 * Bearbeitet: Juni 2025
 *
 * Beschreibung:
 * In dieser Übung wird eine Klasse Auto mit Attributen wie Marke, Modell,
 * Baujahr und Kilometerstand erstellt. Die Methode berechnet das Alter des Autos
 * anhand eines festen Referenzjahrs (2024).
 *
 * Lernziele:
 * - Definition und Verwendung eigener Klassen
 * - Konstruktor mit Parametern
 * - Berechnung anhand von Attributwerten
 *
 * Eigene Erweiterungsideen:
 * - Dynamische Altersberechnung mit `LocalDate.now().getYear()`
 * - Methode zur Bewertung des Kilometerstands
 * - Vergleichsmethode für zwei Autos (z.B. welches älter ist)
 */

public class Auto {

    private String marke;
    private String modell;
    private int baujahr;
    private int kmstand;

    /**
     * Konstruktor zur Initialisierung aller Attribute eines Autos.
     * @param marke Marke des Autos (z.B. BMW)
     * @param modell Modellbezeichnung (z.B. 320i)
     * @param baujahr Baujahr des Autos
     * @param kmstand Aktueller Kilometerstand in Kilometern
     */
    public Auto(String marke, String modell, int baujahr, int kmstand){
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmstand = kmstand;
    }

    /**
     * Berechnet das Alter des Autos basierend auf einem festen Bezugsjahr.
     * @return Alter in Jahren
     */
    public int berechneAlterInJahren(){
        return 2024 - this.baujahr;
    }

    /**
     * Hauptmethode: Erstellt zwei Auto-Objekte und gibt deren Alter aus.
     */
    public static void main(String[] args) {
        Auto a1 = new Auto("BMW", "320i", 1976, 215000);
        Auto a2 = new Auto("VW", "Golf 6", 2009, 134500);

        System.out.println("Alter von Auto 1: " + a1.berechneAlterInJahren() + " Jahre");
        System.out.println("Alter von Auto 2: " + a2.berechneAlterInJahren() + " Jahre");
    }
}
