package fahrzeug;

/**
 * Übung: Fahrzeug-Package (Basisklasse)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Abstrakte Oberklasse für Fahrzeuge mit gemeinsamen Attributen (marke, modell, farbe)
 * und zwei abstrakten Methoden: zeigeInformationen(), berechneReichweite().
 *
 * Lernziele:
 * - Abstrakte Klassen und Methoden
 * - Sichtbarkeit: protected vs. private
 * - Konstruktoren und Feldinitialisierung
 *
 * Eigene Erweiterungsideen:
 * - Umstellung auf private Felder + Getter/Setter
 * - Gemeinsame Hilfsmethoden (z. B. toString())
 * - Weitere Subtypen (Verbrenner, Hybrid)
 */

/**
 * Abstrakte Basisklasse für Fahrzeuge mit Marke, Modell und Farbe.
 */
abstract class Fahrzeug {
    // Gemeinsame Basisattribute
    protected String marke;
    protected String modell;
    protected String farbe;

    /**
     * Erzeugt ein Fahrzeug mit Marke, Modell und Farbe.
     * @param marke  Hersteller (z. B. "Tesla")
     * @param modell Modellbezeichnung (z. B. "Model S")
     * @param farbe  Farbe (z. B. "schwarz")
     */
    public Fahrzeug(String marke, String modell, String farbe){
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
    }

    /**
     * Liefert eine kurze Beschreibung des Fahrzeugs.
     * @return textuelle Beschreibung
     */
    public abstract String zeigeInformationen();

    /**
     * Berechnet die Reichweite des Fahrzeugs.
     * @return Reichweite in Kilometern (km)
     */
    public abstract int berechneReichweite();
}
