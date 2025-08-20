package unipersonal;
/**
 * Übung: Unipersonal (Subklasse Student)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Subklasse Student erbt von 'Person' und hat die zusätzlichen Attribute Matrikelnummer und
 * Studienfach. Überschreibt beschreibePerson(), um studienbezogene Informationen auszugeben.
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

public class Student extends Person{
    private final int matrikelnummer;
    private String studienfach;

    /**
     * Erzeugt einen Studenten.
     * @param vorname Vorname der Person
     * @param nachname Nachname der Person
     * @param matrikelnummer Eindeutige Matrikelnummer (positiv)
     * @param studienfach Studienfach (nicht leer)
     */
    public Student(String vorname, String nachname, int matrikelnummer, String studienfach){
        super(vorname, nachname);
        this.matrikelnummer = matrikelnummer;
        this.studienfach = studienfach;
    }

    /**
     * Liefert das Studienfach des Studenten.
     * @return Studienfach
     */
    public String getStudienfach() {
        return studienfach;
    }

    /**
     * Liefert die Matrikelnummer des Studenten.
     * @return Matrikelnummer
     */
    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    /**
     * Ändert das Studienfach des Studenten.
     * @param studienfach Studienfach
     */
    public void setStudienfach(String studienfach) {
        this.studienfach = studienfach;
    }

    /**
     * Liefert eine textuelle Beschreibung des Studenten.
     * @return Beschreibung
     */
    @Override
    public String beschreibePerson(){
        return getGanzerName() + " studiert " + studienfach;
    }
}
