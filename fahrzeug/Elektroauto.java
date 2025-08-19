package fahrzeug;

/**
 * Übung: Fahrzeug-Package (Unterklasse)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Konkreter Fahrzeugtyp 'Elektroauto' mit zusätzlichem Attribut batteriekapazitaet.
 * Überschreibt die abstrakten Methoden der Oberklasse 'Fahrzeug' und berechnet eine
 * einfache Reichweite über eine Effizienzkonstante.
 *
 * Lernziele:
 * - Vererbung und Konstruktorverkettung (super)
 * - Methodenüberschreibung (@Override)
 * - Einfache Geschäftslogik und lokale Konstanten (final)
 *
 * Eigene Erweiterungsideen:
 * - Einheit der Batteriekapazität dokumentieren (z.B. kWh)
 * - Realistischere Verbrauchsformel (kWh/100 km)
 * - Eingabevalidierung (keine negativen Werte)
 */

/**
 * Konkrete Fahrzeug-Implementierung für Elektrofahrzeuge.
 */
public class Elektroauto extends Fahrzeug{
    // Vereinfachte Modellannahme
    private static final int KM_PRO_KWH = 6;

    // Batteriekapazität in Kilowattstunden (kWh)
    private final int batteriekapazitaet;

    /**
     * Erzeugt ein Elektroauto mit Batteriekapazität.
     * @param marke  Hersteller
     * @param modell Modellbezeichnung
     * @param farbe  Farbe
     * @param batteriekapazitaet Kapazität der Batterie in kWh
     */
    public Elektroauto(String marke, String modell, String farbe, int batteriekapazitaet){
        super(marke, modell, farbe);
        this.batteriekapazitaet = batteriekapazitaet;
    }

    /**
     * Gibt die wichtigsten Fahrzeugdaten als Text zurück.
     * @return Beschreibung des Elektroautos
     */
    @Override
    public String zeigeInformationen(){
        String anzeige = "Marke: " + marke + ", Modell: " + modell + ", Farbe: " + farbe
            + ", Batteriekapazität: " + batteriekapazitaet + " kWh";
        return anzeige;
    }


    /**
     * Berechnet die Reichweite anhand der Effizienz-Konstante.
     * @return Reichweite in Kilometern (km)
     */
    @Override
    public int berechneReichweite(){
        return batteriekapazitaet * KM_PRO_KWH;
    }
}
