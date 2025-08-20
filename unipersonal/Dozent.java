package unipersonal;

/**
 * Übung: Unipersonal (Subklasse Dozent)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Subklasse Dozent erbt von 'Person' und hat die zusätzlichen Attribute Fachbereich
 * und Büronummer. Überschreibt beschreibePerson(), um dozentenspezifische Informationen
 * auszugeben.
 *
 * Lernziele:
 * - Abstrakte Klassen und Methoden
 * - Methodenüberschreibung (@Override)
 * - Subtyp-spezifische Attribute
 *
 * Eigene Erweiterungsideen:
 * - Validierung der Eingaben (nicht leer, nicht null, nicht <= 0)
 * - beschreibePerson() mit String.format() formatieren
 */


public class Dozent extends Person {
    private String fachbereich;
    private int bueronummer;

    /**
     * Erzeugt einen Dozenten.
     * @param vorname Vorname des Dozenten
     * @param nachname Nachname des Dozenten
     * @param fachbereich Fachbereich des Dozenten
     * @param bueronummer Büronummer des Dozenten
     */
    public Dozent(String vorname, String nachname, String fachbereich, int bueronummer){
        super(vorname, nachname);
        this.fachbereich = fachbereich;
        this.bueronummer = bueronummer;
    }

    /**
     * Liefert den Fachbereich des Dozenten.
     * @return Fachbereich
     */
    public String getFachbereich() {
        return fachbereich;
    }

    /**
     * Liefert die Büronummer des Dozenten.
     * @return Büronummer
     */
    public int getBueronummer() {
        return bueronummer;
    }

    /**
     * Ändert den Fachbereich des Dozenten.
     * @param fachbereich Fachbereich als String
     */
    public void setFachbereich(String fachbereich) {
        this.fachbereich = fachbereich;
    }

    /**
     * Ändert die Büronummer des Dozenten.
     * @param bueronummer Büronummer als Integer
     */
    public void setBueronummer(int bueronummer) {
        this.bueronummer = bueronummer;
    }

    /**
     * Liefert eine textuelle Beschreibung des Dozenten.
     * @return Beschreibung
     */
    @Override
    public String beschreibePerson(){
        return getGanzerName() + " doziert im Fachbereich " + fachbereich;
    }
}
