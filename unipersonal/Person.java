package unipersonal;

/**
 * Übung: Unipersonal (Basisklasse)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Abstrakte Oberklasse Person mit gemeinsamen Attributen und einer abstrakten
 * Beschreibungs-Methode. Dient als Basistyp für Student und Dozent.
 *
 * Lernziele:
 * - Abstrakte Klassen und Methoden
 * - Gemeinsame Schnittstelle für Subtypen
 * - Sinnvolle Getter/Setter bzw. Immutability
 *
 * Eigene Erweiterungsideen:
 * - Validierung der Eingaben (nicht leer, nicht null)
 * - toString() als Kurzbeschreibung, beschreibePerson() als ausführliche Beschreibung
 */


abstract class Person {
    private final String vorname;
    private final String nachname;

    /**
     * Erzeugt eine Person.
     * @param vorname Vorname der Person
     * @param nachname Nachname der Person
     */
    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    /**
     * Liefert den Vornamen der Person.
     * @return Vorname
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Liefert den Nachnamen der Person.
     * @return Nachname
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * Liefert den vollständigen Namen in der Form "Vorname Nachname".
     * @return voller Name
     */
    public String getGanzerName(){
        return vorname + " " + nachname;
    }

    /**
     * Liefert eine textuelle Beschreibung der Person (Subtyp-spezifisch).
     * @return Beschreibung
     */
    public abstract String beschreibePerson();
}
