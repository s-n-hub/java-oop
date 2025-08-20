package tier;

/**
 * Übung: Tier-Package (Basisklasse)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Abstrakte Oberklasse für verschiedene Tierarten mit gemeinsamen Attributen
 * (name, alter) und einer Zählvariable für die Anzahl an Tier-Objekten.
 * Eine abstrakte Methode gibLaut() und eine statische Methode getAnzahlTiere().
 *
 * Lernziele:
 * - Abstrakte Klassen und Methoden
 * - Sichtbarkeit mit public, protected, private
 * - Konstruktoren und Feldinitialisierung
 * - statische Klassenmitglieder als Zähler über Subklassen hinweg
 *
 * Eigene Erweiterungsideen:
 * - 'alter' mittels Geburtstag und aktuellem Datum dynamisch aktuell halten
 * - Gemeinsame Hilfsmethoden (z.B. toString())
 * - Weitere Subtypen (Hund, Fisch, Maus)
 */

/**
 * Abstrakte Basisklasse für Tierarten mit Name und Alter.
 *  Zählt die Gesamtzahl aller erzeugten Tier-Instanzen.
 */
public abstract class Tier {
    // gemeinsame Basisattribute
    private final String name;
    private int alter;

    // statische Variable zum Zählen aller Tier-Objekte
    private static int anzahlTiere = 0;

    /**
     * Erzeugt ein Tier mit Name und Alter und erhöht die Klassenvariable 'anzahlTiere'.
     * @param name Eigenname des Tieres (z.B. "Flipper")
     * @param alter Alter des Tieres in Jahren
     */
    protected Tier(String name, int alter){
        this.name = name;
        this.alter = alter;
        Tier.anzahlTiere++;
    }

    /**
     * Gibt den Namen des Tieres zurück.
     * @return Name des Tieres
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt das Alter des Tieres zurück.
     * @return Alter des Tieres.
     */
    public int getAlter() {
        return alter;
    }

    /**
     * Setzt einen neuen Wert für das Alter des Tieres.
     * @param alter Alter des Tieres
     */
    public void setAlter(int alter) {
        this.alter = alter;
    }

    /**
     * Gibt den artenspezifischen Laut zurück
     * @return Tierlaut als String
     */
    public abstract String gibLaut();

    /**
     * Liefert die Gesamtzahl aller erzeugten Tier-Objekte
     * @return Anzahl aller Tiere
     */
    public static int getAnzahlTiere(){
        return anzahlTiere;
    }
}