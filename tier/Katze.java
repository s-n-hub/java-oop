package tier;

/**
 * Übung: Tier-Package (Unterklasse)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Konkrete Tierart 'Katze' erbt von 'Tier' und überschreibt die abstrakte Methode 'gibLaut()'.
 * Eine einfache Hauptmethode erzeugt zur Demonstration zwei Katzen-Objekte und ruft die
 * zwei Methoden der Klasse auf.
 *
 * Lernziele:
 * - Vererbung und Konstruktorverkettung (super)
 * - Methodenüberschreibung (@Override)
 *
 * Eigene Erweiterungsideen:
 * - Validierung der Werte (kein negatives Alter)
 */

/**
 * Konkrete Tier-Implementierung für Katzen.
 */

public class Katze extends Tier {
    /**
     * Erzeugt eine Katze (und erhöht den Tier-Zähler der Oberklasse)
     * @param name Name der Katze als String
     * @param alter Alter der Katze in Jahren
     */
    public Katze(String name, int alter){
        super(name, alter);
    }

    /**
     * Gibt den Katzenlaut "Miau!" zurück
     * @return Katzenlaut 'Miau!' als String
     */
    @Override
    public String gibLaut(){
        return "Miau!";
    }

    /**
     * Startklasse der Übung zur Demonstration
     */
    public static void main(String[] args) {
        Katze katzeMimi = new Katze("Mimi", 5);
        Katze katzeMumu = new Katze("Mumu", 7);

        System.out.println("Die Katze " + katzeMimi.getName() + " macht " + katzeMimi.gibLaut());
        System.out.println("Die Katze " + katzeMumu.getName() + " macht " + katzeMumu.gibLaut());
        System.out.println("Anzahl der Tiere: " + Tier.getAnzahlTiere());
    }
}
