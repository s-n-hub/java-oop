package personal;

/**
 * Übung: Personalverwaltung (Basisklasse Mitarbeiter)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Abstrakte Basisklasse für verschiedene Mitarbeitertypen mit gemeinsamen Attributen
 * und einer abstrakten Methode zur Aufgabenbeschreibung. Stellt zudem einen
 * Polymorphie-Hook für die Gesamtkosten bereit.
 *
 * Lernziele:
 * - Abstrakte Klassen und Methoden
 * - Kapselung (private Felder, Getter)
 * - Polymorphie über Überschreibung (getGesamtkosten)
 *
 * Eigene Erweiterungsideen:
 * - Eingabevalidierung im Konstruktor (keine negativen Gehälter, Nullwerte prüfen)
 * - toString() für formatierte Ausgabe
 * - Schnittstelle Bonusfaehig für bonustragende Rollen
 * - Währungsformatierung mit NumberFormat
 */

public abstract class Mitarbeiter {
    private final String vorname;
    private final String nachname;
    private final String abteilung;
    private final double jahresgehalt;

    /**
     * Erzeugt einen Mitarbeiter.
     * @param vorname Vorname
     * @param nachname Nachname
     * @param abteilung Abteilung
     * @param jahresgehalt Jahresgehalt in Euro
     */
    public Mitarbeiter(String vorname, String nachname, String abteilung, double jahresgehalt){
        this.vorname = vorname;
        this.nachname = nachname;
        this.abteilung = abteilung;
        this.jahresgehalt = jahresgehalt;
    }

    /**
     * Liefert eine kurze Aufgabenbeschreibung der Position.
     * @return Aufgabenbeschreibung als String
     */
    public abstract String beschreibePosition();

    /**
     * Gibt die Gesamtkosten für diesen Mitarbeitenden zurück (i.d.R. Jahresgehalt).
     * Subklassen können die Methode überschreiben (z.B. Manager inkl. Bonus).
     * @return jährliche Gesamtkosten für diesen Mitarbeitenden
     */
    public double getGesamtkosten() {
        return jahresgehalt;
    }

    /**
     * Liefert den Vornamen des Mitarbeiters.
     * @return Vorname
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Liefert den Nachnamen des Mitarbeiters.
     * @return Nachname
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * Liefert das Jahresgehalt des Mitarbeiters.
     * @return Jahresgehalt
     */
    public double getJahresgehalt() {
        return jahresgehalt;
    }

    /**
     * Liefert die Abteilung des Mitarbeiters.
     * @return Abteilung
     */
    public String getAbteilung() {
        return abteilung;
    }
}
