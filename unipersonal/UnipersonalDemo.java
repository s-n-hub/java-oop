package unipersonal;

/**
 * Übung: Unipersonal (Demo)
 * Erstellt: November 2024
 * Bearbeitet: August 2025
 *
 * Beschreibung:
 * Demonstriert Polymorphie (dynamisches Binden) über ein Person-Array und
 * gezieltes Downcasting für Subtyp-spezifische Informationen.
 *
 * Lernziele:
 * - Polymorphie über Oberklassenreferenzen
 * - Upcasting (implizit) und Downcasting mit instanceof (Pattern Matching)
 *
 * Eigene Erweiterungsideen:
 * - kleine JUnit-Tests
 */

public class UnipersonalDemo {
    public static void main(String[] args) {
        //Testdaten: zwei Studis, eine Dozentin
        Student studi1 = new Student("Sarah", "Schmidt", 2356, "Literatur");
        Student studi2 = new Student("Thomas", "Müller", 82460, "Soziologie");
        Dozent dozent1 = new Dozent("Marie", "Terlau", "Physik", 804);

        //Upcasting: alles als Person behandeln (Polymorphie ohne Casting)
        Person[] personen = {studi1, studi2, dozent1};

        for (Person p : personen) {
            // Polymorphie: zur Laufzeit wird die passende Subtyp-Implementierung aufgerufen
            String text = p.beschreibePerson();

            // Downcasting nur für subtypspezifische Zusatzinfos
            if (p instanceof Student s){
                text += " (Matrikelnummer: " + s.getMatrikelnummer() + ")";
            }
            else if (p instanceof Dozent d){
                text += " (Büronummer: " + d.getBueronummer() + ")";
            }
            System.out.println(text + ".");
        }
    }
}
