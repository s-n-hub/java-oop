package personal;

/**
 * Übung: Personalverwaltung (Subklasse Entwickler)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Subklasse von Mitarbeiter ohne zusätzliche Attribute.
 * Implementiert die Positionsbeschreibung für Entwickler.
 *
 * Lernziele:
 * - Einfaches Überschreiben einer abstrakten Methode
 * - Konstruktorverkettung mit super
 *
 * Eigene Erweiterungsideen:
 * - Zusätzliche Attribute wie Programmiersprache, Erfahrungslevel
 */

public class Entwickler extends Mitarbeiter{
    /**
     * Erzeugt einen Entwickler.
     * @param vorname Vorname
     * @param nachname Nachname
     * @param abteilung Abteilung
     * @param jahresgehalt Jahresgehalt
     */
    public Entwickler(String vorname, String nachname, String abteilung, double jahresgehalt){
        super(vorname, nachname, abteilung, jahresgehalt);
    }

    /**
     * Gibt die Aufgabenbeschreibung für die Position Entwickler zurück.
     * @return Beschreibung der typischen Entwickler-Aufgaben
     */
    @Override
    public String beschreibePosition(){
        return "Konzeption, Entwicklung und Wartung von Software";
    }
}
